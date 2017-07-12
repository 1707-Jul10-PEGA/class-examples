package com.revature.shadow.pojos;

public class Child extends Parent {
	
	public int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	public int getParentI(){
		
		return super.getI();
		
	}
	
	public void setParentI(int i){
		
		super.setI(i);
		
	}

}
