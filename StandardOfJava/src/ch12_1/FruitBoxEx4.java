package ch12_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit{
	String name;
	int weight;
	
	public Fruit(String name, int weight) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.weight = weight;
	}
	
	public String toString(){return name + "(" + weight + ")";}
}

class Apple extends Fruit{
	public Apple(String name, int weight) {
		super(name, weight);
	}
}

class Grape extends Fruit{
	public Grape(String name, int weight) {
		super(name, weight);
	}
}

class AppleComp implements Comparator<Apple>{
	@Override
	public int compare(Apple o1, Apple o2) {
		// TODO Auto-generated method stub
		return o2.weight - o1.weight;
	}
}

class GrapeComp implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		// TODO Auto-generated method stub
		return o2.weight - o1.weight;
	}
}

class FruitComp implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return o2.weight - o1.weight;
	}
}

public class FruitBoxEx4 {
	public static void main(String[] args) {
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		appleBox.add(new Apple("Green Apple", 300));
		appleBox.add(new Apple("Green Apple", 100));
		appleBox.add(new Apple("Green Apple", 200));
		
		grapeBox.add(new Grape("Green Grape", 400));
		grapeBox.add(new Grape("Green Grape", 600));
		grapeBox.add(new Grape("Green Grape", 500));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
		System.out.println();
		
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
	}
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item){list.add(item);}
	T get(int i){return list.get(i);}
	int size(){return list.size();}
	public String toString(){return list.toString();}
	public ArrayList<T> getList(){return list;}
}
