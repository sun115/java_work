package com.pjs.spring01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class DataReader {
	private Connection connection;
	private String dbFileName;
	private String dbTableName;
	static {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DataReader(String databaseFileName, String dbTableName) {
		this.dbFileName = databaseFileName;
		this.dbTableName = dbTableName;
	}

	public boolean open() {
		try {
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection("jdbc:sqlite:/" + this.dbFileName, config.toProperties());
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean close() {
		if (this.connection == null) {
			return true;
		}
		try {
			this.connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public int createTable() throws Exception {
		if (this.connection == null) {
			throw new Exception("DB is not open");
		}
		String query = "CREATE TABLE " + this.dbTableName + "(idx INTEGER PRIMARY KEY  AUTOINCREMENT, name TEXT, middle_score INT, final_score INT);";
		Statement statement = this.connection.createStatement();
		int result = statement.executeUpdate(query);
		statement.close();
		return result;
	}
	
	public int insertData(String name, int middle_score, int final_score) throws SQLException {
		String query = "INSERT INTO " + this.dbTableName + "(name, middle_score, final_score) VALUES('" +name+ "'," +middle_score+","+final_score+");";
		Statement statement = this.connection.createStatement();
		int result = statement.executeUpdate(query);
		statement.close();
		return result;
	}
	
//	public int updateData(String name, int middle_score, int final_score) throws SQLException {
//		String query = "UPDATE TABLE " + this.dbTableName + "(name, middle_score, final_score) VALUES('" +name+ "'," +middle_score+","+final_score+");";
//		Statement statement = this.connection.createStatement();
//		int result = statement.executeUpdate(query);
//		statement.close();
//		return result;
//	}
	
	public String selectData() throws SQLException {
		String query = "SELECT * FROM " + this.dbTableName + " WHERE ?;";
		// �� ���� ������ ����Ǵ� ����.
		PreparedStatement preparedStatement = this.connection.prepareStatement(query);
		preparedStatement.setInt(1, 1);
		// resultSet= ���̺� ��ü (Ư���� ���� ���õ�.)
		ResultSet resultSet = preparedStatement.executeQuery();
		String listString = "";
		// while���� ���鼭 �� �྿ ���̺��� ���Ե�. (���� Ŀ��(row) ��ġ�� �����͸� �о����)
		// => while���� ���鼭 next row�� �����ϰ�, ���õ� ���� field���� �о��
		while (resultSet.next()) {
			listString = listString + "<tr>";
			listString = listString + "<td>";
			listString = listString + resultSet.getString("idx");
			listString = listString + "</td>";
			listString = listString + "<td>";
			listString = listString + resultSet.getString("name");
			listString = listString + "</td>";
			listString = listString + "<td>";
			listString = listString + resultSet.getString("middle_score");
			listString = listString + "</td>";
			listString = listString + "<td>";
			listString = listString + resultSet.getString("final_score");
			listString = listString + "</td>";
			listString = listString + "</tr>";
		}
		resultSet.close();
		// resultSet �о���� ��
		preparedStatement.close();
		// ���� ���� ��
		return listString;
	}

}