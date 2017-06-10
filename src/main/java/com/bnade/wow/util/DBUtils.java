package com.bnade.wow.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DBUtils {
	
	private static String configFile = "jdbc.properties";
	private static DataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {
			try {
				dataSource = DruidDataSourceFactory.createDataSource(loadPropertyFile(configFile));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dataSource;
	}

	private static Properties loadPropertyFile(String fileName) {
		Properties p = null;
		InputStream is = null;
		// 如果在classpath目录中存在dev目录，则使用dev中的配置文件
		if (new File(DBUtils.class.getClassLoader().getResource("").getFile() + "dev").exists()) {
			is = DBUtils.class.getClassLoader().getResourceAsStream("dev/" + fileName);
		} else {
			is = DBUtils.class.getClassLoader().getResourceAsStream(fileName);	
		}
		try {
			if (is == null) {
				is = new FileInputStream(fileName);
			}
			if (is != null) {
				p = new Properties();
				p.load(is);
			}
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("Properties file not found: " + fileName);
		} catch (IOException e) {
			throw new IllegalArgumentException("Properties file can not be loading: " + fileName);
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return p;
	}
	
	public static boolean isTableExist(String tableName) throws SQLException {
		boolean isTableExist = false;
		
		try (Connection con = DBUtils.getDataSource().getConnection();) {
			DatabaseMetaData  dbMeta = con.getMetaData();
			ResultSet rs = dbMeta.getTables(null, null, tableName, new String[]{"TABLE"});
			if (rs.next()) {			
				isTableExist = true;
			} else {
				isTableExist = false;
			}
		}	
		return isTableExist;
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(DBUtils.getDataSource().getConnection() == null);
	}
}
