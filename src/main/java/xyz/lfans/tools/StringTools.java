package xyz.lfans.tools;

/**
 * @author MelancholyCat
 * @date Created in 21:03 2019-09-28
 * @description 与字符串有关的工具
 */

public class StringTools {
    /**
     * 自动生成只包含小写字母的字符串数组
     * @param lens 需要的字符串数组的长度
     * @return String[lens]
     */
    public static String[] onlySmallChar(int lens){
        String[] strings = new String[lens];
        for (int i = 0; i < lens; i++) {
            int j = (int) (Math.random()*20);
            String str = new String();
            while (j-->0){
                str+=(char)(Math.random()*26+97);
            }
            strings[i]=str;
        }
        return strings;
    }
}
