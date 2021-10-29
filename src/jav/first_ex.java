package jav;

import java.util.Scanner;

public class first_ex {

public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) { 
		hello();
		System.out.println("Hello, My name is Homer");
		String h1 = "Hello, Homer";
		String h2 = "Hello, Bart";
		String h3 = "Hello, Lisa";
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
	}
	static void hello(){
        System.out.printf("Введите имя: ");
        String re = in.nextLine();
        System.out.printf("имя: ");
        System.out.println(re);
	}
}