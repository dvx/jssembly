package com.polyfx.jssembly;

public class JssemblyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public JssemblyException(String message) {
        super(message);
    }

    public JssemblyException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
