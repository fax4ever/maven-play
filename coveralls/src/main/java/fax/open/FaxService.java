/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package fax.open;

import org.hibernate.search.mapper.pojo.route.impl.DocumentRouteDescriptorDto;

public class FaxService {

	public String generate(int seed) {
		DocumentRouteDescriptorDto build = DocumentRouteDescriptorDto.newBuilder()
				.setRoutingKey( "ciao" )
				.build();

		if ( seed % 1 == 0 ) {
			return "classic fixed message";
		}
		return "alternative fixed message";
	}

}
