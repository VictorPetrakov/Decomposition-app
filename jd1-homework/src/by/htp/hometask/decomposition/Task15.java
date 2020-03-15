package by.htp.hometask.decomposition;

import java.util.ArrayList;
import java.util.Scanner;

//15. ���� ����������� ����� � � N. �������� �����(������) ������������
//������� �, ���������� �������� �������� �����, ����� ���� ������� ����� � � 
//������� �� ������� N.

public class Task15 {

	public static void main(String[] args) {

		System.out.println("������� � ");

		int k = scannerInt();

		System.out.println("������� N ");

		int n = scannerInt();

		ArrayList<Integer> a = new ArrayList<Integer>();

		arrayKN(k, n, a);

		printArrayList(a);
	}

	public static void arrayKN(int k, int n, ArrayList<Integer> a) {

		int x;
		int y;

		for (int i = 0; i < n; i++) {

			int sum = 0;

			y = i;

			while (y != 0) {

				x = y % 10;

				sum = sum + x;

				y = y / 10;

			}

			if (sum == k) {

				a.add(i);

			}
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

	public static void printArrayList(ArrayList<Integer> a) {

		for (int i = 0; i < a.size(); i++) {

			System.out.println(a.get(i));
		}
	}

}
