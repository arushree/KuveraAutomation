package core.tests;

import org.testng.annotations.Test;

public class Scenarios extends SupportTest {
	@Test(priority = 1)
	public void sliderflow() throws Exception {
		kuvera.sliderflow();
	}

	@Test(priority = 2)
	public void Loginflow() throws Exception {
		kuvera.Loginflow();
	}

	@Test(priority = 3)
	public void Mutualflow() throws Exception {
		kuvera.Loginflow();
		kuvera.Mutualflow();
	}

	@Test(priority = 4)
	public void Wishlist() throws Exception {
		kuvera.Loginflow();
		kuvera.Wishlistflow();
	}

	@Test(priority = 5)
	public void guest() throws Exception {
		kuvera.sliderflow();
		kuvera.guest();

	}

	@Test(priority = 6)
	public void google() throws Exception {
		kuvera.google();

	}

	@Test(priority = 7)
	public void facebook() throws Exception {
		kuvera.facebook();
		;
	}

	@Test(priority = 8)
	public void Mf_graph() throws Exception {
		kuvera.Loginflow();
		kuvera.Mf_graph();

		kuvera.facebook();
		;
	}

	@Test(priority = 9)
	public void Bank() throws Exception {
		kuvera.Loginflow();
		kuvera.Bank();
	}

	@Test(priority = 10)
	public void Filter() throws Exception {
		kuvera.Loginflow();
		kuvera.Filter();
	}

	@Test(priority = 11)
	public void Multifund_cart() throws Exception {
		kuvera.Loginflow();
		kuvera.Multifund_cart();
	}

	@Test(priority = 12)
	public void MPIN() throws Exception {
		kuvera.MPIN();
	}

	@Test(priority = 13)
	public void MPIN_Reset() throws Exception {
		kuvera.MPIN_Reset();
	}

	@Test(priority = 14)
	public void ADDbank() throws Exception {
		kuvera.Loginflow();
		kuvera.Bank();	
		kuvera.ADDbank();
	}

	@Test(priority = 14)
	public void KYC() throws Exception {
		kuvera.Loginflow();
		kuvera.KYC();
	}

	@Test(priority = 15)
	public void Savesmart() throws Exception {
		kuvera.Loginflow();
		kuvera.Savesmart();
	}

	@Test(priority = 16)
	public void SavesmartSummary() throws Exception {
		kuvera.PayableUser();
		kuvera.SavesmartSummary();
	}

	@Test(priority = 17)
	public void GoldInvest() throws Exception {
		kuvera.PayableUser();
		kuvera.GoldInvest();
	}

	@Test(priority = 18)
	public void GoldInvestgm() throws Exception {
		kuvera.PayableUser();
		kuvera.GoldInvestgm();
	}

	@Test(priority = 19)
	public void GoldDisplay() throws Exception {
		kuvera.PayableUser();
		kuvera.GoldDisplay();
	}

	@Test(priority = 20)
	public void GoldSell() throws Exception {
		kuvera.PayableUser();
		kuvera.GoldSell();
	}

	@Test(priority = 21)
	public void gold7day() throws Exception {
		kuvera.Loginflow();
		kuvera.gold7day();
	}

	@Test(priority = 22)
	public void goldreport() throws Exception {
		kuvera.PayableUser();
		kuvera.goldreport();
		//kuvera.GoldDisplay();
	}

	@Test(priority = 23)
	public void Sip() throws Exception {
		kuvera.PayableUser();
		kuvera.Sip();
		
	}
	@Test(priority = 24)
	public void Stopsip() throws Exception {
		kuvera.PayableUser();
		kuvera.Stopsip();
	}
	@Test(priority = 24)
	public void Goldsip() throws Exception {
		kuvera.MoolyaUser();
		kuvera.Goldsip();
	}
	@Test(priority = 25)
	public void GoldSipedit() throws Exception {
		kuvera.MoolyaUser();
		kuvera.GoldSipedit();
	}
	@Test(priority = 26)
	public void GoldSipStop() throws Exception {
		kuvera.MoolyaUser();
		kuvera.GoldSipStop();
	}
	@Test(priority = 27)
	public void detail_funds() throws Exception {
		kuvera.Loginflow();
		kuvera.detail_funds();
	}
	@Test(priority = 28)
	public void FilterChoose() throws Exception {
		kuvera.PayableUser();
		kuvera.FilterChoose();
	}

}
