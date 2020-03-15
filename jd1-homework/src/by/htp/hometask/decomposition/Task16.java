package by.htp.hometask.decomposition;

import java.util.Scanner;

//16. Два простых числа называются «близнецами», если они отличаются друг
//от друга на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из
//отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
// использовать декомпозицию.

public class Task16 {

	public static void main(String[] args) {

		System.out.println("Введите n для формирования отрезка ");

		int n = scannerInt();

		System.out.println("В отрезке [" + n + ", " + (n * 2) + "]");

		twinNumber(n);

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

	public static void twinNumber(int n) {

		for (int i = n; i < 2 * n; i++) {

			if ((i + 2) - i == 2) {

				System.out.println("Близнецами являются " + i + " и " + (i + 2));
			}
		}
	}

}
