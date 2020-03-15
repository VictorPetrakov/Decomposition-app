package by.htp.hometask.decomposition;

//4. Написать метод(методы) для нахождения наименьшего общего кратного
// трех натуральных чисел.

public class Task04 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		a = 25;
		b = 50;
		c = 250;

		int z;

		z = nok3number(a, b, c);

		System.out.println("НОК чисел " + a + " / " + b + " / " + c + " равен " + z);

		System.out.println();

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

	public static int nok3number(int a, int b, int c) {

		int x = nok(a, b);

		int y = nok(x, c);

		return y;

	}

}

