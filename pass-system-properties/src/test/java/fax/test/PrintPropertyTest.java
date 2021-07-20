/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package fax.test;

import org.junit.Test;

public class PrintPropertyTest {

	@Test
	public void msg_add_test() {
		String msg = System.getProperty("oracle.jdbc.timezoneAsRegion");
		System.out.println( "oracle.jdbc.timezoneAsRegion is " + msg );
	}
}
