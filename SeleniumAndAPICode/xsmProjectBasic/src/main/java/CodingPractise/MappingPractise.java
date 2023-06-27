package CodingPractise;

import java.util.HashMap;
import java.util.Map;

public class MappingPractise {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Delhi");
		hashMap.put(2, "Kolkata");
		hashMap.put(3, "Bangalore");
		hashMap.put(4, "Hyderabad");
		
		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+">>"+entry.getValue());
		}
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.containsValue("Delhi"));
		System.out.println(hashMap.hashCode());
	}

}
