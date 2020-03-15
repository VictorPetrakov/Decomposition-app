package by.htp.hometask.decomposition;

//2. �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ 
//�������� ���� ����������� �����: ���(��) = � * � / ���(��)

public class Task02 {

	public static void main(String[] args) {

		int a = 25;
		int b = 81;

		int x;

		x = nod(a, b);

		System.out.println("��� ����� " + a + " � " + b + " ����� " + x);

		int y;

		y = nok(a, b);

		System.out.println("��� ����� " + a + " � " + b + " ����� " + y);

		System.out.println();
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

	public static int nok(int a, int b) {

		int s;
		int z;

		z = nod(a, b);

		s = (a * b) / z;

		return s;
	}
}
