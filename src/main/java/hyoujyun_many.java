import java.util.*;
public class hyoujyun_many {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();

        //複数行データを配列に格納する hasNextラインメソッドを使用する
        while (sc.hasNext()) {
            String data = sc.nextLine();
            System.out.println(data);

        }

        for (String str : array) {
            System.out.println(str);
        }

    }
}
