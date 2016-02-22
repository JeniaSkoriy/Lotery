/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ImmolateImprove
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1).divide(BigInteger.valueOf(1)));
            System.out.println("Your odds are 1 in " + lotteryOdds + ". GOOD luck! ");
        }
    }

}
