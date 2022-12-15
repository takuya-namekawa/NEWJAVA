import java.util.*;
public class Drill_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double top,bottom,height;

        top = scn.nextInt();
        System.out.println(top);

        bottom = scn.nextInt();
        System.out.println(bottom);

        height = scn.nextInt();
        System.out.println(height);


        System.out.println((top + bottom) * height / 2 );
        //台形の面積=（上底+下底）×高さ÷２
        //入力値↓
        //上底を入力してください＝10
        //
        //下底を入力してください＝15
        //
        //高さを入力してください＝7
        //
        //面積＝87.5


    }
}
