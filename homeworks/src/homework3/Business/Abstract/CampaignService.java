package homework3.Business.Abstract;

import homework3.Entities.Concrete.Campaign;

public interface CampaignService {

	void add(Campaign campaign);

	void update(Campaign campaign);

	void delete(Campaign campaign);

	void getAll(Campaign campaign);

}
