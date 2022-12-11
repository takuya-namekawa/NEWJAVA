public class roop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 5) {
            System.out.println("hello world" + i);
            i += 1;
        }
        System.out.println("last" + i);


        //「ハローラーニング」と表示するプログラムです。
        //whileを使って、「ハローラーニング」と10回出力するよう修正してください。

        int h = 0;
        while (h <= 9) {
            System.out.println("ハローラーニング");
            h += 1;
        }

        //while命令を使って、0から15まで、数値を一行ずつ表示するプログラムを作成してください。
        int w = 0;
        while (w <= 15) {
            System.out.println(w);
            w += 1;
        }
    }
}
