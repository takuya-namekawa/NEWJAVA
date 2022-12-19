import java.util.*;
public class array_omikuji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //入力できるシステム
        String data = sc.nextLine();  //文字列を入力出来るようにしている
        String[] array = data.split(",");  //文字列の配列を用意している　カンマ区切りで用意します　みたいな意味

        for (String enemy : array) {  //拡張forで配列の中身を一つづつ取り出す　
            System.out.println(enemy + "が現れた");
        }

        //ランダムな数を作る範囲を調べる
        //配列の要素数を表示すればいい
        int num = array.length;
        System.out.println("敵は" + num + "匹");

        //ランダムな数を生成する
        double rand = Math.random() * num;  //上の要素数の範囲内でランダムな数字が生成去れる
        int attack = (int)rand;


        //選んだ敵に会心の一撃と表示
        //要素を格納している配列の名前でその要素が表示されるので、その引数にランダムな乱数の変数を与える事でその配列内の中から一つ選出して出力される
        System.out.println(array[attack] + "に会心の一撃！"
                + array[attack] + "を倒した！");
    }
}
