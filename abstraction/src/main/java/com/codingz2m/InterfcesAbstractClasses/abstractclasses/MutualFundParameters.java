package com.codingz2m.InterfcesAbstractClasses.abstractclasses;

public class MutualFundParameters {
	
	private String netAssetValue;
	private String expenseRatio; 
	private String exitLoad;
	private String assetsUnderManagement;
	private String riskLevel;
	private String portfolioTurnoverRatio;
	private String quantitativeMeasures;
	private String portfolio;
	
	public void setNetAssetValue(String netAssetValue) {
		this.netAssetValue = netAssetValue;
	}
	public void setExpenseRatio(String expenseRatio) {
		this.expenseRatio = expenseRatio;
	}
	public void setExitLoad(String exitLoad) {
		this.exitLoad = exitLoad;
	}
	public void setAssetsUnderManagement(String assetsUnderManagement) {
		this.assetsUnderManagement = assetsUnderManagement;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}
	public void setPortfolioTurnoverRatio(String portfolioTurnoverRatio) {
		this.portfolioTurnoverRatio = portfolioTurnoverRatio;
	}
	public void setQuantitativeMeasures(String quantitativeMeasures) {
		this.quantitativeMeasures = quantitativeMeasures;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	
	@Override
	public String toString() {
		return "MutualFundParameters [NetAssetValue = " + netAssetValue + "\n" + "  ExpenseRatio = " + expenseRatio + "\n" + "ExitLoad = " 
				+ exitLoad + "\n" +"AssetsUnderManagement = " + assetsUnderManagement + "\n" + "RiskLevel = " + riskLevel   + "\n" 
				+ "PortfolioTurnoverRatio = " + portfolioTurnoverRatio + "\n" + "QuantitativeMeasures = " 
				+ quantitativeMeasures + "\n" +"Portfolio = " + portfolio + "]";
	}
	

}
