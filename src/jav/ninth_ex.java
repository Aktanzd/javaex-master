package jav;

import java.util.Arrays;

public class ninth_ex {
    public static void main(String args[]) {
        array();

        int num1 = -90;
        int num2 = 80;
        try {
            int sumNum = sum(num1, num2);
            System.out.println("sumNum: " + sumNum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        string();
    }
    private static void array(){
        int[] arr = {1,2,3,4,6};
        try {
            System.out.println(arr[6]);
        } catch (Exception e) {
            System.out.println("Индекс больше размера массива!");
        }
        try {
            System.out.println(arr[-9]);
        } catch (Exception e) {
            System.out.println("Индекс меньше нуля!");
        }
    }
    private static int sum (int num1, int num2) throws Exception{
        if(num1<0 || num2<0) {
            throw new Exception("Один из чисел отрицательный!");
        }
        return num1+num2;
    }
    private static void string(){
        String numStr = "a69";
        try {
            int numb = Integer.parseInt(numStr);
        }
        catch (Exception e) {
            System.out.println("Невозможно перевести в число! " + numStr);
        }
    }
}
