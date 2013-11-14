package com.seung.won;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 2013. 11. 14.
 * Time: 오전 12:51
 * To change this template use File | Settings | File Templates.
 */
public class LuhnTest {
    @Test
    public void isValid() {
        Luhn luhn = new Luhn("5428796354512002");

        Assert.assertEquals(true, luhn.isValid());
    }
}
