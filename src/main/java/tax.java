public class tax {
    public static void main(String[] args) {
        int price = 3500;
        System.out.println("定価" + price + "円");
        //15%引きの計算

        //int discfountPrice = price * 0.85;　これだとエラーになる正しい書き方はintにキャストして()でくくらないとエラーになる
        int discfountPrice = (int)(price * 0.85);
        System.out.println("割引価格は" + discfountPrice + "円です。");
        //消費税を8%かける
        int amount = (int)(discfountPrice * 1.08);
        System.out.println("税込み金額は" + amount + "円です。");

        //友達と割り勘する
        int person = 5;
        System.out.println("人数が" + person + "人の場合、");
        int amountPerPerson = amount / person;
        //余り金額も計算する
        int remainder = amount % person;
        System.out.println("一人当たり" + amountPerPerson + "円,余り" + remainder + "です。");


        //100グラム128円の肉が、300グラムある場合の価格を計算しますが、正しく計算されません。間違いを修正して、肉の価格を出力してください。
        int price1 = 128;
        int weight = 300;
        int amount1 = price1 * weight / 100;
        System.out.println("100グラム" + price1 + "円の肉、" + weight + "グラムは、" + amount1 + "です。");


    }
}
