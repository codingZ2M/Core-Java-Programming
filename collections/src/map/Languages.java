package map;

public class Languages {
	
	private String languageName;
	private String languageDesc;
	
	public Languages(String languageName, String languageDesc) {
		super();
		this.languageName = languageName;
		this.languageDesc = languageDesc;
	}
	
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageDesc() {
		return languageDesc;
	}
	public void setLanguageDesc(String languageDesc) {
		this.languageDesc = languageDesc;
	}
	
	@Override
	public String toString() {
		return "Languages [languageName=" + languageName + ", languageDesc=" + languageDesc + "]";
	}
	

}
