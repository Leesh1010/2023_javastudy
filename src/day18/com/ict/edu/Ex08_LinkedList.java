package day18.com.ict.edu;

import java.util.Iterator;
import java.util.LinkedList;

//Queue(큐) 인터페이스 : FIFO (First In First Out)
	//                   먼저 들어온 정보가 먼저 나감
	//Queue를 구현한 클래스 : LinkedList
public class Ex08_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		
		// 추가, 삽입 : add,addFirst,addLast,offer, offerFirst, offerLast
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("또치");
		linkedList.addLast("희동이");
		linkedList.offerLast("둘리"); // 중복가능
		linkedList.add(3,"차두리"); 
		System.out.println(linkedList);
		
		if(linkedList.contains("둘리")) { //둘리 오디 ~?
			System.out.println(linkedList.indexOf("둘리"));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
		
		//치환
		linkedList.set(linkedList.lastIndexOf("둘리"),"공실이");	
		
		}
		System.out.println(linkedList);
		
		// 삭제 : remove(Object c), removeFirst(),removeLast()
		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(linkedList);
		linkedList.remove(); // 아무것도 안쓰면 맨 앞에가 삭제딤
		System.out.println(linkedList);
		
		//출력
		for (String k : linkedList) {
			System.out.println(k + "바보");
		}
		
		Iterator<String> ik = linkedList.iterator();
		while (ik.hasNext()) {
			String k = (String) ik.next();
			System.out.println(k + "멍청이");
		}
	}
}
