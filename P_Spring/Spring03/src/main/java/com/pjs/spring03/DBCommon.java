package com.pjs.spring03;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.sqlite.SQLiteConfig;

public class DBCommon <T>{
	private String dbFileName;
	private String tableName;
	private Connection connection;
	private ArrayList<T> dataList;
	
	
	public DBCommon(String dbFileName, String tableName) {
		this.dbFileName= dbFileName;
		this.tableName = tableName;
	}
	
	private void open() {
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			this.connection = DriverManager.getConnection("jdbc:sqlite:/"+this.dbFileName, config.toProperties());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void close() {
		if(this.connection != null) {		// 꼭 체크하자
			try{
				this.connection.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		this.connection = null;
	}
	
	// C R E A T E 
	public void createTable(T t) {
		try {
			Class<?> dataClass = t.getClass();
//			Class<?> dataClass = Class.forName("com.pjs.spring03.Student");
			Field[] dataClassFields = dataClass.getDeclaredFields();
			String query = "";
			for(Field field : dataClassFields) {
				if (!query.isEmpty()) {
					query = query + ",";
				} 
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if(fieldName.matches("idx") && fieldType.matches("int")) {
					query = query + fieldName + " INTEGER PRIMARY KEY AUTOINCREMENT";
				} else if (fieldType.matches("int")) {
					query = query + fieldName + " INTEGER";
				}else if (fieldType.matches("double|float")) {
					query = query + fieldName + " REAL";
				} else if (fieldType.matches(".*String")) {
					query = query + fieldName + " TEXT";
				}
			}
			if (this.connection == null) {
				this.open();
			}
			query = "CREATE TABLE "+ this.tableName +"("+ query +");";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	// S E L C T
	public void selectData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			this.dataList = new ArrayList<T>();
			String query = "SELECT * FROM " + this.tableName + " WHERE ?;";
			PreparedStatement preparedStatement = this.connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				T fieldData = (T) dataClass.newInstance();
				for(Field field : dataClassFields) {
					String fieldType = field.getType().toString();
					String fieldName = field.getName();
					field.set(fieldData, field.get(t));
					resultSet.getString(fieldName);
				}
				this.dataList.add(fieldData);
			}
			
			if (this.connection == null) {
				this.open();
			}
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	// I N S E R T 
	public void insertData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			String fieldString = "";
			String valueString = "";
			for(Field field : dataClassFields) {
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (!fieldString.isEmpty()) {
					fieldString = fieldString + ",";
				} 
				if(fieldName.matches("idx")) {
					continue;
				}
				fieldString = fieldString + fieldName;
				if(!valueString.isEmpty()) {
					valueString = valueString + ",";
				}
				if (fieldType.matches(".*String")) {
					valueString = valueString + "'" + field.get(t) + "'";
				} else {
					valueString = valueString + field.get(t);
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "INSERT INTO " + this.tableName + "(" + fieldString + ") VALUES(" + valueString + ");";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	// U P D A T E 
	public void updateData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			String queryString = "";
			int whereIdx = -1;
			
			for(Field field : dataClassFields) {
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if (!queryString.isEmpty()) {
					queryString = queryString + ",";
				} 
				if(fieldName.matches("idx")) {
					whereIdx = (Integer) field.get(t);
					continue;
				}
				if (fieldType.matches(".*String")) {
					queryString = queryString + fieldName + "='" + field.get(t) + "'";
				} else {
					queryString = queryString + fieldName + "=" + field.get(t);
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "UPDATE " + this.tableName + " SET " + queryString + " WHERE idx=" + whereIdx + ";";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	// D E L E T E 
	public void deleteData(T t) {
		try {
			Class<?> dataClass = t.getClass();
			Field[] dataClassFields = dataClass.getDeclaredFields();
			int whereIdx = -1;
			for(Field field : dataClassFields) {
				String fieldType = field.getType().toString();
				String fieldName = field.getName();
				if(fieldName.matches("idx")) {
					whereIdx = (Integer) field.get(t);
					continue;
				}
			}
			if (this.connection == null) {
				this.open();
			}
			String query = "DELETE FROM " + this.tableName + " WHERE idx=" + whereIdx + ";";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.close();
		}
	}
	
	
	
	
	
	
	
	
}
