/*
 * Hibernate Search, full-text search for your domain model
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package fax.open;

public class OpenDiscussion {

	private final String topic;

	public OpenDiscussion(String topic) {
		this.topic = topic;
	}

	public String topic() {
		return topic;
	}
}
