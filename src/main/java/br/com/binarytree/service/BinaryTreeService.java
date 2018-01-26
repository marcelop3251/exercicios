package br.com.binarytree.service;

import br.com.binarytree.entity.BinaryTree;

public class BinaryTreeService {
	
	private BinaryTree root;
	
	public void inserirBinary(int valor){
		if(root == null){
			root = new BinaryTree(valor);
		}else{
			BinaryTree no = new BinaryTree(valor); 
			inserirBinary(root,no);
			
		}
	}

	private void inserirBinary(BinaryTree root, BinaryTree no) {
		if(root.getValor() < no.getValor()){
			if(root.getRight() == null){
				root.setRight(no);
			}else{
				inserirBinary(root.getRight(),no);
			}			
		} else{
			if(root.getLeft() == null){
				root.setLeft(no);
			}else{
				inserirBinary(root.getLeft(),no);
			}
		}
		
	}
	
	
	public BinaryTree getBinaryTree(){		
		return root;
	}
		
		
	

}
