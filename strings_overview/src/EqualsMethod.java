package src;

import java.util.Random;

public class EqualsMethod {
        public static void main (String[] args) {

            //be sure to import java.util.Random; at the top of your progra
            String word="";

            Random generator = new Random();
            int randNumber = generator.nextInt(3);

            System.out.println("Value " + randNumber);

            switch (randNumber) {
                case 1:
                    word = "ambidextrous";
                    break;
                case 2:
                    word = "supercilious";
                    break;
                case 3:
                    word = "antiestablishment";
                    break;
            }

            System.out.println(word);


        } // end of main

    } // end of class

