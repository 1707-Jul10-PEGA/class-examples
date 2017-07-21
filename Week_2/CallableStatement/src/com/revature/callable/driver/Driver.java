package com.revature.callable.driver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.callable.util.ConnectionFactory;

import oracle.jdbc.internal.OracleTypes;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = ConnectionFactory.getInstance().getConnection();
		
		/*try {
			System.out.println(conn.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql = "{call updateUser(?,?)}";
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 12);
			cstmt.setString(2, "Blake Kruppa");
			cstmt.executeUpdate();
			
			sql = "{call retrieveUser2(?,?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 12);
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);
			cstmt.executeQuery();
			
			System.out.println(cstmt.getString(2) + " " + cstmt.getString(3));
			
			sql = "{call retrieveUser(?,?)}";
			cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 12);
			cstmt.registerOutParameter(2, OracleTypes.CURSOR);
			cstmt.executeQuery();
			
			rs = (ResultSet) cstmt.getObject(2);
			
			rs.next();
			
			System.out.println(rs.getString(1) + " " + rs.getString(2));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {rs.close();} catch (SQLException e) {/*ignore*/}
			try{cstmt.close();} catch (SQLException e) {/*ignore*/}
			try{conn.close();} catch (SQLException e) {/*ignore*/}
			
		}
		
		

	}

}
