package bo;
import java.util.ArrayList;
import java.util.List;

import model.Player;

public class SearchByCountry {
	public List<Player> searchByCountry(String country,List<Player> list){
		ArrayList<Player> a = new ArrayList<Player>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getcountry().equals(country)) {
				a.add(list.get(i));
			}
		}
		return a;
	}

}
