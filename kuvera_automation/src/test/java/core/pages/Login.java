package core.pages;

import java.util.Map;
import agent.IAgent;
import central.Configuration;

public class Login extends FullPage {
	//AppiumDriver driver=null;

	public Login(Configuration config, IAgent agent, Map<String, String> testData) throws Exception {
		super(config, agent, testData);
	}

	public void sliderflow() throws Exception {
		getControl("slider").click();
		Thread.sleep(3000);
		getControl("txtLogin").click();
		
	}

	public void Loginflow() throws Exception {
	getControl("slider").click();
	Thread.sleep(3000);
	getControl("txtLogin").click();
	//Assert.assertEquals(actual, expected);
	getControl("emailaddress").enterText("bhavani.sruti@moolya.com");
	getControl("password").enterText("123456789");
	getControl("loginbtn").click();
	getControl("Setuplater").click();
	Thread.sleep(3000);
	}
	public void PayableUser() throws Exception {
		getControl("slider").click();
		Thread.sleep(3000);
		getControl("txtLogin").click();
		//Assert.assertEquals(actual, expected);
		getControl("emailaddress2").enterText("rajag@kuvera.in");
		getControl("password2").enterText("kuveratesting123");
		getControl("loginbtn2").click();
		getControl("Setuplater2").click();
		getControl("Doitlater").click();
		Thread.sleep(3000);
		}

	public void MoolyaUser() throws Exception {
	getControl("slider").click();
	Thread.sleep(3000);
	getControl("txtLogin").click();
	//Assert.assertEquals(actual, expected);
	getControl("emailaddress2").enterText("moolya@kuvera.in");
	getControl("password2").enterText("kuveratesting123");
	getControl("loginbtn2").click();
	getControl("Setuplater2").click();
	//getControl("Doitlater").click();
	Thread.sleep(3000);
}
	public void Mutualflow() throws Exception {
		getControl("MutualFunds").click();
		getControl("Invest").click();
		getControl("EnterSIP").click();
		Runtime.getRuntime().exec("adb shell input text \"5000\"");
		Thread.sleep(1000);
//		getControl("EnterSIP").enterText("5,000");
		getControl("EnterLumpsum").click();
		Runtime.getRuntime().exec("adb shell input text \"5234567\"");
		Thread.sleep(3000);
//		getControl("EnterLumpsum").enterText("5,67,000");
		goBack();
		getControl("AddToCart").click();
		Thread.sleep(6000);
		takeSnapShot();
	}
	public void Wishlistflow() throws Exception {
		getControl("MutualFunds").click();
		getControl("Wishlist").click();
		goBack();
		takeSnapShot();
	}
	public void guest() throws Exception {
		getControl("kuveraLogo").click();
		Thread.sleep(3000);
		swipeDown(6);
		getControl("category").click();
		getControl("selectCategory").click();
		swipeDown(1);
		Thread.sleep(2000);
		getControl("Invest").click();
		getControl("EnterSIP").click();
		Runtime.getRuntime().exec("adb shell input text \"134536\"");
		Thread.sleep(3000);
		getControl("EnterLumpsum2").click();
		Runtime.getRuntime().exec("adb shell input text \"9876543\"");
		Thread.sleep(2000);
		getControl("Invest2").click();
		Thread.sleep(3000);
		getControl("emailaddress").enterText("ram.kiran@moolya.com");
		getControl("password").enterText("ramkiranb95");
		getControl("loginbtn").click();
		getControl("Setuplater").click();
		goBack();
		takeSnapShot();
	}
	public void google() throws Exception {
		getControl("slider").click();
		Thread.sleep(3000);
		getControl("txtLogin").click();
		getControl("googlesignin").click();
		Thread.sleep(4000);
		getControl("idselect").click();
		Thread.sleep(4000);
		swipeDown(1);
		getControl("allow").click();
		getControl("Setuplater2").click();
		goBack();
		takeSnapShot();
	}
	public void facebook() throws Exception {
		getControl("slider").click();
		Thread.sleep(3000); 
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		getControl("txtLogin").click();
		System.out.println(this.getAgent().getMobileDriver().getContext());
		getControl("facebooksignin").click();
//		getControl("facebookemail").click();
		getControl("facebookemail").enterText("ramkiran.mar@gmail.com");
		getControl("facebookpassword").enterText("RAMki@78$$\r\n" + 
				"");
		Thread.sleep(3000);
		//getControl("loginfb").click();
		goBack();
		takeSnapShot();
	}
	public void Set_a_goal() throws Exception {
		getControl("LHS").click();
		getControl("Setgoal").click();
		swipeDown(1);
		getControl("Setgoal").click();
		getControl("Foreign_Vacation_goal").click();
		getControl("Cost").click();
		Runtime.getRuntime().exec("adb shell input text \"45678\"");
		getControl("Continue").click();
		getControl("Years").click();
		Runtime.getRuntime().exec("adb shell input text \"4\"");
		getControl("Continue").click();
	}

