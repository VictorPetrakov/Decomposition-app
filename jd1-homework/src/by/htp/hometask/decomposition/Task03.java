package by.htp.hometask.decomposition;

//3. Написать метод(методы) для нахождения наибольшего общего делителя
//четырех натуральных чисел.

public class Task03 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		
		a = 25;
		b = 50;	
		c = 250;		
		d = 500;

		int z;

		z = nod4number(a, b, c, d);

		System.out.println("НОД чисел " + a + " / " + b + " / " + c + " / " + d + " равен " + z);

		System.out.println();
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

	public static int nod4number(int a, int b, int c, int d) {

		int x = nod(a, b);
		int y = nod(c, d);

		int z = nod(x, y);

		return z;
	}
}
