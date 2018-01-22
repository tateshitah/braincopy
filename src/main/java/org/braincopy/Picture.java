/*

Copyright (c) 2018 Hiroaki Tateshita

Permission is hereby granted, free of charge, to any person obtaining a copy 
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
copies of the Software, and to permit persons to whom the Software is furnished
to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all 
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

 */

package org.braincopy;

/**
 * is a class to abstract picture files such as jpg, png, and gif.
 * 
 * @author Hiroaki Tateshita
 *
 */
public class Picture extends File {

	/**
	 * construct a new Picture object. Currently Braincopy library use "jpg", "png",
	 * "gif", "jpeg" as file extension of Picture files. So when other extensions
	 * such as xcf cannot be used as picture file, this object should throw
	 * exception.
	 * 
	 * @param _fileName
	 *            { "jpg", "png", "gif", "jpeg" }
	 * @throws IllegalFileNameException
	 *             is thrown if the file name is not picture's name.
	 */
	public Picture(String _fileName) throws IllegalFileNameException {
		if (Picture.isPictureFileName(_fileName)) {
			this.fileName = _fileName;
		} else {
			throw new IllegalFileNameException("File name seems not to be picture file. -> " + _fileName);
		}
	}

	/**
	 * checks the filename of picture files correct or not. Currently Braincopy
	 * library use "jpg", "png", "gif", "jpeg" as file extension of Picture files.]
	 * 
	 * @param fileName
	 *            is the name of file which you may want to check.
	 * @return {@code true} if this {@code fileName} has the extension of picture
	 *         file such as "jpg" and "gif", {@code false} otherwise
	 */
	public static boolean isPictureFileName(String fileName) {
		boolean result = false;
		String[] suffixes = { "jpg", "png", "gif", "jpeg" };
		for (String suffix : suffixes) {
			if (fileName.toUpperCase().endsWith(suffix.toUpperCase())) {
				result = true;
				break;
			}
		}
		return result;
	}

}
