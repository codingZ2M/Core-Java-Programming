package com.codingz2m.InterfcesAbstractClasses.abstractclasses;

import java.util.ArrayList;
import java.util.List;

public class BalancedMutualFundSchemeService  extends MutualFund {

	@Override
	public List<String> getSchemeDescription() {
		
		List <String> schemeDescription  = new ArrayList<String>();
		schemeDescription.add(":: Balanced Mutual Fund Scheme Objectives ::");
		schemeDescription.add("Providing both growth and regular income");
		schemeDescription.add("Invested in equities and fixed income securities");	
		return schemeDescription;
	}

	@Override
	public MutualFundParameters mutualFundTerms() {
		MutualFundParameters mutualFundParameters = new MutualFundParameters();
		
		mutualFundParameters.setNetAssetValue("Market value per unit of mutual funds");
		mutualFundParameters.setExpenseRatio("Operational charges as mutual funds");
		mutualFundParameters.setExitLoad("Premature exit from the fund");
		mutualFundParameters.setAssetsUnderManagement("Total assets that are being managed by a mutual fund scheme");
		mutualFundParameters.setRiskLevel("How much risk the particular scheme entail");
		mutualFundParameters.setPortfolioTurnoverRatio("Defines how frequently the mutual fund manger buys or sells the stocks from the fund");
		mutualFundParameters.setQuantitativeMeasures("Gives an idea of the risk taken by the mutual fund and the volatility you can expect in your returns");
		mutualFundParameters.setPortfolio("The stocks the mutual fund has invested in and the sectors( percentage of Total Holdings)it has more exposure to");
		
		return mutualFundParameters;
	}

}
