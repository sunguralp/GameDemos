package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {
	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() +" isimli oyun sisteme dahil edildi");
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() +" isimli oyun g�ncellendi");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() +" isimli oyun sistemden silindi");
		
	}
}
