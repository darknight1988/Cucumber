package stepDefination;

import net.thucydides.core.annotations.Step;

public class BuyerSteps {
	
	HomePage homepage;
	
	
	@Step
	public void opens_etsy_home_page() {
		// TODO Auto-generated method stub
		homepage.open();
		
	}
	@Step
	public void searches_for_items_containing(String keyword) {
		homepage.search(keyword);
		
	}
	@Step
	public void should_see_items_related_to(String keyword) {
		
		
	}

}
