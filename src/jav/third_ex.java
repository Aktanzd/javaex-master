package jav;

import java.util.Scanner;

public class third_ex {

	public static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {
		int counter = 0;
		while(counter < 2) {
			counter++;
			System.out.println("Введите: Audi, BMW, Porshe");
			String input = in.nextLine();
			switch(input) {
				case "Audi":
					CarAudi();
					break;
				case "BMW":
					CarBMW();
					break;
				case "Porshe":
					CarPorshe();
					break;

				default:
					System.out.println("Нету такого!");
			}
		}
	}
	private static void CarAudi() {
		System.out.println("-------------------------------");
		Car AudiAll = new Car("Audi",2000,"A6 Allroad",4000);
		AudiAll.printAllInfo();
		AudiAll.getPrice(2000, 40000);

		Car AudiParam = new Car ("Красный",40000);
		System.out.println("Цвет = " + AudiParam.color +"\n"+"Пробег = " +AudiParam.probeg+"км");

		System.out.println("-------------------------------");

		Car AudiShort = new Car("Audi","A6 Allroad",4000);
		AudiShort.printShortInfo();
		System.out.println("-------------------------------");
	}
	private static void CarBMW() {
		System.out.println("-------------------------------");
		Car BMWAll = new Car("BMW",2000,"X5",7000);
		BMWAll.printAllInfo();
		BMWAll.getPrice(2000, 50000);

		Car BMWParam = new Car ("Чёрный",50000);
		System.out.println("Цвет = " + BMWParam.color +"\n"+"Пробег = " +BMWParam.probeg+"км");

		System.out.println("-------------------------------");

		Car BMWShort = new Car("BMW","X5",7000);
		BMWShort.printShortInfo();
		System.out.println("-------------------------------");
	}
	private static void CarPorshe() {
		System.out.println("-------------------------------");
		Car PorsheAll = new Car("Porshe",2012,"Panamera",9000);
		PorsheAll.printAllInfo();
		PorsheAll.getPrice(2012, 20000);

		Car PorsheParam = new Car ("Красный",20000);
		System.out.println("Цвет = " + PorsheParam.color +"\n"+"Пробег = " +PorsheParam.probeg+"км");

		System.out.println("-------------------------------");

		Car PorsheShort = new Car("Porshe","Panamera",9000);
		PorsheShort.printShortInfo();
		System.out.println("-------------------------------");
	}
}
class Car{
	String model, name, color;
	int probeg, cost, year;

	Car(String n, int y,String m,int c){
		name = n;
		year = y;
		model = m;
		cost = c;
	}
	Car(String c, int p){
		color = c;
		probeg = p;
	}
	void getPrice(int year, int probeg) {
		if(year > 2010 && probeg > 30000) {
			cost = cost+500;
		}
		else if(year < 2010 && probeg < 30000){
			cost = cost-500;
		}
		else if(year > 2010 && probeg < 30000){
			cost = cost-200;
		}
		else if(year < 2010 && probeg > 30000){
			cost = cost-300;
		}
		System.out.println("Стоимость учитывая параметры = " + cost  + "$");
	}
	void printAllInfo() {
		System.out.println("Компания = " + name);
		System.out.println("Год выпуска = " + year + "г");
		System.out.println("Модель = " + model);
	}
	Car (String n, String m, int c){
		name = n;
		model = m;
		cost = c;
	}
	void printShortInfo() {
		System.out.println("Краткая Информация:");
		System.out.println("Компания = " + name);
		System.out.println("Модель = "+ model);
		System.out.println("Начальная стоимость = " + cost + "$");
	}
}
