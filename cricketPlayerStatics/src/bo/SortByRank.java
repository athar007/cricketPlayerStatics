package bo;
import model.*;
import java.util.Comparator;

public class SortByRank implements Comparator<Player> {
	public int compare(Player obj1, Player obj2) {
		Integer I1 = (Integer)obj1.getrank();
		Integer I2 = (Integer)obj2.getrank();
		return I1.compareTo(I2);
    }

}
