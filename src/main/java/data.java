public class data {
    public static void main(String[] args) {
        System.out.println(10 / 3);  //3
        System.out.println(10 / 3.0);  //3.3333333333333335


        double number1 = 3.14;  //小数点の数字を整数に変換している
        System.out.println(number1);
        System.out.println((int)number1);

        int number2 = 3;   //整数を小数点表示にキャストしている
        System.out.println(number2);
        System.out.println((double)number2);

        String text = "123";  //文字列を整数と小数点に変換
        System.out.println(text);
        System.out.println(Integer.parseInt(text));
        System.out.println(Double.parseDouble(text));

        String text1 = "0.08";

        System.out.println(Double.parseDouble(text1));




    }
}
