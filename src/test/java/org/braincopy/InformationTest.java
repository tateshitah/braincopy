package org.braincopy;

import junit.framework.TestCase;

public class InformationTest extends TestCase {

	public void testInformationStringLocation() {
		Information information = new Information("test", new Location(0, 0));
		assertNotNull(information);
	}

	public void testInformationString() {
		Information information = new Information("test");
		assertNotNull(information);
	}

}
