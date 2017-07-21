package com.revature.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.revature.jdbc.pojo.FlashCard;
import com.revature.jdbc.util.ConnectionFactory;

public class FlashCardDaoImpl implements FlashCardDao{
	
	Connection conn = null;
	
	public void setup(){
		
		conn = ConnectionFactory.getInstance().getConnection();
		
	}
	
	public FlashCardDaoImpl(){
		
		setup();
		
	}

	@Override
	public FlashCard getFlashCard(int id) throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveFlashCard(FlashCard fc) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into flash cards(fc_question, fc_answer) values(?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, fc.getFC_QUESTION());
		pstmt.setString(2, fc.getFC_ANSWER());
		return pstmt.executeUpdate();
	
	}

	@Override
	public void updateFlashCard(FlashCard fc) throws SQLException{
		// TODO Auto-generated method stub

	}

	@Override
	public List<FlashCard> getAllFlashCards() throws SQLException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteFlashCard(int... ids) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

}