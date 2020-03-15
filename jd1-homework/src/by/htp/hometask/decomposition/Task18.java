package by.htp.hometask.decomposition;

import java.util.ArrayList;
import java.util.Scanner;

//18. ����� ��� ����������� n-������� �����, ����� � ������� �������� 
//������ ������������ ������������������ (��������, 1234, 5789). ��� ������� ������ 
//������������ ������������.

public class Task18 {

	public static void main(String[] args) {
		
		System.out.println("������� ������� ������ ����� � ����������� ����� :");
		
		int n = scannerInt();
		
		findVozrPosled(n);
		
		System.out.println();

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
	
	public static void findVozrPosled(int n) {
		
		
		for(int i = (int)Math.pow(10, (n - 1)); i < (Math.pow(10, n) - 1); i++) {
			
			int x = i;
			int y;
			
			ArrayList<Integer> mas = new ArrayList<Integer>();
			
			while(x != 0) {
				
				y = x % 10;
				
				mas.add(y);
				
				x = x / 10;
			}
			
			boolean a = true;
			boolean b = true;
			
			for(int j = 0; j < mas.size() - 1; j++) {
				
				if(mas.get(j) > mas.get(j+1)) {
					
					a = true;
				}
				else {
					
					b = false;
				}
			}
			
			if(a && b == true) {
				
				System.out.println(i);
			}
		}
	}

}
