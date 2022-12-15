import java.util.Scanner;
public class hyoujyun_roop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.println("データ個数" + count);

        //データ個数分を入力する事が出来る　あるいは、データを入力していたら、その分が繰り返して表示去れる
        String data;
        for (int i = 0; i < count; i++) {
            data = sc.next();
            System.out.println("hello" + data);
        }
    }
}
