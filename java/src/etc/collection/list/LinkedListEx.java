package etc.collection.list;

import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.remove(0);
		System.out.println(list);
		
		//LIFO -> last in first out => stack
		//push 앞에서부터 추가
		list.push("김뽀삐"); 
		System.out.println(list);
		
		//pop 마지막에 들어온 데이터를 삭제와 동시에 불러옴
		System.out.println(list.pop());
		System.out.println(list);
		
		//peek 삭제하지않고 데이터를 불러옴
		System.out.println(list.peek());
		System.out.println(list);
		
		//FIFO -> first in first out => Queue
		//offer 마지막에 추가
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		
		//poll 처음들어온 데이터를 삭제와 동시에 불러옴
		System.out.println(list.poll());
		System.out.println(list);
		
		//peek 위와 동일
		

	}

}
