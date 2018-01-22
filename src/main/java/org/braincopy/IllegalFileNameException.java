package org.braincopy;

/**
 * is an exception class which will be thrown when illegal file would be set on
 * an {@link Information} object.
 * 
 * @author Hiroaki Tateshita
 *
 */
public class IllegalFileNameException extends Exception {

	/**
	 * construct a new exception with a message.
	 * 
	 * @param message
	 *            detail message.
	 */
	public IllegalFileNameException(String message) {
		super(message);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
