import org.w3c.dom.ls.LSOutput;

public class array {
    public static void main(String[] args) {
        String player1 = "勇者";

        String[] team = {"戦士", "忍者",player1};
        System.out.println(team[0]);
        System.out.println(team[1]);
        System.out.println(team[2]);



        //player_1, player_2, player_3という変数に、文字列が代入されています。
        //このplayer_1 ~ 3を、この順番で配列に代入して、printlnメソッドで出力してください。
        String player_1 = "勇者";
        String player_2 = "魔法使い";
        String player_3 = "戦士";

        String[] tea = {player_1,player_2,player_3};
        System.out.println(tea[0]);
        System.out.println(tea[1]);
        System.out.println(tea[2]);
    }


}
