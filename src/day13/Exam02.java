package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam02 {

	public static void main(String[] args) {
		HashMap<String, String> map
			= new HashMap<>();
		map.put("abcd", "1234");
		map.put("1234", "abcd");
		map.put("naver", "naver1234");
		Set<String> set =  map.keySet();
		//아래 Iterator의 클래스는 map의 key해당하는 클래스이름을 넣어주어야 한다.
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String id = it.next();
			String pw = map.get(id);
			System.out.println(id + " : " + pw);
		}
	}
}
