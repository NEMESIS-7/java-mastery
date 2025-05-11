package threads;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 10000; i++){
            System.out.println("hello");
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 10000; i++){
            System.out.println("sup");

        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A object1 = new A();
        B object2 = new B();
        object1.run();
        object2.run();
    }

}
