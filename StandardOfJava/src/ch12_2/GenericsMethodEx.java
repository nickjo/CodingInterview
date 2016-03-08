package ch12_2;

import java.util.ArrayList;
import java.util.List;

class Product{
	public String toString(){
		return "Product";
	}
}

class Car extends Product{
	public String toString(){
		return "Car";
	}
}

class Computer extends Product{
	public String toString(){
		return "Computer";
	}
}

public class GenericsMethodEx {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		List<Car> list1 = new ArrayList<>();
		List<Computer> list2 = new ArrayList<>();
		
		// list
		list.add(new Product());
		list.add(new Car());
		list.add(new Computer());
		
		// list1 
		list1.add(new Car());

		// list2
		list2.add(new Computer());
		
		display(list, list1, list2);
		//display(list1, list1, list1);
	}
	
	public static void display(List<? extends Product> list,
			List<? extends Product> list1,
			List<? extends Product> list2){
		
		System.out.println("list: "+ list.toString());
		System.out.println("list1: " + list1.toString());
		System.out.println("list2: " + list2.toString());
	}
	
	/*public static <T extends Product> void display(List<T> list,
			List<T> list1,
			List<T> list2){
		
		System.out.println("list: "+ list.toString());
		System.out.println("list1: " + list1.toString());
		System.out.println("list2: " + list2.toString());
	}*/
}
