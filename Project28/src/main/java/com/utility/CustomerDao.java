package com.utility;

import com.model.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
public class CustomerDao {
	public int AddCustomer(Customer cust)
	{
		int val =0;
		try {
			Connection con = DBConnection.getConnection();
			String sql = "INSERT INTO CUSTOMER VALUES(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cust.getCid());
			ps.setString(2, cust.getCname());
			ps.setDouble(3, cust.getCbill());
			ps.setInt(4, cust.getCphone());
			val = ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.print("Exception occured in add customer "+e);
		}
		return val;
	}
	public int UpdateCustomer(Customer cust)
	{
		int val =0;
		try {
			Connection con = DBConnection.getConnection();
			String sql = "UPDATE CUSTOMER SET NAME=?,BILL=?,PHONE=? WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(4, cust.getCid());
			ps.setString(1, cust.getCname());
			ps.setDouble(2, cust.getCbill());
			ps.setInt(3, cust.getCphone());
			val = ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.print("Exception occured in update customer "+e);
		}
		return val;
	}
	
	public int DeleteCustomer(Customer cust)
	{
		int val =0;
		try {
			Connection con = DBConnection.getConnection();
			String sql = "DELETE FROM CUSTOMER WHERE ID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, cust.getCid());
			val = ps.executeUpdate();
		}catch(Exception e)
		{
			System.out.print("Exception occured in delete customer "+e);
		}
		return val;
	}
	
	public List<Customer> getAllCustomer()
	{
		List<Customer> list = new ArrayList<Customer>();
		try {
			Connection con = DBConnection.getConnection();
			String sql = "SELECT * FROM CUSTOMER ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				list.add(new Customer(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4)));
			}
		}catch(Exception e)
		{
			System.out.print("Exception occured in get all customer "+e);
		}
		return list;
	}
}
