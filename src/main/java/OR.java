public class OR {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1;
        if (number1 == 1 || number2 == 1) {
            System.out.println("スキ！");
        }else {
            System.out.println("キライ");
        }

        int number3 = 1;
        System.out.println(number3);
        if (number3 <= 30 || number3 >= 60) {
            System.out.println("あたり！");
        }else {
            System.out.println("残念！");
        }

        double rand = Math.random() * 100 + 1;
        int number4 = (int)rand;
        System.out.println(number4);
        if (number4 <= 30 || number4 >= 60) {
            System.out.println("あたり！");
        }else {
            System.out.println("残念！");
        }

        //実行するたびに、30から100までの数値をランダムに生成して、不快指数として表示します。ここにif文を追加して、55以下か70以上の時に「不快です」と表示するようにしてください。
        double ran = (Math.random() * 71) + 30;
        int discomfort = (int)ran;
        System.out.println("不快指数は"+ discomfort + "です。");

        if (discomfort <= 55 || discomfort >= 70) {
            System.out.println("不快です");
        }
    }
}
