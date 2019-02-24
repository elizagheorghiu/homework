package tema_09_02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Person, List<Hobby>> map = new HashMap<>();

		Hobby horseRiding = new Hobby("Horse Riding", 1);
		Hobby reading = new Hobby("Reading", 7);
		Hobby ballet = new Hobby("Ballet", 4);
		Hobby football = new Hobby("Football", 1);
		Hobby canoe = new Hobby("Canoe", 1);
		Hobby painting = new Hobby("Painting", 3);
		Hobby cooking = new Hobby("Cooking", 6);

		horseRiding.addAddressList(Arrays.asList("Moldova", "Uganda", "Serbia"));
		reading.addAddressList(Arrays.asList("Estonia", "Macedonia", "Serbia"));
		ballet.addAddressList(Arrays.asList("Russia", "Kuala Lumpur"));
		football.addAddressList(Arrays.asList("Italy", "Brazil ", "Portugal", "Spain"));
		canoe.addAddressList(Arrays.asList("Netherlands", "Brazil ", "Puerto Rico"));
		painting.addAddressList(Arrays.asList("France", "Germany ", "Lithuania"));
		cooking.addAddressList(Arrays.asList("Beirut", "Turkey ", "Lebanon"));

		Hobby swimming = new Hobby("Swimming", 4);
		swimming.addAddressList(Arrays.asList("Romania", "UK", "France"));

		Person mara = new Person("Mara", "288239203802832", 21);
		map.put(mara, Arrays.asList(swimming, horseRiding));

		Person tudor = new Person("Tudor", "190239203802832", 31);
		map.put(tudor, Arrays.asList(swimming));

		Person marcel = new Person("Marcel", "102943434323543", 44);
		map.put(marcel, Arrays.asList(swimming, football));

		Person george = new Person("George", "188239203802832", 56);
		map.put(george, Arrays.asList(cooking, reading));

		Person radu = new Person("Radu", "1853450982402", 18);
		map.put(radu, Arrays.asList(canoe, painting));

		Person david = new Person("David", "104830480343433", 23);
		map.put(david, Arrays.asList(ballet));

		System.out.println("Entire map on a single line: " + map + "\n\n");

		// pt o printare mai draguta
		map.entrySet().stream().forEach(entry -> System.out.println(entry));

	}
}
