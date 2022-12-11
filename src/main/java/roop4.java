public class roop4 {
    public static void main(String[] args) {
        //下記構文だとforの中でしか出力できない
        for (int i = 0; i <= 4; i++) {
            System.out.println("hello word" + i);
        }


        //kという変数をforの外で使用したい場合は変数を定義しておく必要がある
        int k;
        for (k = 0; k <= 4; k++) {
        }
        System.out.println("hello " + k);

        //for命令を使って、「ハローラーニング」と10回出力するよう修正してください。
        for (int h = 1; h <= 10; h++) {
            System.out.println("ハローラーニング" + h);
        }

        //for命令を使って、0から15まで、数値を一行ずつ表示する出力するプログラムを作成してください。
        for (int a = 0; a <= 15; a++) {
            System.out.println(a);
        }

        //for命令を使って、1月から12月まで、一行ずつ表示する出力するプログラムを作成してください。
        for (int b = 1; b <= 12; b++) {
            System.out.println(b + "月");
        }
    }
}
