package by.htp.hometask.decomposition;

//5. Написать метод(методы) для нахождения суммы 
//большего и меньшего из трех чисел.

public class Task05 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		a = 25;
		b = 15;
		c = 7;

		int x;

		x = max3number(a, b, c);

		int y;

		y = min3number(a, b, c);

		int sum;

		sum = x + y;

		System.out.println("Сумма большего и меньшего числа из трех равна " + sum);

		System.out.println();
	}

	public static int max3number(int a, int b, int c) {

		int x = Math.max(a, b);
		int y = Math.max(x, c);

		return y;

	}

	public static int min3number(int a, int b, int c) {

		int x = Math.min(a, b);
		int y = Math.min(x, c);

		return y;
	}

}
