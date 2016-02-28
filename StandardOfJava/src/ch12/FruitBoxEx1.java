package ch12;

import java.util.ArrayList;

class Fruit 			  {public String toString(){return "Fruit";}}
class Apple extends Fruit {public String toString(){return "Apple";}}
class Grape extends Fruit {public String toString(){return "Grape";}}
class Toy 				  {public String toString(){return "Toy";}}


public class FruitBoxEx1 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		//Box1<Toy> toyBox = new FruitBox<>();
		
		fruitBox.add(new Fruit());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		grapeBox.add(new Grape());
		//toyBox.add(new Grape());
		
		System.out.println(fruitBox.get(0));
		System.out.println(appleBox.get(0));
		System.out.println(grapeBox.toString());
		
		System.out.println();
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
		System.out.println();
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
		System.out.println(Juicer.makeJuice(grapeBox));
	}
}

class Box1<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item){list.add(item);}
	T get(int i){return list.get(i);}
	int size(){return list.size();}
	public String toString(){return list.toString();}
	public ArrayList<T> getList(){return list;}
}

class Juice{
	String name;
	
	public Juice(String name) {
		// TODO Auto-generated constructor stub
		this.name = name + " Juice";
	}
	public String toString(){return name;}
}

class Juicer{
	static<T extends Fruit> Juice makeJuice(FruitBox<T> box){
		String temp = "";
		
		for(Fruit f: box.getList()){temp += f + " ";}
		
		return new Juice(temp);
	}
}

class FruitBox<T extends Fruit> extends Box1<T>{}