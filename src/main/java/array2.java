public class array2 {
    public static void main(String[] args) {
        int num = 0;

        String[] team;
        team = new String[2];
        team[0] = "戦士";
        team[1] = "忍者";


        System.out.println(team[num]);
        System.out.println(team[0]);
        System.out.println(team[num + 1]);

        team[1] = "盗賊";
        System.out.println(team[1]);

    }
}
