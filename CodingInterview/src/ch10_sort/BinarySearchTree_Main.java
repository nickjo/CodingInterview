package ch10_sort;

import MySearch.BinarySearchTree;

public class BinarySearchTree_Main {
	public static void main(String[] args){
		BinarySearchTree bt = new BinarySearchTree();
		
		bt.insert(10);
		bt.insert(11);
		bt.insert(12);
		bt.insert(13);
		bt.insert(14);
		bt.insert(8);
		bt.insert(4);
		
		bt.showAll();
		
		bt.delete(12);
		System.out.println();
		bt.showAll();
		
		System.out.println(bt.search(13));
		
	}
}
