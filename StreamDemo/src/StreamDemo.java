import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String args[])
	 {
		List<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(56);
		list.add(33);
		list.add(77);
		list.add(88);
		list.add(49);
		
		System.out.println(list);
		List l1=list.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l1);
		List l2=list.stream().map(x->x+x).collect(Collectors.toList());
		System.out.println(l2);
		
		//Stream.iterate(1,x->x+1).forEach(System.out::println);
		//List l5=list.stream().flatMap(e->Stream.ofNullable(e)).collect(Collectors.toList());
		
	 }
	
}
