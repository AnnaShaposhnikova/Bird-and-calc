package org.anna.even;

public class Starter {
    public static void main (String [] args){
        int result = Even.isEvenNum(103);
        int r = 103;

        if (result == 0){
            System.out.println("The number is even" + r);
        }
        else {
            System.out.println( "The number is odd " + r);
        }

    }

}
