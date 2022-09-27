
public class JavaUtility {
    
    public static void main(String[] args) {
        MultipleThread t1 = new MultipleThread();
        t1.setName("MyThread-1");
        MultipleThread t2 = new MultipleThread();
        t2.setName("MyThread-2");
        t1.start();
        t2.start();
    }
}
