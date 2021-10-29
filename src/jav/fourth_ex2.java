package jav;

import java.util.Scanner;

public class fourth_ex2 {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Person3 subClass = new Person3("Aktan", "Syrgak", "Arlen","Developer", "Buisnessmen", "Marketer");
		Seniority_Salary subClass2 = new Seniority_Salary(100.4, 99.2, 89.7, 5, 3, 2);

		int counter = 0;
		while(counter < 3) {
			counter++;
			subClass.printInputInfo();
			String input = in.nextLine();
			switch(input) {
				case "Aktan":
					subClass2.printInfo_Aktan();
					break;
				case "Syrgak":
					subClass2.printInfo_Syrgak();
					break;
				case "Arlen":
					subClass2.printInfo_Arlen();
					break;
				default:
					System.out.println("Нету такого!");
			}
		}
	}
}

class Person3{
	String namePerson_one, namePerson_two, namePerson_three;
	String Jobs_developer, Jobs_businessmen, Jobs_marketer;
	Person3(String nP_o, String nP_t,String nP_th, String j_d, String j_b,String j_m){
		namePerson_one = nP_o;
		namePerson_two = nP_t;
		namePerson_three = nP_th;
		Jobs_developer = j_d;
		Jobs_businessmen = j_b;
		Jobs_marketer = j_m;
	}
	void printInputInfo() {
		System.out.println("Если вы хотите информацию об этих людях");
		System.out.println("введите имя: Aktan, Syrgak, Arlen");
	}
}
class Seniority_Salary extends Person3{
	int JobsDevelopers_seniority, JobsBusinessmen_seniority, JobsMarketer_seniority;
	double JobsDevelopers_salary, JobsBusinessmen_salary, JobsMarketer_salary;
	Seniority_Salary(double jd_s, double jb_s,double jm_s,
					 int jd_se, int jb_se, int jm_se){
		super("Aktan", "Syrgak", "Arlen","Developer", "Buisnessmen", "Marketer");
		JobsDevelopers_salary = jd_s;
		JobsBusinessmen_salary = jb_s;
		JobsMarketer_salary = jm_s;
		JobsDevelopers_seniority = jd_se;
		JobsBusinessmen_seniority = jb_se;
		JobsMarketer_seniority = jm_se;
	}
	void printInfo_Aktan() {
		System.out.println("Name: " + namePerson_one);
		System.out.println("Jobs: " + Jobs_developer);
		System.out.println("Salary: " + JobsDevelopers_salary + "$");
		System.out.println("Seniority: " + JobsDevelopers_seniority + "years");
		System.out.println("-----------------------------------------");
	}
	void printInfo_Arlen() {
		System.out.println("Name: " + namePerson_three);
		System.out.println("Jobs: " + Jobs_marketer);
		System.out.println("Salary: " + JobsMarketer_salary + "$");
		System.out.println("Seniority: " + JobsMarketer_seniority + "yearrs");
		System.out.println("-----------------------------------------");
	}
	void printInfo_Syrgak() {
		System.out.println("Name: " + namePerson_two);
		System.out.println("Jobs: " + Jobs_businessmen);
		System.out.println("Salary: " + JobsBusinessmen_salary + "$");
		System.out.println("Seniority: " + JobsBusinessmen_seniority + "years");
		System.out.println("-----------------------------------------");
	}

}
