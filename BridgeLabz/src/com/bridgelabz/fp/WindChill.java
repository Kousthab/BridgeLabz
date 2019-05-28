package com.bridgelabz.fp;

public class WindChill {
	
	public void windchill(float t,float v) {
		float w1=(float) ((float)35.74+0.6215*t);
		float w2=(float) ((0.4275*t-35.75)*Math.pow(v, 0.16));
		float w3=(float)(w1 +w2);
		if ((t<=50) & v<=120 & v>=3) {
			System.out.println("valid input"+w3);
		}else {
			System.out.println("Invalid input"+w3);
		}
	}

}
