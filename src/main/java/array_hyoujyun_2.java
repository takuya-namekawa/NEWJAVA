//文字列をカンマで分割する
import java.util.*;
public class array_hyoujyun_2 {
    public static void main(String[] args) {
        //RPGのプレイヤーが、カンマで区切られて代入されています。
        //この文字列を、splitメソッドを使って カンマのところで分割してください。
        String team_str = "勇者,戦士,忍者,魔法使い";

        String[]  team_array = team_str.split(",");
        for (String s : team_array) {
            System.out.println(s);
        }

        //文字列を .split(" ")で分割し、要素数をlengthメソッドで出力する
        String str = "one two ";
        int count = str.split(" ").length;
        System.out.println(count);


    }
}
