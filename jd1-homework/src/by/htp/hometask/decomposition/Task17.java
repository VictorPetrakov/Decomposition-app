package by.htp.hometask.decomposition;

import java.util.Scanner;

//17. Натуральное число, в записи которого n цифр, называется 
//числом Армстронга, если сумма его цифр, возведенная в степень n, равна 
//самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

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

		System.out.println("Введите число: \r");

		while (!in.hasNextInt()) {

			in.next();

			System.out.println("Некорректный ввод!\r ");
			System.out.println("Введите число: \r");
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

				System.out.println(i + " число Армстронга");
			}
		}
	}

}
