package by.htp.hometask.decomposition;

import java.util.Scanner;

//16. ��� ������� ����� ���������� �����������, ���� ��� ���������� ����
//�� ����� �� 2 (��������, 41 � 43). ����� � ���������� ��� ���� ���������� ��
//������� [n,2n], ��� n - �������� ����������� ����� ������ 2. ��� ������� ������
// ������������ ������������.

public class Task16 {

	public static void main(String[] args) {

		System.out.println("������� n ��� ������������ ������� ");

		int n = scannerInt();

		System.out.println("� ������� [" + n + ", " + (n * 2) + "]");

		twinNumber(n);

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

	public static void twinNumber(int n) {

		for (int i = n; i < 2 * n; i++) {

			if ((i + 2) - i == 2) {

				System.out.println("���������� �������� " + i + " � " + (i + 2));
			}
		}
	}

}
