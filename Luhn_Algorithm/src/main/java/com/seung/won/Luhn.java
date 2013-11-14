package com.seung.won;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 2013. 11. 14.
 * Time: 오전 12:51
 * To change this template use File | Settings | File Templates.
 */
public class Luhn {
    private String cardStr;
    private int[] cardChars;

    public Luhn() {

    }
    public Luhn(String card){
        cardStr = card;
        cardChars = new int[16];
        for (int i=0; i<cardStr.length(); i++) {
            cardChars[i] = Integer.parseInt(String.valueOf(cardStr.charAt(i)));
        }
    }

    public boolean isValid() {
        if(cardStr.length() != 16) return false;

        if (getChecksum(getSum()) != cardChars[15]) {
            System.out.println("is not correct\n");
            return false;
        }

        return true;
    }

    private int getSum() {
        int sum = 0;
        for (int i=0; i<15; i++) {
            if (i%2 == 0) {  // 짝수일 때
                sum += getSumEven(i);
            }
            else {
                sum += cardChars[i];
            }
        }
        return sum;
    }

    private int getSumEven(int i) {
        int temp = cardChars[i] * 2;
        if (temp >= 10)
            temp = (temp/10) + (temp%10);
        return temp;
    }

    private int getChecksum(int sum) {
        int checksum = 10 - (sum % 10);
        return checksum;
    }
}
