package by.htp.hometask.decomposition;

//10. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task10 {

	public static void main(String[] args) {

		int x;
		
		x = sumFactOddNumber();
		
		System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна " + x);
		
		System.out.println();

	}

	public static int sumFactOddNumber() {

		int sum = 0;

		for (int i = 1; i < 10; i++) {

			if (i % 2 != 0) {

				int f = 1;

				for (int j = 1; j <= i; j++) {

					f = f * j;
				}

				sum = sum + f;

			}

		}

		return sum;
	}
}

