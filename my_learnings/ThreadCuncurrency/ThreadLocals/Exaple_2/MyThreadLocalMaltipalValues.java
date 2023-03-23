package ThreadCuncurrency.ThreadLocals.Exaple_2;

public class MyThreadLocalMaltipalValues {
    private int intCiunter;
    private String stringCounter;


    ThreadLocal<Integer>threadLocalCounter1 = new ThreadLocal<Integer>() {
        protected Integer initialValue() {
            return 9;
        }

    };
    ThreadLocal<String> threadLocalCounter2 = new ThreadLocal<String>() {
        protected String initialValue() {
            return "rahul kumar isnha ";
        }

    };


    Runnable runnable = () -> {
        synchronized (this) {
            System.out.println(threadLocalCounter1.get() + 1);
            System.out.println(threadLocalCounter2.get());
        }

    };
    Runnable runnable2 = () -> {
        synchronized (this) {
            System.out.println(threadLocalCounter1.get() + 2);
            System.out.println(threadLocalCounter2.get().concat("sahil; babbar"));
        }

    };

    public static void main(String[] args) {

        MyThreadLocalMaltipalValues obj = new MyThreadLocalMaltipalValues();

        Thread t1 = new Thread(obj.runnable);
        Thread t2 = new Thread(obj.runnable2);

        t1.start();
        t2.start();
    }



    /*
    we create two or more thread local because it's a class anc can take only one datatype as a parameter
    so every time we need to create  a threadLocal calls instance and use generic as a  parameter
 */
}