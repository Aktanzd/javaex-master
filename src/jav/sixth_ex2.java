package jav;

public class sixth_ex2 {

    public static void main(String[] args) {
        Computer1 subclassComputer_c = new Computer1("intel Core i5",32, 1, 19.8,4);
        PersonComputer1 subclassPersonComputer_PC = new PersonComputer1("intel Core i5",32 , 1 , 19.8,4);
        Server1 subclassServer_s = new Server1("intel Core i5",32, 1, 19.8,4);

        Computer1 computer;

        computer = subclassComputer_c;
        computer.print();

        computer = subclassPersonComputer_PC;
        computer.print();

        computer = subclassServer_s;
        computer.print(); //один метод полиморфизм, но действие разное
    }
}
class Computer1{
    public double monitor;
    public int ram,hdd, countCPU;
    public String cpu;
    Computer1(String c, int r, int h,double m, int ctU){
        cpu = c;
        ram = r;
        hdd = h;
        countCPU = ctU;
        monitor = m;
    }
    void print(){
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram + "гб");
        System.out.println("ОбЪём жесткого диска: " + hdd + "ТБ");
    }
}
class PersonComputer1 extends Computer1{
    public double monitor;
    PersonComputer1(String c, int r, int h,double m, int ctU){
        super(c, r, h,m ,ctU);
        monitor = m;
    }
    void print(){
        System.out.println("Монитор: " + monitor + "дюймов");
    }
}
class Server1 extends Computer1{
    protected int countCPU;
    Server1(String c, int r, int h, double m, int ctU){
        super(c, r, h,m ,ctU);
        countCPU = ctU;
    }
    void print(){
        System.out.println("Кол-во процессоров: " + countCPU);
    }
}
