package jav;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class tenth_ex {
    public static void main(String args[]){
        //Сортировка по возрастанию
        int[] arr = {1, -5, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Сортировка по убыванию
        Integer[] arr1 = {1, -5, 3};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
        //Вывод месяца
        LocalDate date = LocalDate.parse("2021-10-22");
        System.out.println("Дата: " + date);
        System.out.println("Месяц: " + date.getMonth());
        //пример использования ArrayList
        ArrayListEx();
    }
    public static void ArrayListEx(){
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Жираф");
        animals.add(1, "Лев");
        System.out.println(animals);
        System.out.println(animals.get(1));
        animals.set(1, "Тигр");

        System.out.println(animals);

        // удаление конкретного элемента
        animals.remove("Тигр");
        System.out.println(animals);

        animals.add(1, "Зебра");
        System.out.println(animals);
        // удаление по индексу
        animals.remove(1);
        System.out.println(animals);
    }
}
