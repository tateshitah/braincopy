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

import java.util.List;

/**
 * Information is a class to abstract any information in the world.
 * 
 * @author Hiroaki Tateshita
 */
public class Information implements Comparable<Information> {

	protected String id;
	protected String name;
	protected String description;
	protected Location location;
	protected List<File> fileList;
	protected Picture picture;

	public Information(String _name, Location _location) {
		this.id = _name;
		this.name = _name;
		this.location = _location;
		this.picture = null;
		this.description = null;
	}

	public Information(String _name) {
		this.id = _name;
		this.name = _name;
		this.location = null;
		this.picture = null;
		this.description = null;
	}

	public int compareTo(Information o) {
		return this.id.compareTo(o.id);
	}

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.name;
	}

	public Location getLocation() {
		return this.location;
	}

	public Picture getPicture() {
		return this.picture;
	}

	public void setPicture(Picture _picture) {
		this.picture = _picture;
	}
}
