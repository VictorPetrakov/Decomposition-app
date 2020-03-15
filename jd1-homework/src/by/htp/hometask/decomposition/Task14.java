package by.htp.hometask.decomposition;

import java.util.Scanner;

//14. Написать метод(методы), определяющий, в каком из данных двух чисел
//больше цифр.

public class Task14 {

	public static void main(String[] args) {

		int n = scannerInt();
		int m = scannerInt();

		largerNumber(n, m);

		System.out.println();

	}

	public static void largerNumber(int n, int m) {

		int count = 0;
		int count1 = 0;

		int x = n;
		int y = m;

		while (x != 0) {

			count++;

			x = x / 10;
		}

		while (y != 0) {

			count1++;

			y = y / 10;
		}

		if (count < count1) {

			System.out.println("В числе " + m + " больше цифр чем в  " + n);
		}

		if (count == count1) {

			System.out.println("В числе " + m + " столько же цифр что и в  " + n);
		}

		if (count > count1) {

			System.out.println("В числе " + m + " меньше цифр чем " + n);
		}
	}

	public static int scannerInt() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int number;

		System.out.println("Введите число: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
		}
		number = in.nextInt();

		return number;

	}

}

