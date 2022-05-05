package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mycompany.dbutil.DBUtil;
import com.mycompany.domain.Product;

public class ProductManagementDAO {
	
	public int view() throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.dbConn();
		Statement stmt = conn.createStatement();
		String sql = "select * from product";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("\n\nProduct Name: " + rs.getString(1) + " \nProduct Id: " + rs.getInt(2) + " \nProduct Price: " + rs.getInt(3));
		}
		return 0;
	}
	
	public int insert(Product prod) throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.dbConn();
		String sql = "insert into product values(?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, prod.getProductName());
		ps.setInt(2, prod.getProductId());
		ps.setInt(3, prod.getProductPrice());
		return ps.executeUpdate();
	}
	
	public void update(Product prod) throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.dbConn();
		String sql = "update product set productName=? where productId=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, prod.getProductName());
		ps.setInt(2, prod.getProductId());
		ps.executeUpdate();
		System.out.println("Product updated successfully");
	}
	
	public static int delete(Product prod) throws ClassNotFoundException, SQLException {
		int status = 0;
		Connection conn = DBUtil.dbConn();
		String sql = "delete from product where productId=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, prod.getProductId());
		status = ps.executeUpdate();
		return status;
	}
	
	public void search(Product prod) throws ClassNotFoundException, SQLException {
		Connection conn = DBUtil.dbConn();
		String sql = "select * from product where productId=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, prod.getProductId());
		ps.executeUpdate();
	}

}
