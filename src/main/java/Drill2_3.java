import java.util.*;
public class Drill2_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        //先月の残金と今月の入金を入力し、入金を加えて更新した残金を表示する。 　プログラムの枠組みをリスト102に示します。
        //条件
        //先月の残金を入力してください＝15000
        //
        //今月の入金を入力してください＝3000
        //
        //更新後の入金＝18000
        int last_manth,this_manth;

        last_manth = scn.nextInt();
        System.out.println(last_manth);

        this_manth = scn.nextInt();
        System.out.println(this_manth);

        System.out.println(last_manth + this_manth);
    }
}
