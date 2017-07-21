package com.revature.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.revature.jdbc.pojo.FlashCard;

public class FlashCardDaoImpl implements FlashCardDao{
	
	Connection conn = null;
	
	public void setup(){
		
		conn = DriverManager.getConnection(url, user, password);
		
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
		return 0;
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
