import java.util.*;
public class array_hyoujyun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(data);

        String[] array = data.split(" ");
        System.out.println(array.length);
        System.out.println(array[0]);


        for (String enemy : array) {
            System.out.println(enemy + "が現れた");
        }

    }
}
