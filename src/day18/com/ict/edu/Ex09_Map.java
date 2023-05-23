package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex09_Map {
	// Map 인터페이스 : Key와 Value가 1:1 매핑 구조를 가지고 있다.
	//               Key는 중복 될 수 없다.(기존 Value가 삭제된다.(덮어쓰기))
	//               Value는 중복 가능
	//               Key를 호출하면 Value가 나온다.
	//               Key를 별도로 관리 = KeySet()
	//               add 추가를 못함
	//               put(Key,Value)로 추가 할 수 있다.
	// 관련 클래스 : HashMap
	public static void main(String[] args) {
		
		// 생성 (Key가 숫자인 경우)
		HashMap<Integer,String>map1 = new HashMap<>();
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "영국");
		map1.put(8, "태국");
		map1.put(10, "중국");
		map1.put(5, "남아프리카공화국");
		System.out.println(map1);
		
		map1.put(10, "대만");
		System.out.println(map1);
		
		// 하나씩 출력 get(Key)
		System.out.println(map1.get(2)); // Key를 호출. 출력은 Value로 나옴
		System.out.println(map1.get(3)); // 없다고 나옴
		
		//삭제 : remove(Key):Key,Value 삭제
		map1.remove(5);
		System.out.println(map1);
		
		//Key를 set에서 관리하게 한다. => KeySet();
		for (Integer k : map1.keySet()) {
			
			System.out.println(k); // 키 값만 출력
			System.out.println(map1.get(k)); // 밸류만 출력
			}
		System.out.println("================");
		
		Iterator<Integer> it= map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(k + ":" +map1.get(k));
		}
		System.out.println("================");
		// entrySet() 메서드는 Key, Value의 값이 모두 필요한 경우 사용
		Set set1 = map1.entrySet();
		System.out.println(set1);
		Iterator it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry entry = (Entry) it2.next();
			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key+ ":" +value);
			
		}
		
		
	}
}
