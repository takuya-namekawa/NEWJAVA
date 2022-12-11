public class tr {
    public static void main(String[] args) {
        int number = 0;
        boolean flag = number == 1;
        if  (flag = number == 1) {
            System.out.println("スキ！");
        }else {
            System.out.println("キライ！");
        }

        double rand = (Math.random() * 10) + 1;
        int number1 = (int)rand;
        System.out.println("あなたの順位は" + number1 + "位です");

        boolean flg1 = number1 <= 3;
        if (flg1 == true) {
            System.out.println("入賞おめでとう");
        }
    }

}
