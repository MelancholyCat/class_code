package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 10:37 2019-09-16
 * @description 荷兰国旗问题
 */
public class NetherlandsFlag extends xyz.lfans.tools.Swap {

    public static int[] partition(int[] arr,int l,int r,int num) {
        int less = l-1;
        int more = r+1;
        while (l<more){
            if (arr[l]<num){
                swap(arr,++less,l++);
            }else if (arr[l]>num){
                swap(arr,--more,l);
            }else
                l++;
        }
        return new int[]{less+1,more-1};
    }

}
