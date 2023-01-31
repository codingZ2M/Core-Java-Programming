package com.codingz2m.InterfcesAbstractClasses.abstractclasses;

import java.util.List;

public class MutualFundType {

	public static void main(String[] args) {
		
		MutualFund mutualFund = new EquityMutualFundSchemeService();
		List<String> fundDesc = mutualFund.getSchemeDescription();
		
		for (String desc : fundDesc) {
			System.out.println(desc);
		}
		
		System.out.println("**************************************");
		
		System.out.println(mutualFund.mutualFundTerms());
	}

}
