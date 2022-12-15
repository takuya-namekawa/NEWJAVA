import java.util.*;
public class Drill_2_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    //お菓子の数と子供の人数をキー入力し、均等に分けた時の余りの数を表示する。 　
    //条件
    //お菓子の数を入力してください＝100
    //
    //子供の人数を入力してください＝7
    //
    //余り＝2
        int  number,child;
        number = scn.nextInt();
        System.out.println(number);

        child = scn.nextInt();
        System.out.println(child);

        System.out.println(number % child);

    }
}
