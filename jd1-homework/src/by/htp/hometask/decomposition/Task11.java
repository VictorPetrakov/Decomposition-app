package by.htp.hometask.decomposition;

import java.util.Scanner;

//11. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3];
//D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления 
//суммы трех последовательно расположенных элементов массива с номерами от k до m.")

public class Task11 {

	public static void main(String[] args) {

		System.out.println("Введите величну массива ");

		int n = scannerInt();

		double[] d = new double[n];

		userInputArray(d, n);

		sum3ElemArray(d, n);

		System.out.println();
	}

	public static void userInputArray(double[] d, int n) {

		for (int i = 0; i < n; i++) {

			d[i] = scannerDouble();
		}
	}

	public static double sum3ElemArray(double[] d, int n) {

		System.out.println("Введите с какого индекса складывать три последовательно расположенных элемента");

		int k = scannerInt();

		double sum = 0;

		for (int i = 1; i < n; i++) {

			if (i == k) {

				sum = d[i] + d[i + 1] + d[i + 2];

				System.out.println("Сумма D[" + k + "] + D[" + (k + 1) + "] + D[" + (k + 2) + "] равна " + sum);

			}
		}
		
		return sum;
	}

	public static double scannerDouble() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		double number;

		System.out.println("Введите число: \r");

		while (!in.hasNextDouble()) {

			in.next();

			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите число: \r");
		}

		number = in.nextDouble();

		return number;

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
