package CodingPractise;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] keys = { 1, 2, 3, 4 };
		String[] values = { "delhi", "mumbai", "kolkata", "hyderabad" };
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = 0; i < keys.length; i++) {
			hm.put(keys[i], values[i]);
		}

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + ">>" + entry.getValue());

		}
	}

}
