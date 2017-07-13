package com.revature.pojo;

import java.util.Comparator;

import com.revature.pojo.BaseballCard;

public class BaseballCardComparator implements Comparator<BaseballCard> {

	@Override
	public int compare(BaseballCard o1, BaseballCard o2) {
		// TODO Auto-generated method stub
		
		Double value = (o1.getValue() - o2.getValue());
		
		return value.intValue();
	
	}

}
