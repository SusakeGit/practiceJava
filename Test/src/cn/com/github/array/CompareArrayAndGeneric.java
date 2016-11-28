package cn.com.github.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ContainerComparison {

	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Sphere" + id;
	}
}

public class CompareArrayAndGeneric {
	public static void main(String[] args) {
		ContainerComparison[] comparison = new ContainerComparison[10];
		for (int i = 0; i < 5; i++) {
               comparison[i] = new ContainerComparison();   
		}
		System.out.println(Arrays.toString(comparison));
		System.out.println(comparison[4]);
		
		List<ContainerComparison> list = new ArrayList<ContainerComparison>();
		for (int i = 0; i < 5; i++) {
			list.add(new ContainerComparison());
		}
		System.out.println(list);
		System.out.println(list.get(4));
		
		int[] integers = {0,1,2,3,4,5};
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
		list2.add(97);
		System.out.println(list2);
		System.out.println(list2.get(4));
	}
}
