/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package fax.open;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FaxServiceTest {

	private final FaxService testTarget = new FaxService();

	@Test
	public void generate() {
		assertThat( testTarget.generate( 8 ) ).isEqualTo( "classic fixed message" );
	}

}
