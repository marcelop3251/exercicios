package br.com.numeros;

public class ApplicationNumeros {

	public static void main(String[] args) {

		int numeroA = 10256;
		int numeroB = 512;
		System.out.println(criarNumero(numeroA, numeroB));

	}

	private static int criarNumero(int numberA, int numberB) {
		if (numberA != 0 && numberB != 0) {
			String numeroA = String.valueOf(numberA);
			String numeroB = String.valueOf(numberB);
			String c = "";
			int limite = Math.max(numeroA.length(), numeroB.length());
			for (int i = 0; i <= limite; i++) {
				if (i < numeroA.length()) {
					c += numeroA.charAt(i);
				}
				if (i < numeroB.length()) {
					c += numeroB.charAt(i);
				}
			}
			Integer value = Integer.valueOf(c);
			return value > 1000000 ? -1 : Integer.valueOf(c.toString()); 
		}
		return 0;

	}
}
