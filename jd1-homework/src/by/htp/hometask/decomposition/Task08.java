package by.htp.hometask.decomposition;

import java.util.Scanner;

//8. Составить программу, которая в массиве A[N] находит второе по величине число
//(вывести на печать число, которое меньше максимального элемента массива, но больше
//всех других элементов).

public class Task08 {

	public static void main(String[] args) {

		System.out.println("Введите размер массива :");

		int n = scannerInt();

		int maxIndex;
		int maxIndex1;

		double[] mas = new double[n];

		userInputArray(mas, n);

		for (int i = 0; i < mas.length; i++) { // для самопроверки выводим массив на консоль

			System.out.println(i + "-- " + mas[i]);
		}

		maxIndex = findMaxElemArray(mas);

		System.out.println("Максимальное значение равно : " + mas[maxIndex]);

		System.out.println("Индекс ячейки с максимальным значением " + maxIndex);

		mas[maxIndex] = 0;

		maxIndex1 = findMaxElemArray(mas);

		System.out.println("Второе по величине значение равно " + mas[maxIndex1] + " у ячейки с индексом " + maxIndex1);

		System.out.println();

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

	public static void userInputArray(double[] mas, int n) {

		for (int i = 0; i < n; i++) {

			mas[i] = scannerDouble();
		}
	}

	public static int findMaxElemArray(double[] mas) {

		double maxNumber = mas[0];

		int maxIndex = 0;

		for (int i = 0; i < mas.length; i++) {

			if (maxNumber <= mas[i]) {

				maxNumber = mas[i];

				maxIndex = i;
			}
		}

		return maxIndex;
	}

}

