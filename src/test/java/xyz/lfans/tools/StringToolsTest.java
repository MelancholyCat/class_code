package xyz.lfans.tools;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 21:12 2019-09-28
 * @description MelancholyCat's Code
 */

public class StringToolsTest {

    @Test
    public void onlySmallChar() {
        String[] strings = StringTools.onlySmallChar(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(strings[i]);
        }
    }
}