	public void MPIN() throws Exception {
	getControl("slider").click();
	Thread.sleep(3000);
	getControl("txtLogin").click();
	//Assert.assertEquals(actual, expected);
	getControl("emailaddress").enterText("bhavani.sruti@moolya.com");
	getControl("password").enterText("123456789");
	getControl("loginbtn").click();
	getControl("1").click();
	getControl("2").click();
	getControl("3").click();
	getControl("4").click();
	Thread.sleep(2000);
	getControl("1").click();
	getControl("2").click();
	getControl("3").click();
	getControl("4").click();
	}
	public void Mf_graph() throws Exception {
		getControl("MutualFund").click();
		getControl("MF").click();
		Thread.sleep(2000);
		getControl("1M").click();
		swipeDown(1);
		Thread.sleep(2000);
		swipeUp(1);
		getControl("3M").click();
		Thread.sleep(2000);
		getControl("6M").click();
		Thread.sleep(2000);
		getControl("YTD").click();
		Thread.sleep(2000);
		getControl("1Y").click();
		Thread.sleep(2000);
		getControl("3Y").click();
		Thread.sleep(2000);
		getControl("All").click();
		Thread.sleep(2000);
		//getControl("Compare").click();
		//Thread.sleep(2000);
		//getControl("Nifty_MidCap").click();
	
		
		Thread.sleep(2000);
	}
	public void Bank() throws Exception {
		getControl("Account").click();
		getControl("Profile").click();
		getControl("BankAccounts").click();
		Thread.sleep(2000);
	}
	public void Filter() throws Exception {
		getControl("MutualFund").click();
		//getControl("Filter").click();
		//getControl("F1").click();
		//Thread.sleep(2000);
		//getControl("Equity").click();
		//Thread.sleep(2000);
		//getControl("Focus_Fund").click();
		//getControl("SL").click();
	//	getControl("Apply").click();
		//Thread.sleep(2000);
}
	
