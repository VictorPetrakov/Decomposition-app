package by.htp.hometask.decomposition;

import java.util.ArrayList;
import java.util.Scanner;

//15. Даны натуральные числа К и N. Написать метод(методы) формирования
//массива А, элементами которого являются числа, сумма цифр которых равна К и 
//которые не большее N.

public class Task15 {

	public static void main(String[] args) {

		System.out.println("Введите К ");

		int k = scannerInt();

		System.out.println("Введите N ");

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

		System.out.println("Введите число: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
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
