package by.htp.hometask.decomposition;

import java.util.Scanner;

//14. �������� �����(������), ������������, � ����� �� ������ ���� �����
//������ ����.

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

			System.out.println("� ����� " + m + " ������ ���� ��� �  " + n);
		}

		if (count == count1) {

			System.out.println("� ����� " + m + " ������� �� ���� ��� � �  " + n);
		}

		if (count > count1) {

			System.out.println("� ����� " + m + " ������ ���� ��� " + n);
		}
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
