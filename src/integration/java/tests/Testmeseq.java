package tests;

import catg.CATG;

public class Testmeseq {
    public static int x = 0, y, z;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread() {
            public void run() {
                x=0;
                x= x + 5;
                y=0;
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                x = x + 17;
                z=0;
            }
        };
        t1.start();
        t1.join();
        t2.start();
        
        t2.join();

        System.out.println("x = "+x);
    }
}

