package com.gamasoft.eopi.cap7_Strings;

/**
 * Created by uberto on 06/11/16.
 */
public class ReplaceAndRemove {

    //a -> dd
    //b -> _

    public static void transform(char[] array, int count) {

        int exp = count;
        for (int i = 0; i < count; i++) {
            exp += array[i] == 'a' ? 1 : array[i] == 'b' ? -1 : 0;
        }

        int wp = exp - 1;
        for (int i = count - 1; i >= 0; i--){
            char c = array[i];

            System.out.println("c " + c);
            if (c == 'a'){
                array[wp--] = 'd';
                array[wp--] = 'd';
            } else if (c != 'b' && wp >= i){
                array[wp--] = c;
            }
        }

    }
}
