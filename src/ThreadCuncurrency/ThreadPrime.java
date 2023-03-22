package ThreadCuncurrency;

import java.util.Scanner;

public class ThreadPrime {

    static  void caluatePrime( int inputNUmber){
        int num=1, count=0, i;
        while (count < inputNUmber)
        {
            num=num+1;
            for (i = 2; i <= num; i++)
            {
                if (num % i == 0)
                {
                    break;
                }
            }
            if (i == num)
            {
                count = count+1;
            }
        }
        System.out.println("The " +inputNUmber +"th prime number is: " + num);
    }
    public static void main(String[] args) {
        while(true){
            Scanner read = new Scanner(System.in);
            System.out.print("Enter the value of n to compute the nth prime number: ");
            int  inputNumber = read.nextInt();

            Runnable task1= new Runnable() {
                @Override
                public void run() {
                    caluatePrime(inputNumber);
                    System.out.println("raul");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
            Thread object1= new Thread(task1);
            object1.start();

        }



    }
}
