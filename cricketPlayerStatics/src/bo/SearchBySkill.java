package bo;
import java.util.ArrayList;
import java.util.List;
import model.Player;

public class SearchBySkill {
	public List<Player> searchBySkill(String skill,List<Player> list){ 
		ArrayList<Player> res = new ArrayList<Player>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getskill().equals(skill)) {
				res.add(list.get(i));
			}
		}
		return res;
	}

}
