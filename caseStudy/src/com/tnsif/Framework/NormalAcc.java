package com.tnsif.Framework;

public class NormalAcc extends ShopAcc {
	
	public float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	public void bookProduct(float charges) {
		
	}

}
