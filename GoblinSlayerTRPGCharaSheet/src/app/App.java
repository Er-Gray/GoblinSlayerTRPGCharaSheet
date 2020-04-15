package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int race;
        int statusMethod;

        inputRace: while (true) {
            System.out.println("種族を選択してください。\n1:只人\n2:鉱人\n3:森人\n4:蜥蜴人\n5:圃人");
            Scanner scan = new Scanner(System.in);
            try {
                race = scan.nextInt();
                if (race < 1 || race > 5) {
                    System.out.println("入力された値が違います。\n");
                    continue inputRace;
                }
                System.out.println("\n能力値を決めます\n1:固定値を使う\n2:ランダム");
                statusMethod = scan.nextInt();
                switch (statusMethod) {
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("入力された値が違います。\n");
                        continue inputRace;
                }
                break;
            } catch (Exception e) {
                System.out.println("入力された値が違います。");
                e.printStackTrace();
                continue inputRace;
            }
        }
    }
}