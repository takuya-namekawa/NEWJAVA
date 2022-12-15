import java.util.Scanner;
public class hyoujyun2 {
    public static void main(String[] args) {
        //標準入力から整数データを1行取得して、100倍にした結果を出力するプログラムを作成してください。
        //数字の場合書き方が一部異なる
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println(data * 100);
    }
}
