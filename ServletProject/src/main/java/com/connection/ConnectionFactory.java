package com.connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionFactory {
	
	public static Connection getDBConnection()
	{
		
		Connection conn=null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dsnString="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(dsnString, "java", "interface");
			//System.out.println(conn);
			
		} catch (Exception e) {
			System.out.println("Coonection::"+e.getMessage());
		}
			
		return conn;
			
	}
	
	public static void closeConnection(ResultSet rs, CallableStatement cstmt, Connection conn) {
		
		try {
			if(rs!=null) {
				rs.close();
				rs=null;
			}
			
		} catch (Exception e) {
			System.out.println("exception in closing result: "+e.getMessage());
		}
		
		
		
		try {
			if(cstmt!=null) {
				cstmt.close();
				cstmt=null;
			}
			
		} catch (Exception e) {
			System.out.println("exception in closing result: "+e.getMessage());
		}
		
		
		try {
			if(conn!=null) {
				conn.close();
				conn =null;
			}
			
		} catch (Exception e) {
			System.out.println("exception in closing result: "+e.getMessage());
		}
		
		
		
	}
	
	
	public static void main(String ss[])
	{
		getDBConnection();
	}

}
