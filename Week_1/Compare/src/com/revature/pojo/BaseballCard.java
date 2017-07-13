package com.revature.pojo;

public class BaseballCard implements Comparable<BaseballCard> {

	private String name;

	private String position;

	private double height;

	private double weight;

	private int year;
	
	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseballCard other = (BaseballCard) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equalsIgnoreCase(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BaseballCard [name=" + name + ", value=$" + value + ", position=" + position + ", height=" + height + ", weight=" + weight
				+ ", year=" + year + "]";
	}

	public BaseballCard(String name, String position, double height, double weight, int year) {
		super();
		this.name = name;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.year = year;
	}

	public BaseballCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(BaseballCard arg0) {
		// TODO Auto-generated method stub

		if (this.equals(arg0)) {
			return 0;
		}
		
		else if(this.getName().compareTo(arg0.getName())<0){
			
			return -1;
			
		}
		
		else {
			
			return 1;
			
		}
		
	}

}
