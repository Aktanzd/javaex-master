package jav;

public class fifth_ex2 {

    public static void main(String[] args) {
        Computer subclass = new Computer("intel Core i5",32, 1,300);
        subclass.printComputer();

        PersonComputer subclass1 = new PersonComputer(19.8, 3000);
        subclass1.printPersonComputer();
        subclass1.costComputerArg();

        Server subclass2 = new Server(4,3500);
        subclass2.printServer();
        subclass2.costServerArg();

    }
}
class Computer{
    public String cpu;
    private int ram, hdd;
    public int costMonitor;
    Computer(String c, int r, int h,int cmt){
        cpu = c;
        ram = r;
        hdd = h;
        costMonitor = cmt;
    }
    void printComputer(){
        System.out.println("Процессор: " + cpu);
        System.out.println("ОЗУ: " + ram + "гб");
        System.out.println("ОбЪём жесткого диска: " + hdd + "ТБ");
    }
}
class PersonComputer extends Computer{
    public int costMonitor;
    protected double monitor;
    void costComputerArg(){
        if (monitor > 16.8){
            costMonitor = costMonitor+400;
        }
        System.out.println("Стоимость монитора: " + costMonitor + "$");
    }
    PersonComputer(double mt, int cM){
        super("intel Core i5",32, 1,3000);
        monitor = mt;
        costMonitor = cM;
    }
    void printPersonComputer(){
        System.out.println("Монитор: " + monitor + "дюймов");
    }
}
class Server extends Computer{

    protected int costCPU, countCPU;
    void costServerArg(){
        if (countCPU > 3){
            costCPU = costCPU+200;
        }
        System.out.println("Стоимость процессора: " + costCPU + "$");
        System.out.println("------------------------------------------");
        System.out.println("Стоимость компьютера: " + (costCPU+costMonitor) + "$");
    }
    Server(int ctU,int csU){
        super("intel Core i5",32, 1,3000);
        countCPU = ctU;
        costCPU = csU;
    }
    void printServer(){
        System.out.println("Кол-во процессоров: " + countCPU);
    }
}
