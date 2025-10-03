package ListConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//static array
		
		/*
		 * int a[] = new int[3]; a[0] = 1; a[1] = 2; a[2] = 3;
		 * 
		 * System.out.println(a.length);
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		
		//dynamic array-- ArrayList:
		//
		
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(10);
		
		System.out.println(ar.size());
		for(int j=0; j<ar.size();j++) {
			System.out.println(ar.get(j));
		}
		
		System.out.println("-------------------------------");
		
		ArrayList ar1 = new ArrayList();
		ar1.add(143);
		ar1.add('G');
		ar1.add("santhosh");
		ar1.add(true);
		ar1.add(16.05);
		
		System.out.println(ar1.size());
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		
		System.out.println("Git Test");
		
	}

}
