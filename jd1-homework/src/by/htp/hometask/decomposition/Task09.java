package by.htp.hometask.decomposition;

import java.util.Scanner;

//9. Ќаписать метод(методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно простыми.

public class Task09 {

	public static void main(String[] args) {

		System.out.println("¬ведите три числа :");

		int a = scannerInt();
		int b = scannerInt();
		int c = scannerInt();

		int x = nod3number(a, b, c);

		checkSimpleNumber(x, a, b, c);

		System.out.println();

	}

	public static void checkSimpleNumber(int x, int a, int b, int c) {

		if (x == 1) {

			System.out.println("„исла " + a + " " + b + " " + c + " €вл€ютс€ простыми!");
		} else {

			System.out.println("„исла " + a + " " + b + " " + c + " не €вл€ютс€ простыми!");
		}

		System.out.println();
	}

	public static int nod3number(int a, int b, int c) {

		int x = nod(a, b);
		int y = nod(x, c);

		return y;
	}

	public static int nok(int a, int b) {

		int s;
		int z;

		z = nod(a, b);

		s = (a * b) / z;

		return s;
	}

	public static int nod(int a, int b) {

		int x = 0;

		int max = Math.min(a, b);

		for (int i = 1; i <= max; i++) {

			if (a % i == 0 && b % i == 0) {

				x = i;
			}
		}

		return x;
	}

	public static int scannerInt() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int number;

		System.out.println("¬ведите число: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("Ќекорректный ввод!\r ");
			System.out.println("¬ведите число: \r");
		}
		number = in.nextInt();

		return number;

	}
}
