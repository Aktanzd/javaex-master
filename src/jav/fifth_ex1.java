package jav;

public class fifth_ex1{
    public static void main(String[] args) {
        Person subclass = new Person(2000,"Aktan", "Edikov");
        subclass.printPerson();

        Employe subclass2 = new Employe(3,1000);//(год стажа, стоимость оклада)
        subclass2.printEmploye();
        subclass2.Salary(3,2001);//(год стажа, год рождения)
    }
}
class Person{
    public int year;
    private String name,surename;
    Person(int y, String n, String s){
        year = y;
        name = n;
        surename = s;
    }
    void printPerson(){
        System.out.println("Год рождения: " + year + "г");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surename);
    }
}
class Employe extends Person{
    protected int seniority,salary;
    void Salary(int seniority, int year){
        if (seniority > 2 && year > 2000){
            salary = salary + 400;
        }
        else if(seniority < 2 && year < 2000){
            salary = salary - 400;
        }
        else if (seniority > 2 && year < 2000){
            salary = salary + 200;
        }
        else if (seniority < 2 && year > 2000){
            salary = salary - 200;
        }
        System.out.println("Оклад в зависимости от хар-ки: " + salary + "$");
    }
    Employe(int sy, int sl){
        super(2000,"Aktan", "Edikov");
        seniority = sy;
        salary = sl;
    }
    void printEmploye(){
        System.out.println("Трудовой стаж: " + seniority + "г");
        System.out.println("Оклад: " + salary +  "$");
    }
}

