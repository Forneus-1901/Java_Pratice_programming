package test;

import java.sql.*;
import java.util.Scanner;

public class jdbc_connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms?characterEncoding=utf8","root","password");
			System.out.println("Connected");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer");
			
			
			while(rs.next()) {
				System.out.println(rs.getString("cus_address"));	
			}
			con.close();
//			String query_coustmer="insert into customer (cus_name,cus_phone_no,cus_address) values('aditya',9970507646,'new raut wadi')";
//			stmt.execute(query_coustmer);
//			con.close();
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
