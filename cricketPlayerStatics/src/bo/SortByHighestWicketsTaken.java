package bo;

import java.util.Comparator;

import model.Player;

public class SortByHighestWicketsTaken  implements Comparator<Player> {
	public int compare(Player obj1, Player obj2) {
		Integer I1 = (Integer)obj1.getinHighestWicketsTaken();
		Integer I2 = (Integer)obj2.getinHighestWicketsTaken();
        return I2.compareTo(I1);
	}
}
