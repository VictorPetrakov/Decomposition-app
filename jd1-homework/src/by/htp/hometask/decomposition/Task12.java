package by.htp.hometask.decomposition;

import java.util.Scanner;

//12. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
//вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task12 {

	public static void main(String[] args) {

		System.out.println("Введите сторону x : ");

		double x = scannerDouble();

		System.out.println("Введите сторону y : ");

		double y = scannerDouble();

		System.out.println("Введите сторону z : ");

		double z = scannerDouble();

		System.out.println("Введите сторону t : ");

		double t = scannerDouble();

		double semiP;
		semiP = semiPerimetrQuadrangle(x, y, z, t);//полупериметр

		double angle;
		angle = angleOpposite(x, y, z, t);//угол напротив прямого

		double area = areaQuadrangle(semiP, x, y, z, t, angle);//площадь четырехугольника

		System.out.println("Площадь четырехугольника с прямым угол равна " + area);

		System.out.println();
	}

	public static double semiPerimetrQuadrangle(double x, double y, double z, double t) {

		double p;

		p = (x + y + z + t) / 2;

		return p;
	}

	public static double angleOpposite(double x, double y, double z, double t) {

		double a;
		a = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));// диагональ четырехугольника с одним прямым углом

		double w;
		w = Math.acos((Math.pow(z, 2) + Math.pow(t, 2) - Math.pow(a, 2)) / 2 * z * t);// угол напротив прямого

		return w;
	}

	public static double areaQuadrangle(double p, double x, double y, double z, double t, double angle) {

		double s = Math
				.sqrt((p - x) * (p - y) * (p - z) * (p - t) - (x * y * z * t * (1 + Math.cos((Math.PI / 2) + angle))));

		return s;

	}

	public static double scannerDouble() {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		double number;

		System.out.println("Введите число: \r");

		while (!in.hasNextDouble()) {

			in.next();

			System.out.println("Некорректный ввод! \r");
			System.out.println("Введите число: \r");
		}

		number = in.nextDouble();

		return number;

	}

}

