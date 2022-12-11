public class seireki {
    public static void main(String[] args) {
        // 西暦年と平成年の対応表を作る
        // 1989年から2016年までをループで出力
        // ループ内で、各西暦年を平成年に変換

        int seireki, heisei;
        for (seireki = 1989; seireki <= 2016; seireki++){
            System.out.print("西暦" + seireki + "年は、");
            heisei = seireki - 1988;
            System.out.println("平成" + heisei + "年です。");
        }
    }
}
