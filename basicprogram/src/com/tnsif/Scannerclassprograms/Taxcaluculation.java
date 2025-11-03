package com.tnsif.Scannerclassprograms;

public class Taxcaluculation {
	public void Caluculatetax(Person P) {
		if(P.getIncome()<=1600) {
			P.setTax(0);
		}
		else if(P.getIncome()>1600 && P.getIncome()<50000) {
			P.setTax(5);
		}
		else {
			P.setTax(10);
		}
	}


}
