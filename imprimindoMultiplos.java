package gitHub;

public class imprimindoMultiplos {
	public static void main(String[] args) {
		for (int pares = 0; pares <= 100; pares++) {
			if (pares % 2 == 0) {
				System.out.println(pares);
			}
		}
		for (int tres = 0; tres <= 100; tres++) {
			if (tres % 3 == 0) {
				System.out.println(tres);
			}
		}
		for (int dez = 0; dez <= 100; dez++) {
			if (dez % 10 == 0) {
				System.out.println(dez);
			}
		}
	}
}