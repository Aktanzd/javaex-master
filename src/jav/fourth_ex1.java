package jav;

public class fourth_ex1 {

	public static void main(String[] args) {
		Person1 subClass = new Person1(20,"Aktan", " Edikov");
		subClass.printPerson();
		Student subClass1 = new Student(4 ,"УНПК МУК", "ИВТ");
		subClass1.printStudent();
		Employe1 subClass2 = new Employe1("IT Apple", " Senior android/ios developer");
		subClass2.printEmploye();
	}
}

class Person1{
	int age;
	String name;
	String surename;
	Person1(int a, String n, String s) {
		age = a;
		name = n;
		surename = s;
	}
	void printPerson() {
		System.out.println("Имя: " + name);
		System.out.println("Фамилия: " + surename);
		System.out.println("Возраст: " + age);
	}
}

class Employe1 extends Person1{
	String jobPlace;
	String jobPosition;
	Employe1(String jPl, String jPos) {
		super(20,"Aktan", " Edikov");
		jobPlace = jPl;
		jobPosition = jPos;
	}

	void printEmploye() {
		System.out.println("Место работы: " + jobPlace);
		System.out.println("Должность: " + jobPosition);
	}
}
class Student extends Person1{
	int num;
	String universe;
	String faculty;

	Student(int n, String un, String fac) {
		super(20,"Aktan", " Edikov");
		num = n;
		universe = un;
		faculty = fac;
	}
	void printStudent() {
		System.out.println("ВУЗ: " + universe);
		System.out.println("Факультет: " + faculty);
		System.out.println("Курс: " + num);
	}
}
