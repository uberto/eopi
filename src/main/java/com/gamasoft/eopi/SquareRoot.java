package com.gamasoft.eopi;

/**
 * Created by uberto on 30/10/16.
 */
public class SquareRoot {

    public static double squareRoot(double number, double error){

        double min = 1;
        double max = number;

        while(true) {

            double c = (min + max) / 2;
       //     System.out.println(c);

            if (Math.abs(c * c - number) <= error) {
                return c;
            } else if (((number > 1) && (c * c > number)) || ((number < 1) && (c * c < number))) {
                max = c;
            } else {
                min = c;
            }

        }
    }


}
