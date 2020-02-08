package Tasks;
import SWEETS.*;
import java.io.*;
import java.util.*;
public class tasks {
	private List<Parent> list = new ArrayList<Parent>();

	public List<Parent> getList() {
		return list;
	}

	

	public void add(Parent absCandy, int count) {
		for (Parent candy : getList()) {
			if (candy.getName().equals(absCandy.getName())) {
				candy.setCount(candy.getCount() + count);
				return;
			}
		}
		getList().add(absCandy);
		absCandy.setCount(count);
	}

	
	public int calculateTotalWeight() {
		int value = 0;
		for (Parent candy : getList()) {
			value += candy.getCount() * candy.getWeight();
		}
		return value;
	}

	public void getAllCandy() {
		for (Parent candy : getList()) {
			System.out.print(candy.printAllValues());
		}
	}

	     
	

	public List<Parent> receiveBySugarValue(int start, int end) {
		ArrayList<Parent> list2 = new ArrayList<Parent>();
		sortBySugarValue(list2);
		for (Parent candy : getList()) {
			if (start <= candy.getSugarValue() && candy.getSugarValue() < end) {
				list2.add(candy);
			}
		}
		return list2;
	}

	
	public void sortBySugarValue(List<Parent> list) {
		Collections.sort(list, new CompareBySugarValue());
	}

	static class CompareBySugarValue implements Comparator<Parent>,
			Serializable {

		private static final long serialVersionUID = -6923839843945617223L;

		public int compare(Parent o1, Parent o2) {
			return o1.getSugarValue() - o2.getSugarValue();
		}

	}
}
