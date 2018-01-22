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

/**
 * Link is a class to connect the objects of {@link Information}. This object
 * connect from source information to target information.
 * 
 * @author Hiroaki Tateshita
 *
 */
public class Link implements Comparable<Link> {

	/**
	 * is a name of the link
	 */
	protected String name;

	/**
	 * is the start point of this link.
	 */
	protected Information source;

	/**
	 * is the end point of this link.
	 */
	protected Information target;

	/**
	 * constructs a link object with source information (start point) and target
	 * information (end point)
	 * 
	 * @param _name
	 *            is the name of this link object
	 * @param _source
	 *            is the source information
	 * @param _target
	 *            is the target information
	 */
	public Link(String _name, Information _source, Information _target) {
		super();
		this.name = _name;
		this.source = _source;
		this.target = _target;
	}

	/**
	 * {@link String#compareTo(String)}
	 */
	public int compareTo(Link o) {
		return this.name.compareTo(o.name);
	}

	/**
	 * @return the name of this link object
	 */
	public String toString() {
		return this.name;
	}

	/**
	 * 
	 * @return the name of this link object
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @return the source information object
	 */
	public Information getSource() {
		return this.source;
	}

	/**
	 * 
	 * @return the target information object
	 */
	public Information getTarget() {
		return this.target;
	}

	/**
	 * 
	 * @return the name of the source information object
	 */
	public String getSourceName() {
		return this.source.getName();
	}

	/**
	 * 
	 * @return the name of the target information object
	 */
	public String getTargetName() {
		return this.target.getName();
	}
}
