package core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestCore {

	public static void main(String[] ar){
		/*System.out.println("in main method");
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(1.1);
		list.add(2.2);
		list.stream().map(x->x*3).forEach(e->System.out.println(e));
		Double l=list.stream().collect(Collectors.summingDouble(Double::doubleValue));
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(3);
		list1.add(5);
		list1.add(9);
		list1.stream().map(i->i+1).forEach(System.out::println);
		
		System.out.println();
		
		list1.forEach(System.out::println);*/
		
		//lamda expresions
		
	
	
	Display  d=()->{System.out.println("hello");return "hi";};
	d.hell();
	Display  d1=Display::h2;
	d1.h();
		

		
	}


}
