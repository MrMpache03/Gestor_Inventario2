package Gestion_inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String host = "jdbc:mysql://localhost:3306/store_db";
	private static final String usuario = "root";
	private static final String contraseña = "1234";

	private static Connection connection = null;

	private DatabaseConnection() {
	}

	public static Connection getConnection() throws SQLException {
		if (connection == null || connection.isClosed()) {
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(host, usuario, contraseña);
				System.out.println("Conexión a MYSQL exitosa");
			} catch (ClassNotFoundException e) {
				System.out.println("Error: Driver JDBC no encontrada");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("Error al conectar a la SQL");
				throw e;
			}
		}
		return connection;
	}

}
