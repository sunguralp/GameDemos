package Abstract;
import Entities.Player;
public interface IPlayerService {
	void addPlayer(Player player);
	void update(Player player);
	void delete(Player player);
}
