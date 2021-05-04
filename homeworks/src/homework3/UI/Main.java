package homework3.UI;

import homework3.Business.Concrete.CampaignManager;
import homework3.Business.Concrete.GameManager;
import homework3.Business.Concrete.GameSaleManager;
import homework3.Business.Concrete.PlayerManager;
import homework3.Entities.Concrete.Campaign;
import homework3.Entities.Concrete.Game;
import homework3.Entities.Concrete.Player;

public class Main {

	public static void main(String[] args) {

		// player 1
		Player yasin = new Player();
		yasin.setId(1);
		yasin.setIdentityNumber("0123467890");
		yasin.setFirstName("Yasin");
		yasin.setLastName("Özer");
		yasin.setYearOfBirth("1998");
		// player 2
		Player ozer = new Player();
		ozer.setId(2);
		ozer.setIdentityNumber("0123467890");
		ozer.setFirstName("Ozer");
		ozer.setLastName("Yasin");
		ozer.setYearOfBirth("1998");
		/////// games
		Game gtaVI = new Game();
		gtaVI.setId(1);
		gtaVI.setName("GTA VI");
		gtaVI.setPrice("250");
		gtaVI.setPublishDate("2021");
		// ---
		Game rocketLeague = new Game();
		rocketLeague.setId(2);
		rocketLeague.setName("Rocket League");
		rocketLeague.setPrice("50");
		rocketLeague.setPublishDate("2018");

		///// sales
		Campaign summerSale = new Campaign();
		summerSale.setId(1);
		summerSale.setName("Summer sale");
		summerSale.setStartDate("2019");
		summerSale.setEndDate("2022");
		summerSale.setGameId(1); // for GTA VI
		// ---
		Campaign studentSale = new Campaign();
		studentSale.setId(2);
		studentSale.setName("Student sale");
		studentSale.setStartDate("2019");
		studentSale.setEndDate("2022");
		studentSale.setGameId(1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(summerSale);
		campaignManager.delete(studentSale);

		PlayerManager playerManager = new PlayerManager();
		playerManager.add(new Player(1, "1491084", "veli", "osman", "1998"));

		GameManager gameManager = new GameManager();
		gameManager.add(new Game(1, "rocketLeague", "2019", "100"));

		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.sales(yasin, gtaVI, summerSale);
		gameSaleManager.sales(yasin, gtaVI, studentSale);
		// sale without campaign
		gameSaleManager.sales(ozer, rocketLeague);

	}

}
