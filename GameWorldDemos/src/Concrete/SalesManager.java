package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class SalesManager {
	
	public void salesWithoutCampaign(Player player,Game game,Sale sale) {
		System.out.println(sale.getSaleId()+" numaral� sat���n detaylar�:\n"+game.getGameName() +"isimli oyun" + player.getName() + player.getSurname()+ " taraf�ndan " + game.getGamePrice() +"TL fiyata sat�n al�nm��t�r");
		
	}
	
	public void salesWithCampaign(Player player,Game game,Campaign campaign,Sale sale) {
		int PriceAfterCampaign=(int) (game.getGamePrice()-(game.getGamePrice()*campaign.getRate())/100);
		System.out.println(sale.getSaleId()+" numaral� sat���n detaylar�:\n"+game.getGameName()+" isimli oyun "+ player.getName() + " "+player.getSurname()+ " taraf�ndan " +campaign.getName() +" kampanyas�ndan yararlan�larak "+ PriceAfterCampaign +"TL fiyata sat�n al�nm��t�r");
	}
}
