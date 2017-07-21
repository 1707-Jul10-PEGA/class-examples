package com.revature.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.jdbc.pojo.FlashCard;

public interface FlashCardDao {
	
	FlashCard getFlashCard(int id) throws SQLException;
	
	int saveFlashCard(FlashCard fc) throws SQLException;
	
	void updateFlashCard(FlashCard fc) throws SQLException;
	
	List<FlashCard> getAllFlashCards() throws SQLException;
	
	int deleteFlashCard(int ... ids) throws SQLException;

}
