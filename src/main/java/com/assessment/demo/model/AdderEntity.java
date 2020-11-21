package com.assessment.demo.model;




public class AdderEntity {
	
	 private String sum;

	public AdderEntity(String sum) {
		this.sum = sum;
	}
	
	public AdderEntity() {
		
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "AdderEntity [sum=" + sum + "]";
	}
	 
	 

	
}
