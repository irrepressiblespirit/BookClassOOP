package com.viking.task2;

import java.util.Arrays;

import com.viking.task2.exception.MathNotFoundException;

public class Demo {

	public static void main(String[] args) {
		ShelfImpl shelf=new ShelfImpl();
		System.out.println("Add the book :");
		System.out.println("Author: Gherbert Shield name: Java 8 complete reference");
		shelf.add(new Book(789,8,"Gherbert Shield","Java 8 complete reference","hard","456-233",456.00,"Williams",2010));
		System.out.println("Add the book :");
		System.out.println("Author: Dan Brown name: Angels and Daemons");
		shelf.add(new Book(457,7,"Dan Brown","Angels and Daemons","hard","133-098",98.00,"Ranok",2011));
		System.out.println("Add the book :");
		System.out.println("Author: Bruce Eckel name: Thinking in java");
		shelf.add(new Book(608,12,"Bruce Eckel","Thinking in java","hard","013-256",408.00,"OReally",2009));
		shelf.add(new Book(599,11,"Mark Twain","Tom Sower adventures","hard","277-110",256.00,"Piter",2008));
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("Books in alphabetical order (sorted by name):");
		Arrays.sort(shelf.toArray(), new MyComparator());
		Book[] arr=shelf.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].getName());
		}
		System.out.println("Find book by author Dan Brown-----------------------------------------------------------");
		try {
			Book[] book = shelf.findByAuthor("Dan Brown");
			System.out.println(Arrays.deepToString(book));
			System.out.println("Find book by name T...-----------------------------------------------------");
			Book[] book2=shelf.findByName("T");
			System.out.println(Arrays.deepToString(book2));
			
			System.out.println("Find book by author Lev Tolstoy");
			Book[] book3=shelf.findByAuthor("lev");
			System.out.println(book3[0].getAuthor());
			System.out.println(book3[0].getName());
			
			
		} catch (MathNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}