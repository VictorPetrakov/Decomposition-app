package by.htp.hometask.decomposition;

//1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади

public class Task01 {

	public static void main(String[] args) {

		double x1, y1;
		double x2, y2;
		double x3, y3;

		x1 = 2;
		y1 = 3;
		x2 = 5;
		y2 = 5;
		x3 = 4;
		y3 = 8;

		double sideA;
		sideA = sideOfTriangle(x1, x2, y1, y2);

		double sideB;
		sideB = sideOfTriangle(x1, x3, y1, y3);

		double sideC;
		sideC = sideOfTriangle(x2, x3, y2, y3);

		double p1 = semiperimetrTriangle(sideA, sideB, sideC);

		double area = areaTriangle(p1, sideA, sideB, sideC);

		System.out.println("Площадь треугольника равна " + area);
		
		System.out.println();
	}

	public static double sideOfTriangle(double x1, double x2, double y1, double y2) {

		double a;

		a = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

		return a;
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
