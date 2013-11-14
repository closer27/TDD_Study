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
    private int checksum;

    public Luhn() {
        checksum = 0;
    }
    public Luhn(String card){
        cardStr = card;
        checksum = 0;
        cardChars = new int[16];
    }


    public int getLength() {
        return cardStr.length();
    }

    public void intoArray() {
        for (int i=0; i<cardStr.length(); i++)
            cardChars[i] = Integer.parseInt(String.valueOf(cardStr.charAt(i)));
    }

    public boolean isValid() {
        if(getLength() != 16) return false;

        for (int i=14; i>0; i--) {
            if ((i+1)%2 == 0) {  // 짝수일 때
                int temp = cardChars[i] * 2;
                if (temp >= 10)
                    checksum += (temp/10) + (temp%10);
                else
                    checksum += temp;
            }
            else {
                checksum += cardChars[i];
            }
        }
        System.out.printf("checksum is : %d\n", checksum);

        int ceilingSum = (checksum/10 + 1) * 10;

        System.out.printf("Celing Sum is : %d\n", ceilingSum);

        if ((ceilingSum-checksum)%10 != cardChars[15]) {
            System.out.println("is not correct\n");
            return false;
        }

        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
