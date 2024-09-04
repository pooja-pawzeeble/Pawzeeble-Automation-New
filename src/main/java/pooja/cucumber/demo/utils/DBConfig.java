package pooja.cucumber.demo.utils;

import lombok.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class DBConfig {

	private final String propertyFilePath = "db.properties";
	private String dbHostname;
	private String dbUsername;
	private String dbPassword;
	private String dbName;

	public DBConfig() throws IOException {
		this.dbHostname = ConfigReader.getProperty(propertyFilePath, "db.hostname");
		this.dbUsername = ConfigReader.getProperty(propertyFilePath, "db.username");
		this.dbPassword = ConfigReader.getProperty(propertyFilePath, "db.password");
		this.dbName = ConfigReader.getProperty(propertyFilePath, "db.name");
	}

	// Write code to return DB connection object
	public Connection connect() {
		try {
			String url = "jdbc:postgresql://" + dbHostname + "/" + dbName;
			Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
			return conn;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public ResultSet fetchData(PreparedStatement pstmt) {
		try {
			ResultSet rs = null;			
			rs = pstmt.executeQuery();
			return rs;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
