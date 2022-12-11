public class roop3 {
    public static void main(String[] args) {
        //カウントダウン
        int i = 5;
        while (i > 1) {
            System.out.println("hello world" + i);
            i -= 1;
        }
        System.out.println("last" + i);

        //スライムを攻撃
        //RPG風の処理
        int hp = 30;
        int hit;
        while (hp > 0) {
            hit = (int)(Math.random() * 10 + 1);
            System.out.println("スライムに" + hit + "のダメージを与えた！");
            hp -= hit;
        }
        System.out.println("スライムを倒した！");

        //whileを使って、10から1まで、数値を一行ずつカウントダウン表示するプログラムを作成してください。
        int r = 10;
        while (r >= 1) {
            System.out.println(r);
            r -= 1;
        }

        //whileを使って、20から10までの奇数を一行ずつカウントダウン表示するプログラムを作成してください。
        int k = 19;
        while (k >= 10) {
            System.out.println(k);
            k -= 2;
        }
    }
}
