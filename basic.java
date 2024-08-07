public  class basic {
    public static void main(String s[]){
        A a = new A();
        A b = new A();
        a.fun1();
        b.fun2();
        a.fun1();
        b.fun3();
        a.fun2();
        b.fun1();           
    } 
}  
class A{
    int x;
    static int y;
    void fun1(){
        System.out.println("hell 1");
        x = 2;
        System.out.println(x);
        System.out.println(y);
    }
    void fun2(){
        System.out.println("hell 2");
        y =4;
        System.out.println(x);
        System.out.println(y);
    }
    void fun3(){
        System.out.println("hell 3");
        x = 6;
        y = 8;
        System.out.println(x);
        System.out.println(y);
    }
}
