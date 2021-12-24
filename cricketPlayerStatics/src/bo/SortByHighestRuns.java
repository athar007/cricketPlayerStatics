package bo;

import java.util.Comparator;

import model.Player;

public class SortByHighestRuns implements Comparator<Player> {
	public int compare(Player obj1, Player obj2) {
		Integer I1 = (Integer)obj1.getinHighestRun();
		Integer I2 = (Integer)obj2.getinHighestRun();
        return I2.compareTo(I1);
    }

}
