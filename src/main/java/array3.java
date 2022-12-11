public class array3 {
    public static void main(String[] args) {
       String[] team = {"勇者" ,"戦士", "魔法使い"};
        System.out.println(team.length);

        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i]);
        }

        //RPGの敵が、enemy配列で定義されています。
        //この配列から要素を順に取り出して、「＊＊が現れた」と出力してください。
        String[] enemy = {"スライム", "モンスター", "ゾンビ", "ドラゴン", "魔王"};

        for (int i = 0; i < enemy.length; i++) {
            System.out.println(enemy[i] + "現れた");
        }

        //ループの中で、取り出した要素をsumに足していく
        int[] numbers = {12, 34, 56, 78, 90};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
