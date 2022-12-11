public class pulldown {
    //年齢入力のプルダウンを作成
    public static void main(String[] args) {
        System.out.println("<select name='age'>");
        System.out.println("<option>1才</option>");
        System.out.println("<option>2才</option>");
        System.out.println("</select>");

        //繰り返し処理を活用した自動生成
        System.out.println("<select name='age'>");
        for (int i = 0; i <= 10; i++){
            System.out.println("<option> + i + 歳</option>");
        }
        System.out.println("</select>");

        //HTMLによる箇条書き
        //for命令を使って、箇条書きで1から100まで出力するよう修正してください。
        System.out.println("<ul>");
        for (int a = 1; a <= 100; a++){
            System.out.println("<li>" + a + "</li>");
        }
        System.out.println("</ul>");



    }
}
