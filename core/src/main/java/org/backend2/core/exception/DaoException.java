package org.backend2.core.exception;

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;
	private final Throwable source;

	/**
	 * Default constructor or DAO exception
	 */
	public DaoException() {
		super();
		source = this;
	}

	/**
	 * Constructs a new DAO exception with the specified detail message.
	 * 
	 * @param message
	 *            the detail exception message
	 */
	public DaoException(String message) {
		super(message);
		source = this;
	}

	/**
	 * Constructs a new exception with the specified throwable error
	 * 
	 * @param cause
	 *            the cause of error
	 */
	public DaoException(Throwable cause) {
		super(cause);
		if (cause instanceof DaoException) {
			source = ((DaoException) cause).getSource();
		} else {
			source = cause;
		}
	}

	/**
	 * Constructs a new exception with the specified detail message and cause.
	 * 
	 * @param message
	 *            the detail exception message
	 * @param cause
	 *            the cause of error
	 */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
		if (cause instanceof DaoException) {
			source = ((DaoException) cause).getSource();
		} else {
			source = cause;
		}
	}

	/**
	 * Source of original exception
	 * 
	 * @return original error that generate this DAO exception
	 */
	public Throwable getSource() {
		return source;
	}
}
