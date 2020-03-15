package by.htp.hometask.decomposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//7. На плоскости заданы своими координатами n точек. Написать метод(методы), 
//определяющие, между какими из пар точек самое большое расстояние. Указание. 
//Координаты точек занести в массив.

public class Task07 {

	public static void main(String[] args) {

		System.out.println("Введите количество точек: ");

		int n = scannerInt();

		double[] point = new double[n * 2];

		ArrayList<Double> distance = new ArrayList<Double>();

		userInputArray(point, n);// заполнение массива координат пользователем

		distBetweenPoint(point, distance, n);// вычисление расстояния между точками

		findMaxDist(point, distance, n);// поиск и вывод максимального растояния

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

	public static void userInputArray(double[] point, int n) {

		for (int i = 0; i < n * 2; i++) {

			point[i] = scannerDouble();
		}
	}

	public static void distBetweenPoint(double[] point, ArrayList<Double> distance, int n) {

		for (int i = 0; i < n * 2; i += 2) {

			for (int j = i + 2; j < n * 2; j += 2) {

				double x = Math.pow(Math.abs(point[j]) - Math.abs(point[i]), 2);
				double y = Math.pow(Math.abs(point[j + 1]) - Math.abs(point[i + 1]), 2);
				double xy = Math.sqrt(x + y);

				distance.add(xy);

			}

		}

	}

	public static void findMaxDist(double[] point, ArrayList<Double> distance, int n) {

		double max = Collections.max(distance);

		int index = 1 + distance.indexOf(max);

		// System.out.println("максимальное расстояние под индексом " + index);

		int count = 0;

		for (int i = 0; i < n * 2; i += 2) {

			for (int j = i + 2; j < n * 2; j += 2) {

				count++;

				if (count == index) {

					System.out.println("максимальное расстояние между " + ((i / 2) + 1) + " и " + ((j / 2) + 1) + " точкой ");

					System.out.println("и оно составляет : " + Collections.max(distance));

					break;
				}
			}
		}
	}

}
