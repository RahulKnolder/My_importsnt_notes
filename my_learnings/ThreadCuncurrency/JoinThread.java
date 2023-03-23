package ThreadCuncurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JoinThread {



    static void caluatePrime(int inputNUmber) {
        int num = 1, count = 0, i;
        while (count < inputNUmber) {
            num = num + 1;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                count = count + 1;
            }
        }
        System.out.println("The " + inputNUmber + "th prime number is: " + num);
    }

    public static void waitForThread(List<Thread> threads) throws InterruptedException {
        for (Thread thread:threads) {
            if(thread.getState().equals(Thread.State.TERMINATED)){
                thread.join();
            }
        }
    }

    static void printThread(List<Thread> threads) {
        System.out.println("\n Thread status is eqal to ");
        threads.forEach(thread -> {
            System.out.println(thread.getState() + " ");
        });
    }

    public static void main(String[] args) throws InterruptedException {

        List<Thread> thread = new ArrayList<>();

        Runnable status = () -> {
            try {
                while (true) {
                    Thread.sleep(10000);
                    printThread(thread);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        };


        Thread report = new Thread(status);
        report.start();


        while (true) {
            Scanner read = new Scanner(System.in);
            System.out.print("Enter the value of n to compute the nth prime number: ");
            int inputNumber = read.nextInt();
            System.out.println("rahul");
                    if(inputNumber==0){
                        report.interrupt();
                    }

            Runnable task1 = new Runnable() {
                @Override
                public void run() {
                    caluatePrime(inputNumber);
                    System.out.println("wating for all the threads to finish");
                    try {
                        waitForThread(thread);
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            };
            Thread T = new Thread(task1);
            thread.add(T);
            T.start();

        }


    }
}