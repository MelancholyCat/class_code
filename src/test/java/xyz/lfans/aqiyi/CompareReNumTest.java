package xyz.lfans.aqiyi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 20:44 2019-10-03
 * @description MelancholyCat's Code
 */

public class CompareReNumTest {

    @Test
    public void compareNum() {
        CompareReNum compareReNum = new CompareReNum();
        String string = compareReNum.compareNum(2222, 3, 101010, 2);

        System.out.println(string);
    }
}