package br.com.binarytree.entity;

/**
 * Essa classe representa uma Arvore Binária
 * @author Marcelo
 *
 */
public class BinaryTree {
	
	private int valor;
	
	private BinaryTree left;
	
	private BinaryTree right;
	
	
	public BinaryTree(int valor){
		this.valor = valor;
	}
	
	
	public int getValor(){
		return this.valor;
	}


	public BinaryTree getLeft() {
		return left;
	}


	public BinaryTree getRight() {
		return right;
	}


	public void setLeft(BinaryTree left) {
		this.left = left;
	}


	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	
	
	


}
