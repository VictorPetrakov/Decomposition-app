package by.htp.hometask.decomposition;

import java.util.Scanner;

//8. ��������� ���������, ������� � ������� A[N] ������� ������ �� �������� �����
//(������� �� ������ �����, ������� ������ ������������� �������� �������, �� ������
//���� ������ ���������).

public class Task08 {

	public static void main(String[] args) {

		System.out.println("������� ������ ������� :");

		int n = scannerInt();

		int maxIndex;
		int maxIndex1;

		double[] mas = new double[n];

		userInputArray(mas, n);

		for (int i = 0; i < mas.length; i++) { // ��� ������������ ������� ������ �� �������

			System.out.println(i + "-- " + mas[i]);
		}

		maxIndex = findMaxElemArray(mas);

		System.out.println("������������ �������� ����� : " + mas[maxIndex]);

		System.out.println("������ ������ � ������������ ��������� " + maxIndex);

		mas[maxIndex] = 0;

		maxIndex1 = findMaxElemArray(mas);

		System.out.println("������ �� �������� �������� ����� " + mas[maxIndex1] + " � ������ � �������� " + maxIndex1);

		System.out.println();

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
