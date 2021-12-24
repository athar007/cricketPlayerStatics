package bo;

import java.util.Comparator;

import model.Player;

public class SortByAge implements Comparator<Player> {
	public int compare(Player obj1, Player obj2) {
		Integer I1 = (Integer)obj1.getage();
		Integer I2 = (Integer)obj2.getage();
        return I2.compareTo(I1);
	}
}
