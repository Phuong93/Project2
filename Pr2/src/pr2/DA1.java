package pr2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DA1 {
	// Khai bao bien
	public static void main01(String[] args) {

		int age = 20;
		String name = "phuong";

		System.out.println("age:" + age + "+" + 10);
		System.out.println("Name:" + name);
		age = 30;
		System.out.println("age:" + age + "+" + 10);
		// hang so
		final int YOUR_BIRTHDAY = 2000;
		System.out.println(YOUR_BIRTHDAY);
	}

	// Data type
	public static void main02(String[] args) {

		int var1 = 12;
		int var2 = 200;
		boolean var3 = true;
		double var4 = 123.456;
		String name = "Phuong Tran";
		System.out.println("Var1:" + var1);
		System.out.println("Var2:" + var2);
		System.out.println("Var3:" + var3);
		System.out.println("Var4:" + var4);
		System.out.println("Name:" + name);

	}

	// chuyen doi kieu du lieu
	public static void main03(String[] args) {

		int var1 = 12;
		double var2 = 123.456;
		int var3 = var1 + (int) var2;
		double var4 = (double) var1 + var2;
		System.out.println("Var3:" + var3);
		System.out.println("Var4:" + var4);
	}

	// Toan tu so hoc + - * /( chia láº¥y nguyÃªn) %( chia láº¥y dÆ°)
	public static void main04(String[] args) {
		int number1 = 20;
		int number2 = 3;
		int result;
		// +
		result = number1 + number2;
		System.out.println("Result 1:" + number1 + "+" + number2 + "=" + result);
		// -
		result = number1 - number2;
		System.out.println("Result 2:" + number1 + "-" + number2 + "=" + result);
		// *
		result = number1 * number2;
		System.out.println("Result 3:" + number1 + "*" + number2 + "=" + result);
		// /
		result = number1 / number2;
		System.out.println("Result 4:" + number1 + "/" + number2 + "=" + result);
		// %
		result = number1 % number2;
		System.out.println("Result 5:" + number1 + "%" + number2 + "=" + result);

	}

	// Toan tu gan += -= *= /= %=
	public static void main05(String[] args) {
		int number = 20;
		number = number + 10;
		number += 10;
		System.out.println(number);
		number -= 10;
		System.out.println(number);
		number *= 10;
		System.out.println(number);
		number /= 10;
		System.out.println(number);
		number %= 10;
		System.out.println(number);
	}

	// Toan tu ++ --
	// numberStart ++ tráº£ vá»� gia tri cua numberStart, sau Ä‘Ã³ tÄƒng number
	// lÃªn 1 Ä‘Æ¡n vá»‹
	// numberStart -- tráº£ vá»� gia tri cua numberStart, sau Ä‘Ã³ giáº£m number
	// lÃªn 1 Ä‘Æ¡n vá»‹
	// ++numberStart tÄƒng numberStart lÃªn 1 Ä‘Æ¡n vá»‹, sau Ä‘Ã³ tráº£ vá»�
	// gtri cá»§a numberStart
	// --numberStart giáº£m numberStart lÃªn 1 Ä‘Æ¡n vá»‹, sau Ä‘Ã³ tráº£ vá»�
	// gtri cá»§a numberStart
	public static void main06(String[] args) {
		int numberStart = 20;
		int numberEnd = 0;
		numberEnd = numberStart++;
		System.out.println("Number start:" + numberStart);
		System.out.println("Number end:" + numberEnd);
		numberEnd = numberStart--;
		System.out.println("Number start:" + numberStart);
		System.out.println("Number end:" + numberEnd);
		numberEnd = ++numberStart;
		System.out.println("Number start:" + numberStart);
		System.out.println("Number end:" + numberEnd);
		numberEnd = --numberStart;
		System.out.println("Number start:" + numberStart);
		System.out.println("Number end:" + numberEnd);
	}

	// Toan tá»­ sÃ¡nh > < >= <= == != (khÃ¡c)
	public static void main07(String[] args) {
		int numberOne = 20;
		int numberTwo = 10;
		boolean result = true;

		result = numberOne > numberTwo;
		System.out.println(numberOne + ">" + numberTwo + " is " + result);
		result = numberOne < numberTwo;
		System.out.println(numberOne + "<" + numberTwo + " is " + result);
		result = numberOne >= numberTwo;
		System.out.println(numberOne + ">=" + numberTwo + " is " + result);
		result = numberOne <= numberTwo;
		System.out.println(numberOne + "<=" + numberTwo + " is " + result);
		result = numberOne == numberTwo;
		System.out.println(numberOne + "==" + numberTwo + " is " + result);
		result = numberOne != numberTwo;
		System.out.println(numberOne + "!=" + numberTwo + " is " + result);

	}

	// Toan tu logic && (vÃ  ) || ( hoáº·c) ! (phá»§ Ä‘á»‹nh)
	public static void main08(String[] args) {
		int numberOne = 20;
		int numberTwo = 10;
		boolean result = false;
		// && true >> táº¥t cáº£ Ä‘á»�u pháº£i true
		// && false chá»‰ cáº§n 1 cÃ¡i false
		// || true khi chá»‰ cáº§n 1 cÃ¡i true lÃ  Ä‘Æ°á»£c
		// || false khi táº¥t cáº£ Ä‘á»�u pháº£i false
		result = (numberOne > numberTwo) && (numberOne >= numberTwo) && (3 < 1);
		System.out.println(result);
		result = (numberOne < numberTwo) || (numberOne < numberTwo) || (3 != 1);
		System.out.println(result);

	}

	// Java string method
	public static void main09(String[] args) {
		// charArt láº¥y ra value cá»§a chuá»—i táº¡i 1 vÃ­ trÃ­ nháº¥t Ä‘á»‹nh
		// subString láº¥y ra chuá»—i tá»« vá»‹ trÃ­ nÃ y Ä‘áº¿n vá»‹ trÃ­ kia
		// indexof Ä‘áº¿m sá»‘ thá»© tá»± cá»§a vá»‹ trÃ­ value cáº§n index
		String abc = "This is my Java learning";
		String result = abc.toUpperCase();
		System.out.println(result);
		String result1 = abc.toLowerCase();
		System.out.println(result1);
		int result2 = abc.length();
		System.out.println(result2);
		char result3 = abc.charAt(6);
		System.out.println(result3);
		result = result.substring(5, 10);
		System.out.println(result);
		int result4 = abc.indexOf("Java");
		System.out.println(result4);

	}

	// Java tring method continus
	public static void main10(String[] args) {
		// trim() dÃ¹ng Ä‘á»ƒ remove space á»Ÿ Ä‘áº§u vÃ  cuá»‘i cá»§a chuá»—i
		String str1 = "         I'm Phuong Tran       ";
		String result = str1.trim();
		System.out.println(result);
		// concat() dung de noi gia tri cua 2 bien lai voi nhau vd str 1 =
		// phuong, str 2 = tran >> str1.concat(str2) = Phuong Tran
		String str2 = "I'm a girl";
		String result02 = str1.concat(str2);
		System.out.println(result02);
		// Replace() dung de thay the 1 chuoi bang 1 chuoi khac vd I am phuong,
		// neu dung replace ( phuong, tet phuong ); ket qua se la I am tet
		// phuong
		String result03 = str1.replace("Phuong Tran", "Tet Phuong");
		System.out.println(result03);
		// isEmpty() kiem tr xem gia tri cua bien la trong hay khong
		boolean result05 = str1.isEmpty();
		System.out.println(" KQ:" + result05);
		// equal() dung de so sanh gia tri cua 2 bien xem co bang nhau hay ko,
		// kq tra ve laf true hay false
		String str3 = "Tran Thi Phuong";
		String str4 = "Tran Thi Phuong ttt    ";
		boolean result04 = str3.trim().equals(str4.trim());
		System.out.println(result04);
		// contains() dung de kiem tra xem mot gia tri bat ki co nam trong gia
		// tri cua bien do hay khong vd str 1 = Phuong Tran,
		// str1.contains("Phuong"); kq se la true
		boolean result06 = str3.contains("Thii");
		System.out.println(result06);

	}

	// JAVA array introduction one dimension array [] two [][]... co array cua
	// kieu int va string
	public static void main11(String[] args) {
		String[] numberList = { "20", "20", "30", "40", "50" };
		System.out.println("Value1:" + numberList[0]);
		System.out.println("Value2:" + numberList[1]);
		System.out.println("Value3:" + numberList[2]);
		System.out.println("Value4:" + numberList[3]);
		System.out.println("Value5:" + numberList[4]);
		System.out.println(numberList[0].concat(numberList[1]));
		int[] numberList1 = { 20, 20, 0, 40, 50 };
		System.out.println("Value1:" + numberList1[0]);
		System.out.println("Value2:" + numberList1[1]);
		System.out.println("Value3:" + numberList1[2]);
		System.out.println("Value4:" + numberList1[3]);
		System.out.println("Value5:" + numberList1[4]);

	}

	// Java method
	public static void main12(String[] args) {
		// length()
		int[] numberList = { 20, 20, 0, 40, 50 };
		System.out.println(numberList.length);

		// sort() sort theo gia tri tang dan
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 55;
		num[2] = 30;
		num[3] = 20;
		num[4] = 3;

		Arrays.sort(num);
		int i;
		for (i = 0; i < num.length; i++){
			System.out.println(num[i]);
		}

		// equal()
		// binarysearch()
		// fill()
	}

	// WHat are methods?
	public static void main13(String[] args) {
		javaMethodLearning();
		javaMethodLearning();
		javaMethodLearning();
		javaMethodLearning();
	}

	public static void javaMethodLearning() {
		System.out.println("This is my first Java method");
	}

	// Method() Input Output
	// AccessModifier ( public, private, protected)
	// ReturnType (void, int, boolean, String etc )
	// MethodName ( meaningful name, as per naming convention, should start with
	// lowercase letter )
	// input parameter/s ( if method needs input, type of input )
	// Dùng return ""; if ReturnType ko phải là void
	public static void main14(String[] args) {
		// String userName = "Srharrak";
		int ageage = 18;
		hello(ageage);
		ageage = 20;
		// hellonewbie(userName);
		// Print return value for the calling method
		int printReturn = hello(ageage);
		System.out.println(printReturn);
	}
	// String ReturnType
	// public static String hellonewbie(String name){
	// System.out.println("welcome " + name);
	// System.out.println("Hi " + name + ", I'm Phuong Tran.");
	// return "Thanks" ;

	// int ReturnType
	public static int hello(int age) {

		System.out.println("I'm  " + age);
		System.out.println("I'm " + age + ", too");
		return 0;
	}

	// Toan hoc math ( min max, sqert- can bac 2, pow-luy thua, ceil - lam tron
	// len, floor - lam tron xuong
	// Around- tron gan nhat
	// Phat sinh so ngau nhien trong khoảng 0 den 1 ( round)
	/*
	 * 1. Tìm số lớn nhất trong 3 số tự nhiên cho trước ( neu 3 so thi tim 2 so
	 * truoc roi so sanh tiep voi so 3).
	 */
	public static void main15(String[] args) {
		int numberOne = 20;
		int numberTwo = 10;
		double numberThree = 123.656;

		int resultMax = Math.max(numberOne, numberTwo);
		System.out.println("Max: " + resultMax);

		int resultMin = Math.min(numberOne, numberTwo);
		System.out.println("Min: " + resultMin);

		double result1 = Math.ceil(numberThree);
		System.out.println("Lam tron len: " + result1);

		double result2 = Math.floor(numberThree);
		System.out.println("Lam tron xuong: " + result2);

		double result3 = Math.round(numberThree);
		System.out.println("Lam tron gan nhat: " + result3);

		double randomNumber = Math.random();
		System.out.println("Random: " + randomNumber);
	}

	// Phat sinh so ngau nhien tu 14-19
	public static void main16(String[] args) {
		int max = 19;
		int min = 14; // 14 15 16 17 18 19
		int range = (max - min + 1);
		int randomNumber = 0;
		randomNumber = (int) (Math.random() * range) + min;
		System.out.println("Random:" + randomNumber);
	}

	// Phat bieu dieu kien
	// IF
	public static void main17(String[] args) {
		int number = 15;
		int tmp = number % 2;
		System.out.println(tmp);
		if (tmp == 0) {
			System.out.println("So chan");
		}
		if (tmp == 1) {
			System.out.println("So le");
		}
	}

	// Phat bieu dieu kien
	// IF ELSE
	public static void main18(String[] args) {
		int number = 16;

		if (number % 2 == 0) {
			System.out.println("So Chan");
		} else {
			System.out.println("So le");
		}
	}

	// Phat bieu dieu kien
	// IF ELSE If ElSE
	public static void main19(String[] args) {
		int number = 10;

		if (number == 0) {
			System.out.println("So khong");
		} else if (number % 2 == 0) {
			System.out.println("So chan");
		} else {
			System.out.println("So le");
		}
	}

	// cau dieu kien SWITCH
	public static void main20(String[] args) {

		int number = 3000;
		String result = "";

		switch (number) {
		case 2:
			result = "Thu hai";

			break;
		case 3:
			result = "Thu ba";
			break;
		case 4:
			result = "Thu tu";
			break;
		default:
			result = "Chu nhat";
			break;

		}
		System.out.println(result);
	}

	// Vong lap trong JAVA for. while, do...while
	public static void main(String[] args) {
		// for
		for (int i = 1; i <= 8; i++) {
			System.out.println(i + ": " + "JAVA for Automation Test");
		}
		// While
		int j = 1;
		while (j <= 10) {
			System.out.println(j + ": " + "JAVA for Automation Test");
			j = j + 2;
		}
		// Do while
		int k = 1;
		do {
			System.out.println(k + " - Java automaion testing");
			k++;
		} while (k < 10);
	}
}
