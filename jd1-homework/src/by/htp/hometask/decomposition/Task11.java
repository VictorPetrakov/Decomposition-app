package by.htp.hometask.decomposition;

import java.util.Scanner;

//11. ����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3];
//D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. ���������. ��������� �����(������) ��� ���������� 
//����� ���� ��������������� ������������� ��������� ������� � �������� �� k �� m.")

public class Task11 {

	public static void main(String[] args) {

		System.out.println("������� ������� ������� ");

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

		System.out.println("������� � ������ ������� ���������� ��� ��������������� ������������� ��������");

		int k = scannerInt();

		double sum = 0;

		for (int i = 1; i < n; i++) {

			if (i == k) {

				sum = d[i] + d[i + 1] + d[i + 2];

				System.out.println("����� D[" + k + "] + D[" + (k + 1) + "] + D[" + (k + 2) + "] ����� " + sum);

			}
		}
		
		return sum;
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

}
