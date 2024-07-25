package com.cms.daoImplements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
		
	static Connection con;
//	may have the doubt of using private static even we are using in same class
//	instance members can't be accessible under static method .
//	so make members as static
	private static String user = "root";
	private static String password = "root";
	private static String url = "jdbc:mysql://localhost:3306/sunbase";
	
	public static Connection getConnection() throws SQLException {
//		to reduce the number of connections in connection pool
		if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {
                throw new SQLException(e.getMessage());
            }
        }
        return con;
		
	}
	
}
