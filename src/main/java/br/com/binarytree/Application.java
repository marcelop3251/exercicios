package br.com.binarytree;

import br.com.binarytree.entity.BinaryTree;
import br.com.binarytree.service.BinaryTreeService;

public class Application {

	
	public static void main(String[] args) {
		
		BinaryTreeService serviceBinary = new BinaryTreeService();
		
		serviceBinary.inserirBinary(25);
		serviceBinary.inserirBinary(20);
		serviceBinary.inserirBinary(30);
		serviceBinary.inserirBinary(15);
		serviceBinary.inserirBinary(12);
		serviceBinary.inserirBinary(40);
		serviceBinary.inserirBinary(26);
		serviceBinary.inserirBinary(36);
		
		
		System.out.println(soma(serviceBinary.getBinaryTree()));
	}
	
	
	public static int soma(BinaryTree binary){
		
		if(binary == null){
			return 0;
		}else{
			int resultadoDaSoma = 0;
			resultadoDaSoma += soma(binary.getLeft());
			resultadoDaSoma += soma(binary.getRight());
			resultadoDaSoma += binary.getValor();			
			return resultadoDaSoma;
		}
		
		
	}
}
