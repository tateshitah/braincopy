/*

Copyright (c) 2017-2018 Hiroaki Tateshita

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

import java.util.ArrayList;
import java.util.List;

/**
 * is a class to abstract any information in the world.
 * 
 * @author Hiroaki Tateshita
 */
public class Information implements Comparable<Information> {

	/**
	 * is a field to identify this information object. it is usually same with
	 * {@link Information#name}
	 */
	protected String id;

	/**
	 * is a name to identify this information object. it is usually same with
	 * {@link Information#id}
	 */
	protected String name;

	/**
	 * is supposed to be the overview of this information
	 */
	protected String description;

	/**
	 * is supposed to be a location strongly related to this information
	 */
	protected Location location;

	/**
	 * is a collection of files attached to this information, including picture
	 * files.
	 */
	protected List<File> fileList;

	/**
	 * is a file of picture. in the future, this field will be deleted.
	 * 
	 * @deprecated replaced by {@link #fileList}
	 */
	protected Picture picture;

	/**
	 * constructs this object with its name and location
	 * 
	 * @param _name
	 *            not {@code null}
	 * @param _location
	 */
	public Information(String _name, Location _location) {
		this.id = _name;
		this.name = _name;
		this.location = _location;
		this.description = null;
	}

	/**
	 * constructs this object with its name
	 * 
	 * @param _name
	 *            not {@code null}
	 */
	public Information(String _name) {
		this.id = _name;
		this.name = _name;
		this.location = null;
		this.description = null;
	}

	/**
	 * compare with this {@link #id}
	 */
	public int compareTo(Information o) {
		return this.id.compareTo(o.id);
	}

	/**
	 * returns the name of this object.
	 * 
	 * @return name not {@code null}
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * returns the name of this object.
	 */
	public String toString() {
		return this.name;
	}

	/**
	 * returns the location object owned by this Information object.
	 * 
	 * @return location. returns {@code null} if this {@link Information} object
	 *         does not have location.
	 */
	public Location getLocation() {
		return this.location;
	}

	/**
	 * provide a picture object owned by this {@link Information} object. If this
	 * {@link Information} object does not have any {@link Picture} object, this
	 * method will return null. If this {@link Information} object has more than two
	 * {@link Picture} objects, this method returns the first added Picture object.
	 * 
	 * @return picture object. returns {@code null} if this Information object does
	 *         not have a Picture object
	 */
	public Picture getPicture() {
		Picture result = null;
		if (this.fileList != null) {
			for (File file : this.fileList) {
				if (file instanceof Picture) {
					result = (Picture) file;
					break;
				}
			}
		}

		// return this.picture;
		return result;
	}

	/**
	 * adds an object of Picture class.
	 * 
	 * @param _picture
	 *            not {@code null}
	 */
	public void setPicture(Picture _picture) {
		if (this.fileList == null) {
			this.fileList = new ArrayList<File>();
		}
		this.fileList.add(_picture);
		// this.picture = _picture;
	}
}
