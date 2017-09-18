package tests;

import catg.CATG;
import janala.Main;

public class Testmebranch {
    public static int x = 0, y, z;

    public static void main(String[] args) throws InterruptedException {
        Main.MakeSymbolic(x);
        Thread t1 = new Thread() {
            public void run() {
                if(x == 0){
                    x=0;
                    x= x + 5;
                    y=0;
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                x = x + 17;
                z=0;
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("x = "+x);
    }
}

