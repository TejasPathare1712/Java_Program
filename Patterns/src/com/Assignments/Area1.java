package com.Assignments;

public class Area1 {
	float length;
	float breadth;
	
	public void setDim(float length,float breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public float getDim() {
		return 2*(length + breadth);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area1 a1 = new Area1();
		a1.setDim(10, 20);
		
		System.out.println(a1.getDim());
		

	}

}
