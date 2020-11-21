package com.assessment.demo.model;




public class AdderEntity {
	
	 private int sum;

	public AdderEntity(int sum) {
		this.sum = sum;
	}
	
	public AdderEntity() {
		
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "AdderEntity [sum=" + sum + "]";
	}
	 
	 

	
}
