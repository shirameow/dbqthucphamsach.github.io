package vn.banhang.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import vn.banhang.connection.DBConnect;

public class DBConnect {
	private final String serverName = "remotemysql.com";
	private final String dbName = "dIHWoghvdu";
	private final String portNumber = "3306";
	private final String instance = "";// MSSQLSERVER LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
	private final String userID = "dIHWoghvdu";
	private final String password = "H9qJTco3Ru";

	public Connection getConnection() throws Exception {
	/*	String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	*/
		String url = "jdbc:mysql://" + serverName + "\\" + instance + "/" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName;
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(url, userID, password);
	}

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnect().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
