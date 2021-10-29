package jav;

import java.util.Scanner;
import java.util.Arrays;

public class eighth_ex {

    public static void main(String args[]) {
        Database obj = new MySQL(new String[] {"students"});
        obj.connect();
        obj.close();

        Database obj1 = new Oracle(new String[] {"company"});
        obj1.connect();
        obj1.close();
    }
}

interface Database{
    void connect();
    void select();
    void close();
}

class MySQL implements Database {
    public String[] DatabaseStudents = {"Айнилова Бермет", "Иманалиев Баймурат"};
    public static Scanner in = new Scanner(System.in);

    String[] Database_name;

    MySQL(String[] Database_name) {
        this.Database_name = Database_name;
    }
    public void connect() {
        System.out.println("Соедините 1-ю базу данных: ");
        String print = in.nextLine();
        switch (print) {
            case "use students" -> select();
            case "close" -> {
                System.out.println("Вы еще не выбрали базу данных");
                connect();
            }
            default -> {
                System.out.println("False");
                close();
            }
        }
    }
    public void close(){
        System.out.println("");
    }
    public void select() {
        System.out.println("Выведите данные: ");
        String print = in.nextLine();
        switch (print) {
            case "select * from students" -> System.out.println(Arrays.toString(DatabaseStudents));
            case "close" -> {
                System.out.println("Вы еще не выбрали базу данных");
                connect();
            }
            default -> {
                System.out.println("False");
                close();
            }
        }
    }
}

class Oracle implements Database{
    public String[] DatabaseCompany = {"Apple","Amazon"};
    public static Scanner in = new Scanner(System.in);

    String[] Database_name;

    Oracle(String[] Database_name){
        this.Database_name = Database_name;
    }
    public void connect() {
        System.out.println("Соедините 2-ю базу данных: ");
        String print = in.nextLine();
        switch (print) {
            case "use company" -> select();
            case "close" -> {
                System.out.println("Вы еще не выбрали базу данных");
                connect();
            }
            default -> {
                System.out.println("False");
                close();
            }
        }
    }
    public void select() {
        System.out.println("Выведите данные: ");
        String print = in.nextLine();
        switch (print) {
            case "select * from company" -> System.out.println(Arrays.toString(DatabaseCompany));
            case "close" -> close();
            default -> {
                System.out.println("False");
                close();
            }
        }
    }
    public void close(){
        System.out.println("");
    }
}
