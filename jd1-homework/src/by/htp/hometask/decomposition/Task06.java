package by.htp.hometask.decomposition;

//6. ��������� ������� ����������� �������������� �� �������� �,
//��������� ����� ���������� ������� ������������.

public class Task06 {

	public static void main(String[] args) {

		double a;

		a = 5;

		double p1;

		p1 = semiperimetrTriangle(a, a, a);

		double s;

		s = areaTriangle(p1, a, a, a);

		double s1;

		s1 = s * 6;

		System.out.println("������� ����������� �������������� �� ������� " + a + " ����� " + s1);

		System.out.println();

	}

	public static double semiperimetrTriangle(double sideA, double sideB, double sideC) {

		double p;
		double p1;

		p = sideA + sideB + sideC;

		p1 = p / 2;

		return p1;
	}

	public static double areaTriangle(double p1, double sideA, double sideB, double sideC) {

		double s;

		s = Math.sqrt(p1 * (p1 - sideA) * (p1 - sideB) * (p1 - sideC));

		return s;

	}

}
