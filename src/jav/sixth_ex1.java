package jav;

public class sixth_ex1 {

	public static void main(String args[]) {
		Person2 subClass_p = new Person2(2000, "Aktan", "Edikov",2);
		Employe2 subClass_e = new Employe2(2000,"Aktan", "Edikov",2);
		Person2 person2;

		person2 = subClass_p;
		person2.print();
		person2 = subClass_e;
		person2.print();
	}
}

class Person2 {
	public int year;
	public String name, surename;

	Person2(int y, String n,String s,int st) {
		year = y;
		name = n;
		surename = s;
	}
	void print() {
		System.out.println("Имя: "+ name);
		System.out.println("Фамилия: "+ surename);
		System.out.println("Год рождения: "+ year + "года");
	}
}

class Employe2 extends Person2 {
	protected int seniority;
	Employe2(int y,String n,String s,int st) {
		super(st,n,s,y);
		seniority = st;
	}
	void print() {
		System.out.println("Трудовой стаж: " + seniority + "года");
	}
}
