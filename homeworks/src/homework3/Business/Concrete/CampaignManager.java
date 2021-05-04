package homework3.Business.Concrete;

import homework3.Business.Abstract.CampaignService;
import homework3.Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " added");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " udpated");

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " deleted");
	}

	@Override
	public void getAll(Campaign campaign) {
		System.out.println("All campaigns listed");

	}

}
