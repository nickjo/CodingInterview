package MySearch;

public class BinarySearchTree {
	private Node root; // ���� Ž��Ʈ���� ��Ʈ
	
	public BinarySearchTree(){
		root = null; // �ʱ� ���¿��� root �ʵ忡 null ����
	}
	
	// ���� Ʈ�� ��� ������ ���� Ŭ���� ����
	private class Node{
		Comparable data; // �� ����� ��
		Node left; // ���� ���� Ʈ��
		Node right; // ������ ���� Ʈ��
		
		/*
		 * Comparable�� java.lang ��Ű���� ����Ǿ� ������ 
		 * '���� ��Ҹ� ���� �Ҽ� �ִ�' ��� �ǹ̸� ���� �������̽��̴�.
		 * */
		Node(Comparable aLabel) {
			// TODO Auto-generated constructor stub
			left = null;
			right = null;
			data = aLabel;
		}
	}
	
	/*
	 * ���� Ž�� Ʈ������ Ű ����  key�� ��带 Ž��
	 * @param ã�� key
	 * @return �߰����� ���ϸ� null ��ȯ
	 * */
	public Node search(Comparable key){
		Node p = root; // ���� ��Ʈ�� �����Ѵ�.
		
		while(p != null){ // ���� �����ϰ� �ִ� ��尡 �����ϴ� �� ����Ѵ�
			int result = key.compareTo(p.data); // ���� ���� Ű�� ��
			
			if(result == 0){ // ���� Ű�� ���ٸ�
				return p; // ������ ��� ��ȯ
			}else if(result < 0){
				p = p.left; // ���� ���� Ʈ���� �̵�
			}else{
				p = p.right; // ������ ���� Ʈ���� �̵�
			}
		}
		return null; // Ž�� ����
	}
	
	/*
	 * ���� Ž�� Ʈ���� Ű ���� key�� ��带 �����Ѵ�.  
	 * 
	 * */
	public Node insert(Comparable key){
		Node p = root; // ���� ��Ʈ�� ó��
		Node parent = null; // parent�� ���� ó�� ���� ����� �θ� ����Ų��
		boolean isLeftChild = false; // p�� parent�� ���� �ڽ��̶�� true,������ �ڽ��̶�� false
		
		while(p != null){
			int result = key.compareTo(p.data);
			if(result == 0){ // ���� Ű�� ���ٸ� �̹� ��� �Ǿ� �ִ�
				return p;
			}else if(result < 0){ // Ű�� �۴ٸ� ���� ����Ʈ���� �̵�
				parent = p;
				isLeftChild = true;
				p = p.left;
			}else{ // Ű�� �� ũ�ٸ� ������ ���� Ʈ���� �̵�
				parent = p;
				isLeftChild = false;
				p = p.right;
			}
		}
		
		// ���ο� ��带 ������ ��ġ�� �����Ѵ�.
		Node newNode = new Node(key); // ���ο� ��带 �Ҵ�
		if(parent == null){
			root = newNode;
		}else if(isLeftChild){
			parent.left = newNode; // ��� parent�� ���� �ڽ��� ��
		}else{
			parent.right = newNode; // ��� parent�� ������ �ڽ��� ��
		}
		return newNode;
	}
	
	/*
	 * ���� Ʈ������ Ű ���� key�� ��带 �����Ѵ�.
	 * @param key ������ Ű
	 * @return ������ �����ϸ� true, ��Ұ� �������� ������ false�� ��ȯ
	 * */
	public boolean delete(Comparable key){
		Node p = root;
		Node parent = null; // parent�� ���� ó�� ���� ����� �θ� ����Ų��.
		boolean isLeftChild = false; // p�� parent�� ���� �ڽ��̶�� true, ������ �ڽ��̶�� false
		
		// ���� ����� ã��
		while(p != null){
			// ���� ���� Ű�� ���Ѵ�.
			int result = key.compareTo(p.data);
			if(result == 0){ // ���� ��� �߰�
				if(p.left == null && p.right == null){ // ������ ���
					// ������ ����
					if(parent == null){
						root = null;
					}else if(isLeftChild){
						parent.left = null;
					}else{
						parent.right = null;
					}
				}else if(p.left == null){ // ������ �ڽĸ� ������ �ִ� ���
					// ������ �ڽ��� �θ��� �ڽ����� �Ѵ�.
					if(parent == null){
						root = p.right;
					}else if(isLeftChild){
						parent.left = p.right;
					}else{
						parent.right = p.right;
					}
				}else if(p.right == null){ // ���� �ڽĸ� ������ �ִ� ���
					// ���� �ڽ��� �θ��� �ڽ����� �Ѵ�.
					if(parent == null){
						root = p.left;
					}else if(isLeftChild){
						parent.left = p.left;
					}else{
						parent.right = p.left;
					}
				}else{ // �¿� 2���� �ڽ��� ������ �ִ� ���
					// ������ ���� Ʈ���� ���� ���� ��Ҹ� ������ �� ���� x�� �ִ´�.
					Node x = deleteMin(p, p.right);
					
					// ���� ó�� ���� ��忡 ���� ���� ��� x�� �ִ´�
					if(parent == null){
						root = x;
					}else if(isLeftChild){
						parent.left = x;
					}else{
						parent.right = x;
					}
					x.right = p.right;
					x.left = p.left;
				}
				return true; // ������ ����
			}else if(result < 0){ // Ű�� ���� ���
				parent = p; // ���� ���� Ʈ���� �̵�
				isLeftChild = true;
				p = p.left;
			}else{ // Ű�� �� ū ���
				parent = p; // ������ ����Ʈ���� �̵�
				isLeftChild = false;
				p = p.right;
			}
		}
		
		// ���� ����� �߰����� ���ߴ�
		return false;
	}
	
	/*
	 * ���� Ž�� Ʈ������ ���� ���� ��Ҹ� �����Ѵ�
	 * 
	 * @param p ���� Ž�� Ʈ��
	 * @param parent p�� �θ� ���
	 * @return ������ ���
	 * */
	private Node deleteMin(Node parent, Node p){
		boolean isLeftChild = false; // p��  parent�� ���� �ڽ��̶�� true, ������ �ڽ��̶�� false.
									 // �޼ҵ尡 ȣ��� ���������� p�� parent�� ������ �ڽ��̱⶧���� �ʱⰪ�� false
		
		while(p.left != null){ // ���� ���� ��Ҹ� ã�´�
			parent = p;
			isLeftChild = true;
			p = p.left;
		}
		
		if(isLeftChild){ // ���� ���� ��Ҹ� �����Ѵ�
			parent.left = p.right;
		}else{
			parent.right = p.right;
		}
		
		return p; // ���� ���� ��Ҹ� ��ȯ
	}
	
	/*
	 * ���� Ž�� Ʈ���� ���� ��ȸ�Ѵ�
	 * */
	private void inorder(Node p){
		if(p == null){
			return;
		}else{
			inorder(p.left);
			System.out.println(p.data);
			inorder(p.right);
		}
	}
	
	public void showAll(){
		inorder(root);
	}
}


