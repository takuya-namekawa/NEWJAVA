import java.util.*;

public class list {
    public static void main(String[] args) {
        ArrayList<String> team = new ArrayList<String>();

        team.add("勇者");
        team.add("魔法使い");
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.get(0));
        System.out.println(team.get(1));
        System.out.println(team.size());

        team.add("戦士");
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());

        team.set(1, "忍者");
        for (String member : team) {
            System.out.println(member);
        }
        System.out.println(team.size());

        team.remove(2);
        for (String member : team) {
            System.out.println(member);
        }

        System.out.println(team.size());

        ArrayList<String> weapon = new ArrayList<String>();

        weapon.add("木の棒");
        weapon.add("鉄の剣");
        weapon.add("石斧");

        for (String item : weapon) {
            System.out.println(item);
        }
    }

}
