package app;

import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        int race = 0;
        int statusMethod;
        HashMap<String, Integer> firstStatus = new HashMap<String, Integer>();
        HashMap<String, Integer> secondStatus = new HashMap<String, Integer>();
        ArrayList<Integer> stateValue = new ArrayList<Integer>();
        String[] fume = readCSV("只人出自.csv");
        String[] dwarf = readCSV("鉱人出自.csv");
        String[] elf = readCSV("森人出自.csv");
        String[] lizard = readCSV("蜥蜴人出自.csv");
        String[] layer = readCSV("圃人出自.csv");
        String[] history = readCSV("来歴.csv");
        String[] encounter = readCSV("邂逅.csv");

        firstStatus.put("体力点", 0);
        firstStatus.put("魂魄点", 0);
        firstStatus.put("技量点", 0);
        firstStatus.put("知力点", 0);
        secondStatus.put("集中度", 0);
        secondStatus.put("持久度", 0);
        secondStatus.put("反射度", 0);

        status stat = new status(race, firstStatus, secondStatus, fume, dwarf, elf, lizard, layer, history, encounter);

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
                stat.naturalSkill();
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
        stat.career();
        stat.printCareer();
        statusBonus: while (true) {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("\n好きな第一能力値に+1できます。");
                System.out.println("1:体力点\n2:魂魄点\n3:技量点\n4:知力点");
                if (stat.bonusStatus(scan.nextInt())) {
                    break statusBonus;
                } else {
                    continue statusBonus;
                }
            } catch (Exception e) {
                System.out.println("入力された値が違います。");
                e.printStackTrace();
                continue statusBonus;
            }
        }
        stat.printStatus();
        stat.stateDice();
        stateValue = stat.getStateValue();
        System.out.println("状態値の出目:" + stateValue);
        while (true) {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("\n固定値を使いますか？\n2を入力してEnterで使う。使わない場合はその他の数字を入力してEnter。");
                int statNum = scan.nextInt();
                if (statNum == 2) {
                    stateValue.clear();
                    stat.stateFixed();
                    stateValue = stat.getStateValue();
                }
                while (!(stateValue == null || stateValue.size() == 0)) {
                    System.out.println("状態値の出目:" + stateValue);
                    System.out.println("\n生命力に使う出目を入力してください。");
                    int scaned = scan.nextInt();
                    int vitalityDice = stateValue.get(stateValue.indexOf(scaned));
                    stat.decisionVitality(vitalityDice);
                    stateValue.remove(stateValue.indexOf(scaned));
                    System.out.println("移動力に使う出目を入力してください。");
                    scaned = scan.nextInt();
                    int mobilityDice = stateValue.get(stateValue.indexOf(scaned));
                    stat.decisionMobility(mobilityDice);
                    stateValue.remove(stateValue.indexOf(scaned));
                    System.out.println("呪文使用回数に使う出目を選択してください。");
                    scaned = scan.nextInt();
                    int spellUsageDice = stateValue.get(stateValue.indexOf(scaned));
                    stat.decisionSpellUsageCount(spellUsageDice);
                    stateValue.remove(stateValue.indexOf(scaned));
                }
                break;
            } catch (Exception e) {
                System.out.println("入力された値が違います。");
                e.printStackTrace();
                continue;
            }
        }
        stat.printState();
    }

    public static String[] readCSV(String fileName) {
        FileInputStream fi = null;
        InputStreamReader is = null;
        BufferedReader br = null;
        try {
            fi = new FileInputStream(fileName);
            is = new InputStreamReader(fi, "Shift-JIS");
            br = new BufferedReader(is);

            String line = br.readLine();// 読み込み行

            String[] list = line.split(",");
            br.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return null;
    }
}