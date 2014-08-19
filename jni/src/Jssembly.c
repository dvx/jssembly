#include "com_polyfx_jssembly_Jssembly.h"
#include <stdio.h>
#include <string.h>
#if defined _WIN64 || defined _WIN32
#include <Windows.h>
#elif defined __linux || __unix || __posix || __APPLE__
#include <sys/mman.h>
#endif

// function pointer typedef
#ifdef __cplusplus 
typedef void* (*_JIT_METHOD) (...);
#else /* not __cplusplus */
typedef (*_JIT_METHOD) ();
#endif

void* compile(unsigned char* assembly, int length) {
	char *buffer = NULL;
#if defined _WIN64 || defined _WIN32
	buffer = (char*)malloc(length);
	memcpy(buffer, assembly, length);
	DWORD oldProtect = (DWORD)NULL;
	// set memory permissions and flush CPU code cache
	VirtualProtect(buffer, length, PAGE_EXECUTE_READWRITE, &oldProtect);
	FlushInstructionCache(GetCurrentProcess(), buffer, length);
#elif defined __linux || __unix || __posix || __APPLE__
	// use mmap on *NIX in lieu of malloc (so we can do memory permissions)
	buffer = (char *)mmap(NULL, length, PROT_READ | PROT_WRITE | PROT_EXEC, MAP_PRIVATE | MAP_ANONYMOUS, 0, 0);
	memcpy(buffer, assembly, length);
	// set memory permissions and flush CPU code cache
	mprotect(buffer, length, PROT_READ | PROT_WRITE | PROT_EXEC);
	// TODO: flush cache
#endif
	return buffer;
}

JNIEXPORT void JNICALL Java_com_polyfx_jssembly_Jssembly_invoke(JNIEnv *env, jobject thiz, jbyteArray assm, jobjectArray args) {
	// debugging purposes
	//setvbuf(stdout, NULL, _IONBF, 0);

	int len = (*env)->GetArrayLength(env, assm);
	unsigned char *bin = (*env)->GetByteArrayElements(env, assm, NULL);
	_JIT_METHOD func = (_JIT_METHOD)compile(bin, len);

	// run compiled function (from wherever *func is pointing to)
	printf("%d\n", func(args));

#if defined _WIN64 || defined _WIN32
	free(func);
#elif defined __linux || __unix || __posix || __APPLE__
	munmap(func, len);
#endif
}