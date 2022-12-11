public class array4 {
    public static void main(String[] args) {
        //拡張for文
        String[] team ={"勇者", "戦士", "魔法使い", "忍者"};
        for (String member : team) {
            System.out.println(member + "は、スライムと戦った！");
        }

        //RPGの敵が、enemy配列で定義されています。
        //拡張forで、この配列から要素を順に取り出して、「＊＊が現れた」と出力してください。

        String[] enemy = {"スライム", "モンスター", "ゾンビ"};
        for (String member : enemy) {
            System.out.println(member + "が現れた");
        }


        //numbers配列に数値が格納されています。
        //拡張forで、この全要素の合計値を計算して出力してください。

        int numbers[] = {12, 34, 56, 78, 90};
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
