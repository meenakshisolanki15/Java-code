interface I {
    int a=3;
    void fun();

}
interface I1 {
    int a=3;
    void fun();
    static void fun2(){
        System.out.println(1);
    }
    static void fun3(){
        System.out.println(1);
        System.out.println(34);
    }
    
}
class demo1 implements I, I1 {
    public void fun(){
        System.out.println(" i have been overridden");
    }  
}

public class demo {
    public static void main(String ar[]){
       demo1 d = new demo1();
       d.fun();
       I1.fun2();
       I1.fun3();
    }
}

