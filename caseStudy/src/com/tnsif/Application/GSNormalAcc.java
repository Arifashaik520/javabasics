package com.tnsif.Application;

import com.tnsif.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}

	public void bookProduct(float charges)
	{
	System.out.println("Hy user your charges are : "+charges +"and the deliverycharges are : "+deliveryCharges);	
	}

	@Override
	public String toString() {
		return "GSNormalAcc [deliveryCharge=" + deliveryCharges + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
				+ charges + "]";
	}
}
