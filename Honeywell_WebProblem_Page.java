//Used Java and Selenium for the Project.

package <XYZ>

public class XYZPage {

	
	//1.SSL Certificate Error

	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	//2. Authentication Window
	
	String url = "http://<Username>:<Password>@<URL in forms of dots>"

	//3. MouseOver Operations on a List
	
	@FindBy(how = How.XPATH, using = "<XPATH>")
	private WebElement diffTimeList;

	public List<WebEement> getDiffTime() {
		return diffTimeList;
	}
	
	public void clickOnConfigurations(){	
		for(WebElement li : diffTimeList){
			if(li.getText().equals("Configurations"){
				li.click()
			}
		}
	}

	//4. Entering values and drag and drop

	@FindBy(how = How.XPATH, using = "<XPATH>")
	private WebElement grpName;

	public WebEement getGrpName() {
		return grpName;
	}

	@FindBy(how = How.XPATH, using = "<XPATH>")
	private WebElement displayName;

	public WebEement getDisplayName() {
		return displayName;
	}

	@FindBy(how = How.XPATH, using = "<XPATH>")
	private WebElement descrpt;

	public WebEement getDescrpt() {
		return descrpt;
	}

	public void enterGrpName(String grpName){
		if(getGrpName().isDisplayed()){
			getGrpName.sendKeys(grpName)
		}
	}

	public void enterDisplayName(String displayName){
		if(getDisplayName().isDisplayed()){
			getDisplayName.sendKeys(displayName)
		}
	}

	public void enterDisplayName(String descrpt){
		ifgetDescrpt().isDisplayed()){
			getDescrpt.sendKeys(descrpt)
		}
	}

	//drag and drop
	public void performDragAndDrop{
		Actions act = New Actions(driver);
	
		WebElement src = getGrpName;

		WebElement tar = getDisplayName;

		act.dragAndDrop(src, tar).perform();

	}

		
}

