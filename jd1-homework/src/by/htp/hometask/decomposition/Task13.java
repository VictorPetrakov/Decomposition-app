package by.htp.hometask.decomposition;

import java.util.Scanner;

//13. Дано натуральное число N. Написать метод(методы) для формирования
//массива, элементами которого являются цифры числа N.

public class Task13 {

	public static void main(String[] args) {

		int n = scannerInt();

		int num;

		num = numberOfDigit(n);

		int[] mas = new int[num];

		ArrayNumberN(mas, n);
		printArray(mas);

		System.out.println();

	}

	public static int numberOfDigit(int n) {

		int a = n;

		int count;

		count = 0;

		while (a != 0) {

			count++;

			a = a / 10;

		}

		return count;

	}

	public static void ArrayNumberN(int[] mas, int n) {

		int x;

		for (int i = 0; i < mas.length; i++) {

			x = n % 10;

			mas[i] = x;

			n = n / 10;

		}
	}

	public static void printArray(int mas[]) {

		for (int i = 0; i < mas.length; i++) {

			System.out.println(mas[i]);
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