	public void Multifund_cart() throws Exception {
		getControl("MutualFunds").click();
		getControl("Invest").click();
		getControl("EnterSIP").click();
		Runtime.getRuntime().exec("adb shell input text \"5000\"");
		Thread.sleep(1000);
//		getControl("EnterSIP").enterText("5,000");
		getControl("EnterLumpsum").click();
		Runtime.getRuntime().exec("adb shell input text \"5234567\"");
		Thread.sleep(3000);
//		getControl("EnterLumpsum").enterText("5,67,000");
		goBack();
		getControl("AddToCart").click();
		Thread.sleep(6000);
		swipeUp(2);
		getControl("Invest").click();
		getControl("EnterSIP").click();
		Runtime.getRuntime().exec("adb shell input text \"4500\"");
		Thread.sleep(1000);
		getControl("EnterLumpsum").click();
		Runtime.getRuntime().exec("adb shell input text \"7894567\"");
		Thread.sleep(3000);
		goBack();
		getControl("AddToCart").click();
		Thread.sleep(6000);
		getControl("Cart").click();
		getControl("PlaceOrder").click();
		Thread.sleep(6000);
		takeSnapShot();
	}
	public void MPIN_Reset() throws Exception {
		//getControl("Reset").click();
		getControl("slider").click();
		Thread.sleep(3000);
		getControl("txtLogin").click();
		getControl("emailaddress").enterText("bhavani.sruti@moolya.com");
		getControl("password").enterText("123456789");
		getControl("loginbtn").click();
		getControl("5").click();
		getControl("6").click();
		getControl("7").click();
		getControl("8").click();
		Thread.sleep(2000);
		getControl("5").click();
		getControl("6").click();
		getControl("7").click();
		getControl("8").click();
	}
	public void ADDbank() throws Exception {
		getControl("ADDbank").click();
		System.out.println("\n"+this.getAgent().getMobileDriver().getPageSource());
		//getControl("IFSC").click();
		//Runtime.getRuntime().exec("adb shell input text \"SBIN0013522\"");
		getControl("Accountno").click();
		Runtime.getRuntime().exec("adb shell input text \"20204469053\"");
		getControl("CA").click();
		Runtime.getRuntime().exec("adb shell input text \"20204469053\"");
		getControl("TypeAcc").click();
		getControl("T1").click();
		getControl("T2").click();
	}
	public void KYC() throws Exception {
		getControl("Account").click();
		getControl("Nokyc").click();
		Thread.sleep(3000);
		getControl("NewAccount").click();
		Thread.sleep(1000);
		getControl("Accountkyc").click();
		Thread.sleep(3000);
	}
	public void Savesmart() throws Exception {
		getControl("Savesmart").click();
		getControl("Amount").click();
		Runtime.getRuntime().exec("adb shell input text \"2020\"");
		Thread.sleep(3000);
		getControl("SaveNow").click();
		//getControl("Seedetails").click();
		//getControl("Gotit").click();
	}
	public void SavesmartSummary() throws Exception {
		getControl("AllAsset").click();
		getControl("SelectSavesmart").click();
		Thread.sleep(3000);
	}
	public void GoldInvest() throws Exception {
		getControl("LHS").click();
		getControl("gold").click();
		getControl("EnterAmt").click();
		Runtime.getRuntime().exec("adb shell input text \"10\"");
		getControl("BUY").click();
	}
	public void GoldInvestgm() throws Exception {
		getControl("LHS").click();
		getControl("gold").click();
		getControl("gm").click();
		getControl("entergm").click();
		Runtime.getRuntime().exec("adb shell input text \"10\"");
		getControl("BUY").click();
	}
	public void GoldSell() throws Exception {
		getControl("LHS").click();
		getControl("gold").click();
		getControl("Sell").click();
		//getControl("Info").click();
		getControl("entergm").click();
		Runtime.getRuntime().exec("adb shell input text \"10\"");
		getControl("SellNow").click();
	}
	public void GoldDisplay() throws Exception {
		getControl("AllAsset").click();
		getControl("SelectGold").click();
		Thread.sleep(3000);
	}
	public void gold7day() throws Exception {
		getControl("LHS").click();
		getControl("gold").click();
		getControl("Sell").click();
		getControl("entergm").click();
		Runtime.getRuntime().exec("adb shell input text \"1\"");
		Thread.sleep(3000);
	}
	public void goldreport() throws Exception {
		getControl("LHS").click();
		getControl("Report").click();
		Thread.sleep(3000);
		swipeDown(1);
		getControl("value").click();
		Thread.sleep(2000);
	//	getControl("BACK").click();
	}
	public void Sip() throws Exception {
		getControl("LHS").click();
		getControl("sip").click();
		getControl("sip1").click();
		Thread.sleep(3000);
		getControl("Edit").click();
		//getControl("Sipedit").click(); IF SCREEN GETS CHANGED
		getControl("EditDate").click();
		getControl("Cancel").click();
		//getControl("Proceed").click();
	}
	public void Stopsip() throws Exception {
		getControl("LHS").click();
		getControl("sip").click();
		getControl("sip1").click();
		Thread.sleep(3000);
		getControl("Sipend").click();
		getControl("SKIP").click();
		//getControl("STOP").click(); WE CANNOT EDIT HIS SIP   
	}
	public void Goldsip() throws Exception {
		getControl("LHS").click();
		getControl("gold").click();
		getControl("sipstart").click();
		Thread.sleep(3000);
		getControl("sipamount").click();
		Runtime.getRuntime().exec("adb shell input text \"1500\"");
		getControl("Date").click();
		Thread.sleep(3000);
		getControl("Choose").click();
		//getControl("STARTSIP").click();
	}
	public void GoldSipedit() throws Exception {
		getControl("LHS").click();
		getControl("sip").click();
		getControl("goldsip").click();
		Thread.sleep(3000);
		getControl("Edit").click();
		//getControl("Sipedit").click(); IF SCREEN GETS CHANGED
		getControl("EditDate2").click();
		getControl("Datechange").click();
		//getControl("Save").click();
	}
	public void GoldSipStop() throws Exception {
		getControl("LHS").click();
		getControl("sip").click();
		getControl("goldsip").click();
		Thread.sleep(3000);
		getControl("Sipend").click();
	}
	public void FilterChoose() throws Exception {
		getControl("Selection").click();
		Thread.sleep(3000);
		getControl("SavesSmart").click();
		Thread.sleep(3000);
		getControl("Gold").click();
		Thread.sleep(3000);
		getControl("EPF").click();
	}
	public void detail_funds() throws Exception {   /////this the details there is no xpath///
		getControl("MutualFund").click();
		getControl("MF").click();
		getControl("detail1").click();
		swipeDown(1);
		Thread.sleep(2000);
		getControl("detail2").click();
		getControl("detail3").click();
		getControl("detail4").click();
		swipeDown(1);
		Thread.sleep(2000);
	}
	public void Schedulesip() throws Exception {
		getControl("LHS").click();
		getControl("sip").click();
		getControl("addsip").click();
		Thread.sleep(3000);
		getControl("invest").click();
		

	}

}
