package by.htp.hometask.decomposition;

import java.util.Scanner;

//9. �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������.

public class Task09 {

	public static void main(String[] args) {

		System.out.println("������� ��� ����� :");

		int a = scannerInt();
		int b = scannerInt();
		int c = scannerInt();

		int x = nod3number(a, b, c);

		checkSimpleNumber(x, a, b, c);

		System.out.println();

	}

	public static void checkSimpleNumber(int x, int a, int b, int c) {

		if (x == 1) {

			System.out.println("����� " + a + " " + b + " " + c + " �������� ��������!");
		} else {

			System.out.println("����� " + a + " " + b + " " + c + " �� �������� ��������!");
		}

		System.out.println();
	}

	public static int nod3number(int a, int b, int c) {

		int x = nod(a, b);
		int y = nod(x, c);

		return y;
	}

	public static int nok(int a, int b) {

		int s;
		int z;

		z = nod(a, b);

		s = (a * b) / z;

		return s;
	}

	public static int nod(int a, int b) {

		int x = 0;

		int max = Math.min(a, b);

		for (int i = 1; i <= max; i++) {

			if (a % i == 0 && b % i == 0) {

				x = i;
			}
		}

		return x;
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
