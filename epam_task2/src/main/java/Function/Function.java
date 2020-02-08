package Function;
import SWEETS.*;
import Tasks.*;

public class Function {
	private static final int St= 20;
	private static final int END = 30;

	// Creating objects
	private static final Dhoodpeda dhoodpeda1 = new Dhoodpeda("dhoodpeda1", 10, 10);
	private static final Kaja kaja1 = new Kaja("kaja1", 15, 15);
	private static final Rasgulla rasgulla1 = new Rasgulla("rasgulla1", 25, 20);
	private static final Dhoodpeda dhoodpeda2 = new Dhoodpeda("dhoodpeda2", 10, 50);
	private static final Dhoodpeda dhoodpeda3 = new Dhoodpeda("dhoodpeda3", 20, 50);
	private static final Kaja kaja2 = new Kaja("kaja2", 20, 15);
	private static final Rasgulla rasgulla2 = new Rasgulla("rasagulla2", 30, 20);
	private static final Rasgulla rasgulla3 = new Rasgulla("rasgulla3", 30, 20);
	private static final Rasgulla rasgulla4 = new Rasgulla("rasgulla4", 30, 20);
	private static final Kaja kaja3 = new Kaja("kaja3", 20, 15);

	// Creating container
	private static final  tasks GIFT = new tasks();

	public static tasks getGift() {
		return GIFT;
	}



	public static void createGift() {
		getGift().add(dhoodpeda1, 5);
		getGift().add(kaja1, 10);
		getGift().add(rasgulla1, 8);
		getGift().add(dhoodpeda2, 11);
		getGift().add(dhoodpeda3, 21);
		getGift().add(kaja2, 13);
		getGift().add(rasgulla2, 8);
		getGift().add(rasgulla3, 9);
		getGift().add(rasgulla4, 12);
		getGift().add(kaja3, 13);
		getGift().add(dhoodpeda1, 24);
		getGift().add(kaja1, 11);
		getGift().add(kaja3,2);
		getGift().add(rasgulla2, 13);
		getGift().add(dhoodpeda2, 11);
	}
    public static void main( String[] args )
    {
    	createGift();
		System.out.println(" All objects from the gift:");
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Sorting  by 'SUGARLEVEL':");
		getGift().sortBySugarValue(getGift().getList());
		getGift().getAllCandy();
		System.out.println();
		System.out.println("Total 'Weight' of the gift: ");
		System.out.println(getGift().calculateTotalWeight() + " grm");
		System.out.println();
		System.out
				.println("Getting all objects with selected range of sugar value(from "
						+ St + "% to " + END + "%) :");
		for (Parent SWEETS : getGift().receiveBySugarValue(St, END)) {
			System.out.print(SWEETS.printAllValues());
		}
    }

}
