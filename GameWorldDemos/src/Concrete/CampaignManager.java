package Concrete;


import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {
	
	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getName() +" isimli kampanya baţlatýldý");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getName() +" isimli kampanya güncellendi");
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getName() +" isimli kampanya sonlandýrýldý");
		
	}
}
