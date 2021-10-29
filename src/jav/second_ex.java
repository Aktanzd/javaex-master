package jav;

import java.util.Arrays;
import java.util.Scanner;

public class second_ex {
    public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("------------------------");
		System.out.println("�������:");
		charAt();
		System.out.println("------------------------");
		System.out.println("������ �����:");
		string_meth();
		System.out.println("------------------------");
		System.out.println("������:");
		massive();
		System.out.println("------------------------");
		System.out.println("������:");
		month_num();
		System.out.println("------------------------");
		System.out.println("��� �����:");
		two_num();
		System.out.println("------------------------");
		System.out.println("����� �������:");
		massive_num_10();
		System.out.println("------------------------");
		System.out.println("������ ������������� ������:");
		massive_num_();
		System.out.println("------------------------");
		System.out.println("������ ������ �����:");
		massive_num_2();
		System.out.println("------------------------");
		System.out.println("��������� ������:");
		massive2_num();
	}
	public static int charAt() {
		char c1 = 'd';
		char c2 = '3';
		char c3 = (char) (c1 + c2);
		System.out.println("����� �������: "+ c3);
		return 0;
	}
	public static int string_meth() {
		String s = "Aktan";
		String d = " Edikov";
		System.out.printf("������������: "+ s+d +"\n" +"������ ������:"+(s.length()) +"\n"+"��������� �����: "+
		(d.equals(s))+"\n"+"������ �� ������:"+ s.charAt(0)+"\n");
		return 0;
	}
	public static int massive() {
		int[] a = new int[3];
		int[] b = new int[4];
		int[] c = new int[5];
		System.out.println("������ �������: "+ a.length+", "+"������:"+Arrays.toString(a));
		System.out.println("������ �������: "+ b.length+", "+"������:"+Arrays.toString(b));
		System.out.println("������ �������: "+ c.length+", "+"������:"+Arrays.toString(c));
		return 0;
	}
	public static void month_num() {
		System.out.printf("������� ����� ������: ");
        String a = in.nextLine();
		switch(a) {
		case "1":
			System.out.println("You are changed - January");
		break;
		case "2":
			System.out.println("You are changed - February");
	    break;
		case "3":
			System.out.println("You are changed - Mart");
		break;
		case "4":
			System.out.println("You are changed - April");
	    break;
		case "5":
			System.out.println("You are changed - May");
	    break;
		case "6":
			System.out.println("You are changed - June");
		break;
		case "7":
			System.out.println("You are changed - July");
	    break;
		case "8":
			System.out.println("You are changed - August");
		break;
		case "9":
			System.out.println("You are changed - September");
	    break;
		case "10":
			System.out.println("You are changed - October");
		break;
		case "11":
			System.out.println("You are changed - November");
	    break;
		case "12":
			System.out.println("You are changed - December");
		break;
		
		default:
			System.out.println("Oooops, something wrong !");
		}
	}
	public static void two_num() {
		int[] a = {9,-1};
		/*if(a[0]<0){
		    a[0]*=(-1);
		}
		if(a[1]<1){
		    a[1]*=(-1);
		}*/
		while(a[0]<a[1]-1 || a[1]<a[0]-1) {
		    if(a[0]<a[1]){
		        a[0]++;
		        System.out.println(a[0]);
		    }
			if(a[0]>a[1]){
			    a[1]++;
			    System.out.println(a[1]);
			}
		}
	}
	public static void massive_num_10() {
		int[] a = {34,5,7,9,10,5,7,8,3,35};
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static int massive_num_() {
		int[] a = {5,55,76,9,10,5,-4,-1,3,15};
		for (int i=0; i<a.length; i++) {
			if(a[i]<0){
			    break;
			}
			System.out.println(a[i]);
		}
		return 0;
	}
	public static void massive_num_2() {
		int[] a = {-2,3,5,5,4,4,3,2,-6,4};
		for (int i=0; i<a.length; i++) {
			if(a[i]%2!=0){
			    continue;
			}
			System.out.println(a[i]);
		}
	}
	public static void massive2_num() {
		int[][] a = {
		    {8,-9,0},
		    {-2,3,5}
		};
		int b = a [0][0];
		for (int i=0; i<a.length; i++) {
		    System.out.println();
			for (int j = 0; j < a[i].length; j++) {
				if(b < a[i][j]) {
					b = a[i][j];
				}
				System.out.print(a[i][j]+"\t");
			}
		}
		System.out.println("\n" + "������������ �������: " + b);
	}
}