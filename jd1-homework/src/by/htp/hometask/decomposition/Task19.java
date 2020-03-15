package by.htp.hometask.decomposition;

import java.util.Scanner;

//19. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать 
//декомпозицию. 

public class Task19 {

	public static void main(String[] args) {

		System.out.println("Введите сколько знаков будет в натуральном числе:");

		int n = scannerInt();

		int sumNum = onlyOddNumSum(n);

		calcEvenNumSum(sumNum);

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

	public static int onlyOddNumSum(int n) {

		int sum = 0;

		for (int i = (int) Math.pow(10, (n - 1)); i <= (Math.pow(10, n)) - 1; i++) {

			int j = i;

			boolean k = true;
			boolean p = true;

			while (j != 0) {

				int a;

				a = j % 10;

				if (a % 2 != 0) {

					k = true;

				} else {

					p = false;
				}
				j = j / 10;
			}

			if (k && p == true) {

				sum = sum + i;
			}
		}

		return sum;
	}

	public static void calcEvenNumSum(int sumNum) {

		int x = sumNum;

		int count = 0;

		while (x != 0) {

			int y = x % 10;

			if (y % 2 == 0) {

				count++;
			}
			x = x / 10;
		}

		System.out.println("Сумма чисел с не четными цифрами " + sumNum);
		System.out.println("Количество четных цифр в сумме " + count);
	}
}

