package EJ2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();
		try (Scanner sc = new Scanner(System.in)) {
			int numero = 0;
			do {
				System.out.println("Introduce un numero:");
				numero = sc.nextInt();
				sc.nextLine();
				s.add(numero);
				System.out.println("Cantidad de números guardados: " + s.size());
			} while (s.size() != 5);

			int suma = 0;
			System.out.println("Los números son:");
			for (Integer num : s) {
				System.out.println(num);
				suma += num;
			}

			System.out.println("la suma es de" + suma);
		}
	}

}
