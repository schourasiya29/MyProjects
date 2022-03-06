import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();

		hm.put(1, "C");
		hm.put(2, "B");
		hm.put(3, "D");
		hm.put(4, "A");

		// Will not give accurate result
		/*
		 * Map<Integer, String> hm1 = hm.entrySet().stream().sorted((i1, i2) ->
		 * i1.getValue().compareTo(i2.getValue()))
		 * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 * 
		 * System.out.println(hm1);
		 */

		//Need to store  sorted values in linkedHashmap to maintain the order
		HashMap<Integer, String> temp = hm.entrySet().stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(temp);

		/*------------------------------------------------OR-----------------------------------------------------------------*/

		List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(hm.entrySet());

		List<Map.Entry<Integer, String>> listSorted = list.stream()
				.sorted((i1, i2) -> i1.getValue().compareTo(i2.getValue())).collect(Collectors.toList());

		Map<Integer, String> newMap = new LinkedHashMap<Integer, String>();

		for (Map.Entry<Integer, String> entry : listSorted) {
			newMap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(listSorted);
		System.out.println(newMap);
	}

}
