package by.htp.hometask.decomposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//7. �� ��������� ������ ������ ������������ n �����. �������� �����(������), 
//������������, ����� ������ �� ��� ����� ����� ������� ����������. ��������. 
//���������� ����� ������� � ������.

public class Task07 {

	public static void main(String[] args) {

		System.out.println("������� ���������� �����: ");

		int n = scannerInt();

		double[] point = new double[n * 2];

		ArrayList<Double> distance = new ArrayList<Double>();

		userInputArray(point, n);// ���������� ������� ��������� �������������

		distBetweenPoint(point, distance, n);// ���������� ���������� ����� �������

		findMaxDist(point, distance, n);// ����� � ����� ������������� ���������

	}

	public static int scannerInt() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int number;

		System.out.println("������� �����: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("������������ ����!\r ");
			System.out.println("������� �����: \r");
		}
		number = in.nextInt();

		return number;

	}

	public static double scannerDouble() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		double number;

		System.out.println("������� �����: \r");

		while (!in.hasNextDouble()) {

			in.next();

			System.out.println("������������ ����! \r");
			System.out.println("������� �����: \r");
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

		// System.out.println("������������ ���������� ��� �������� " + index);

		int count = 0;

		for (int i = 0; i < n * 2; i += 2) {

			for (int j = i + 2; j < n * 2; j += 2) {

				count++;

				if (count == index) {

					System.out.println("������������ ���������� ����� " + ((i / 2) + 1) + " � " + ((j / 2) + 1) + " ������ ");

					System.out.println("� ��� ���������� : " + Collections.max(distance));

					break;
				}
			}
		}
	}

}
