package us.jsadi.bignums;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * This is the driver class for this package.
 * It creates BigIntegers for the populations of Wisconsin, California, and Texas, and a double for the cost per copy.
 * It then creates new variables to calculate the number of letters for California and Texas,
 * and the cost for the letters sent to Texas.
 * Created by jsadi on 9/19/2018
 * @author Jordan Sadi
 * @version 2018 0919 .3
 */
public class Main {
    public static void main(String[] args) {
        BigInteger wisPop = new BigInteger("5726398");
        BigInteger calPop = new BigInteger("38041430");
        BigInteger texPop = new BigInteger("26059203");
        double copyCost = 3.23;

        BigInteger calLetters = wisPop.multiply(calPop);
        BigInteger texLetters  = calLetters.multiply(texPop);
        BigDecimal texCost = new BigDecimal(copyCost * texLetters.doubleValue());

        System.out.println("If every resident of WI wrote a letter for every resident of CA, there would be "
        + calLetters + " letters");
        System.out.println("If a copy was made of every letter sent to CA for every resident of TX, there would be "
        + texLetters + " letters and it would cost " + texCost + "dollars");
    }
}
