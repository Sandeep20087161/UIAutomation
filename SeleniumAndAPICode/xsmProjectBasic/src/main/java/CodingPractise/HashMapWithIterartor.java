package CodingPractise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapWithIterartor {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		hashMap.put(1, "Delhi");
		hashMap.put(2, "Kolkata");
		hashMap.put(3, "Bangalore");
		hashMap.put(4, "Hyderabad");
		
		Iterator<Entry<Integer, String>> hm=hashMap.entrySet().iterator();
		while (hm.hasNext()) {
			Map.Entry<Integer, String> newhm=(Map.Entry<Integer, String>)hm.next();
			System.out.println(newhm.getKey() +">>"+newhm.getValue());
		}

	}

}
