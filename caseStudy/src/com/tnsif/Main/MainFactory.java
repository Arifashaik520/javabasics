package com.tnsif.Main;

import com.tnsif.Application.GSNormalAcc;
import com.tnsif.Application.GSPrimeAcc;

public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(201,"tkr",2000.3f,true);
		GSNormalAcc gsnormal = new GSNormalAcc(202,"teegala",3000.3f,89.4f);

		gsprime.bookProduct(23.3f);
		gsnormal.bookProduct(92.7f);

	}

}
