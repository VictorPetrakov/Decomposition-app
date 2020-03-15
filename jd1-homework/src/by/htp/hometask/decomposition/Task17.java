package by.htp.hometask.decomposition;

import java.util.Scanner;

//17. ����������� �����, � ������ �������� n ����, ���������� 
//������ ����������, ���� ����� ��� ����, ����������� � ������� n, ����� 
//������ �����. ����� ��� ����� ���������� �� 1 �� k. ��� ������� ������
//������������ ������������.

public class Task17 {

	public static void main(String[] args) {

		int k = scannerInt();

		numberArmstrong(k);

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

	public static void numberArmstrong(int k) {

		for (int i = 1; i < k; i++) {

			int sum = 0;

			int x = i;

			int y;

			int count = 0;

			while (x != 0) {

				y = x % 10;

				count++;

				sum = sum + y;

				x = x / 10;
			}

			if (Math.pow(sum, count) == i) {

				System.out.println(i + " ����� ����������");
			}
		}
	}

}
