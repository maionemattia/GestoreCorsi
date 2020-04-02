package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	static Connection getConnection() throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?user=root&password=Polito2021";
				return DriverManager.getConnection(jdbcURL);
	}
	
//	private static final String jdbcURL = "jdbc:mysql://localhost/iscritticorsi";
//	private static HikariDataSource ds;
//	
//	public static Connection getConnection() {
//		if(ds == null) {
//			HikariConfig config = new HikariConfig();
//			config.setJdbcUrl(jdbcURL);
//			config.setUsername("root");
//			config.setPassword("Polito2021");
//			
//			config.addDataSourceProperty("cachePrepStmts", true);
//			config.addDataSourceProperty("prepStmtCacheSize", 250);
//			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
//			
//			ds = new HikariDataSource(config);
//		}
//		try {
//			return ds.getConnection();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.err.println("Errore di connessione ad DB");
//			throw new RuntimeException(e);
//		}
//	}
			

}
