import java.util.*;

public class omikuji {
    //おみくじの出目(例：大吉,中吉,吉,凶)が用意
    //おみくじプログラム
    //おみくじは、標準入力から読み込んだ文字列をカンマで分割して、そのうち1つをランダムに出力
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] omikuji = line.split(",");

        //乱数の中から一つ選ぶ  配列の要素数の中からランダム
        double rand = Math.random() * omikuji.length;
        int num = (int)rand;

        System.out.println(omikuji[num]);

        //じゃんけんの手(例：グー,チョキ,パー)が用意
        //じゃんけんプログラムを作ってください。
        //じゃんけんの手は、標準入力から読み込んだ文字列をカンマで分割して、そのうち1つをランダムに出力します。

        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();

        String[] janken = line.split(",");

        double randam = Math.random() * janken.length;
        int num1 = (int)randam;
        System.out.println(janken[num1]);
    }
}
