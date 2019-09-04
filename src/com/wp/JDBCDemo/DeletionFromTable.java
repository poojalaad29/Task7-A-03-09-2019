package com.wp.JDBCDemo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletionFromTable {

	public static void main(String[] args) {
	    System.out.println("Enter Employee Number of employee you want to delete");
	    Scanner sc=new Scanner(System.in);
	    int eid=sc.nextInt();
	    Connection con=ConnectionDemo.Conndemo();
		 String qr="Delete from employee where Eno="+eid;
		
		try {
			PreparedStatement ps = con.prepareStatement(qr);
			ps.executeUpdate();
			System.out.println("Deleted successfully........");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}

	}

}
