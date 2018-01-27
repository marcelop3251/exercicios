package br.com.binarytree.service;

import br.com.binarytree.entity.BinaryTree;

/**
 * Essa classe é responsável por criar uma Arvore Binaria
 * @author Marcelo
 *
 */
public class BinaryTreeService {
	
	private BinaryTree root;
	
	/**
	 * Esse metodo insere o valor que representa um deterninado No
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
	 * Essa classe decide em qual lado sera criado o próximo nó com base no No raiz
	 * 	
	 *
	 * @param root
	 * 			O No que esta sendo processado
	 * @param no
	 * 			O No que fara parte do No que esta sendo processado
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
	 * Esse metodo recupera um No a partir do seu valor
	 * @param valor
	 * 			O valor contido no No
	 * @return
	 * 		Um BinaryTree ou null caso não encontre um valor valido
	 */
	public BinaryTree geBinaryTree(int valor){
		return getBinaryTree(root,valor);
	}

	/**
	 * Esse método varre a Arvore Binaria procurando o valor passado como parametro
	 * @param root
	 * 			O no onde devera ser procurado
	 * @param valor
	 * 			O valor contido no No
	 * @return
	 * 		Um BinaryTree ou null caso não encontre um valor valido
	 */
	private BinaryTree getBinaryTree(BinaryTree root, int valor) {
		
		if(root != null){
			if(root.getValor() == valor){
				return root;
			}else{
				if(root.getValor() < valor){
					return getBinaryTree(root.getRight(), valor);
				}else{
					return getBinaryTree(root.getLeft(), valor);
				}
			}
		}
		return null;
	}
		
		
	

}
