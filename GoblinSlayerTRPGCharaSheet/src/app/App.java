package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int race = 0;
        int statusMethod;
        HashMap<String, Integer> firstStatus = new HashMap<String, Integer>();
        HashMap<String, Integer> secondStatus = new HashMap<String, Integer>();

        firstStatus.put("体力点", 0);
        firstStatus.put("魂魄点", 0);
        firstStatus.put("技量点", 0);
        firstStatus.put("知力点", 0);
        secondStatus.put("集中度", 0);
        secondStatus.put("持久度", 0);
        secondStatus.put("反射度", 0);

        status stat = new status(race, firstStatus, secondStatus);

        inputRace: while (true) {
            System.out.println("種族を選択してください。\n1:只人\n2:鉱人\n3:森人\n4:蜥蜴人\n5:圃人");
            Scanner scan = new Scanner(System.in);
            try {
                race = scan.nextInt();
                if (race < 1 || race > 5) {
                    System.out.println("入力された値が違います。\n");
                    continue inputRace;
                }
                stat.setRace(race);
                break;
            } catch (Exception e) {
                System.out.println("入力された値が違います。");
                e.printStackTrace();
                continue inputRace;
            }
        }
        decisionStatus: while (true) {
            System.out.println("\n能力値を決めます\n1:固定値を使う\n2:ランダム");
            Scanner scan = new Scanner(System.in);
            try {
                statusMethod = scan.nextInt();
                switch (statusMethod) {
                    case 1:
                        stat.fixedStatus();
                        stat.printStatus();
                        break decisionStatus;
                    case 2:
                        int statusSum = 0;
                        stat.randomStatus();
                        stat.printStatus();
                        for (int value : firstStatus.values()) {
                            statusSum += value;
                        }
                        for (int value : secondStatus.values()) {
                            statusSum += value;
                        }
                        System.out.println("能力値合計:" + statusSum);
                        if (statusSum <= 15) {
                            System.out.println("能力値合計が15以下なので好きな第一能力値の出目を3に出来ます。");
                            System.out.println("1:体力点\n2:魂魄点\n3:技量点\n4:知力点\nその他の数字:救済を使用しない");
                            stat.reliefStatus(scan.nextInt());
                            stat.printStatus();
                        }
                        System.out.println("\nこの能力を使いますか？\n1または2以外の数字:使う\n2:固定値にする");
                        if (scan.nextInt() == 2) {
                            stat.fixedStatus();
                            stat.printStatus();
                        }
                        break decisionStatus;
                    default:
                        System.out.println("入力された値が違います。\n");
                        continue decisionStatus;
                }
            } catch (Exception e) {
                System.out.println("入力された値が違います。");
                e.printStackTrace();
                continue decisionStatus;
            }
        }
    }
}