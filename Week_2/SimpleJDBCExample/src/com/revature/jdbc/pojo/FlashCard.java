package com.revature.jdbc.pojo;

public class FlashCard {
	
	private int FC_ID;
	private String FC_QUESTION;
	private String FC_ANSWER;
	
	public FlashCard(int fC_ID, String fC_QUESTION, String fC_ANSWER) {
		super();
		FC_ID = fC_ID;
		FC_QUESTION = fC_QUESTION;
		FC_ANSWER = fC_ANSWER;
	}
	@Override
	public String toString() {
		return "FlashCard [FC_ID=" + FC_ID + ", FC_QUESTION=" + FC_QUESTION + ", FC_ANSWER=" + FC_ANSWER + "]";
	}
	public FlashCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFC_ID() {
		return FC_ID;
	}
	public void setFC_ID(int fC_ID) {
		FC_ID = fC_ID;
	}
	public String getFC_QUESTION() {
		return FC_QUESTION;
	}
	public void setFC_QUESTION(String fC_QUESTION) {
		FC_QUESTION = fC_QUESTION;
	}
	public String getFC_ANSWER() {
		return FC_ANSWER;
	}
	public void setFC_ANSWER(String fC_ANSWER) {
		FC_ANSWER = fC_ANSWER;
	}

}
