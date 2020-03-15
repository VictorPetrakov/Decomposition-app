package by.htp.hometask.decomposition;

import java.util.Scanner;

//20. �� ��������� ����� ����� ����� ��� ����. �� ���������� ����� ����� ����� ��� ���� � �.�. 
//������� ����� �������� ���� ����������, ����� ��������� ����? ��� ������� ������ ������������ 
//������������

public class Task20 {

	public static void main(String[] args) {

		int n = scannerInt();

		calcSubtractionsQuantity(n);

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

	public static void calcSubtractionsQuantity(int n) {

		int count = 0;

		while (n > 0) {

			System.out.println("������� " + n);

			int sum1 = sumNum(n);

			n = n - sum1;

			count++;

		}

		System.out.println("���������� ��������� " + count);

	}

	public static int sumNum(int n) {

		int sum = 0;
		int x = n;

		while (x != 0) {

			int a;

			a = x % 10;

			sum = sum + a;

			x = x / 10;
		}

		return sum;
	}

}
