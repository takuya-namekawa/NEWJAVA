import java.util.*;
public class scanner2 {
    //標準入力で2つ（２行）の整数が与えられます。
    //1つ目の数値から２つ目の数値までを、1ずつ増加させながら、1行ずつ順番に出力するプログラムを作成してください。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
        int num2 = sc.nextInt();
        System.out.println(num2);

        for (int i = 0; i <= num2; i++ ) {
            System.out.println(i);
        }
    }
}
