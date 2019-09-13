package xyz.lfans.solutions;

/**
 * @author MelancholyCat
 * @date Created in 08:54 2019-09-12
 * @description 单词逆序
 */
public class WordBackward {
    public static String wordBackward(String string){

        String cut = " ";	// 分割串，此处为一个空格
        String[] strs = string.split(cut);	// 分割成数组
        String newStr="";

        for (int i = strs.length-1;i>=0;i--) {
            if(i==0){
                newStr=newStr+strs[i];
            }else
                newStr=newStr+strs[i]+" ";
        }

        return newStr;
    }
}
