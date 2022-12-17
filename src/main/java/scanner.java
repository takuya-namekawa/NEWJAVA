import java.util.*;
public class scanner {
    //入力した数字の分を繰り返し処理する
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("スライムが現れた");
        }
    }
}
