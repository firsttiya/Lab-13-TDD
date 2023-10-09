package main;

import java.util.Scanner;

public class sumOfDigit {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int number;
	        do {
	            System.out.print("ป้อนจำนวนเต็มบวกที่มากกว่าสองหลัก: ");
	            number = scanner.nextInt();
	        } while (number < 10);

	        int result = computeSumOfDigitsUntilSingleDigit(number);
	        System.out.println("ผลลัพธ์ที่ได้หลังจากทำการบวกเลขประจำหลักไปเรื่อย ๆ: " + result);

	        scanner.close();
	    }
	 public static int computeSumOfDigitsUntilSingleDigit(int n) {
	        while (n >= 10) {
	            int sum = 0;
	            while (n != 0) {
	                sum += n % 10;
	                n /= 10;
	            }
	            n = sum;
	        }
	        return n;
		}
	
}
