package by.htp.hometask.decomposition;

import java.util.Scanner;

//20. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
//Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать 
//декомпозицию

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

		System.out.println("Ââåäèòå ÷èñëî: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("Íåêîððåêòíûé ââîä!\r ");
			System.out.println("Ââåäèòå ÷èñëî: \r");
		}
		number = in.nextInt();

		return number;

	}

	public static void calcSubtractionsQuantity(int n) {

		int count = 0;

		while (n > 0) {

			System.out.println("ââåäåíî " + n);

			int sum1 = sumNum(n);

			n = n - sum1;

			count++;

		}

		System.out.println("Êîëè÷åñòâî âû÷èòàíèé " + count);

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
