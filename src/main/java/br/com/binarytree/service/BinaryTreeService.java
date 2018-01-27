package br.com.binarytree.service;

import br.com.binarytree.entity.BinaryTree;

/**
 * Essa classe � respons�vel por criar uma Arvore Binaria
 * @author Marcelo
 *
 */
public class BinaryTreeService {
	
	private BinaryTree root;
	
	/**
	 * Esse m�todo insere o valor que representa um deterninado No
	 * @param valor
	 * 			O valor dado ao No
	 */
	public void inserirBinary(int valor){
		if(root == null){
			root = new BinaryTree(valor);
		}else{
			BinaryTree no = new BinaryTree(valor); 
			inserirBinary(root,no);
			
		}
	}

	/**
	 * Essa classe decide em qual lado ser� criado o pr�ximo n� com base no n� raiz
	 * 	
	 *
	 * @param root
	 * 			O No que esta sendo processado
	 * @param no
	 * 			O no que fara parte do n� que esta sendo processado
	 */
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
	
	
	/**
	 * 
	 * @return
	 * 		Retorna o n� criado
	 */
	public BinaryTree getBinaryTree(){		
		return root;
	}
		
		
	

}
