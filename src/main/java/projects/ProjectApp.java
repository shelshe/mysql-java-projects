/**
 * 
 */
package projects;

import projects.dao.DbConnection;

/**
 * @author corra
 *
 */
public class ProjectApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 DbConnection.getConnection();

	}

}
