package jav;

class meth_countObj{
    static int var1;
    static int var = 150;
    static int var_count = 0;
    meth_countObj(){
        var_count++;
    }
    static void printStatic() {
        System.out.println("Статическая переменная = " + var);
    }
    static int printStaticVar() {
        return var;
    }
    static int printStaticVar1() {
        return var1;
        //System.out.println("Var1 = " + var1);
    }
}
class seventh_ex {
    public static void main(String args[]) {
        meth_countObj obj = new meth_countObj();
        //meth_countObj.printStaticVar();
        meth_countObj obj1 = new meth_countObj();
        //meth_countObj.printStaticVar1();
        meth_countObj obj2 = new meth_countObj();
        System.out.println("Создано объектов = " + meth_countObj.var_count);
        meth_countObj.printStatic();
    }
}


