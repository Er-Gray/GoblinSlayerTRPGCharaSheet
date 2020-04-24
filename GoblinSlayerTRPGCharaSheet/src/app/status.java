package app;

import java.util.*;

public class status {
    private int race;
    private HashMap<String, Integer> firstStatus = new HashMap<String, Integer>();
    private HashMap<String, Integer> secondStatus = new HashMap<String, Integer>();
    private String[] fume;
    private String[] dwarf;
    private String[] elf;
    private String[] lizard;
    private String[] layer;
    private String[] history;
    private String[] encounter;
    private int originDice;
    private int historyDice;
    private int encounterDice;
    private String origin;
    private String historyDeci;
    private String encounterDeci;
    private ArrayList<Integer> stateValue = new ArrayList<Integer>();
    private int vitality = 0;
    private int mobility;
    private int spellUsageCount;
    private String initialClass = "";
    private String initialClassLevel = "";
    private ArrayList<String> adventurerSkill = new ArrayList<String>();
    private ArrayList<String> generalSkill = new ArrayList<String>();
    private int credit = 100;

    status(int race, HashMap<String, Integer> firstStatus, HashMap<String, Integer> secondStatus, String[] fume,
            String[] dwarf, String[] elf, String[] lizard, String[] layer, String[] history, String[] encounter) {
        this.race = race;
        this.firstStatus = firstStatus;
        this.secondStatus = secondStatus;
        this.fume = fume;
        this.dwarf = dwarf;
        this.elf = elf;
        this.lizard = lizard;
        this.layer = layer;
        this.history = history;
        this.encounter = encounter;
        for (int i = 1; i <= 4; i++) {
            adventurerSkill.add("");
            generalSkill.add("");
        }
    }

    public HashMap<String, Integer> getFirstStatus() {
        return firstStatus;
    }

    public HashMap<String, Integer> getSecondStatus() {
        return secondStatus;
    }

    public ArrayList<Integer> getStateValue() {
        return stateValue;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public void setFirstStatus(HashMap<String, Integer> firstStatus) {
        this.firstStatus = firstStatus;
    }

    public void fixedStatus() {
        switch (race) {
            case 1:
                firstStatus.replace("体力点", 3);
                firstStatus.replace("魂魄点", 2);
                firstStatus.replace("技量点", 2);
                firstStatus.replace("知力点", 3);
                secondStatus.replace("集中度", 2);
                secondStatus.replace("持久度", 4);
                secondStatus.replace("反射度", 2);
                break;
            case 2:
                firstStatus.replace("体力点", 4);
                firstStatus.replace("魂魄点", 2);
                firstStatus.replace("技量点", 4);
                firstStatus.replace("知力点", 1);
                secondStatus.replace("集中度", 3);
                secondStatus.replace("持久度", 3);
                secondStatus.replace("反射度", 1);
                break;
            case 3:
                firstStatus.replace("体力点", 1);
                firstStatus.replace("魂魄点", 3);
                firstStatus.replace("技量点", 3);
                firstStatus.replace("知力点", 3);
                secondStatus.replace("集中度", 2);
                secondStatus.replace("持久度", 1);
                secondStatus.replace("反射度", 3);
                break;
            case 4:
                firstStatus.replace("体力点", 4);
                firstStatus.replace("魂魄点", 3);
                firstStatus.replace("技量点", 2);
                firstStatus.replace("知力点", 2);
                secondStatus.replace("集中度", 3);
                secondStatus.replace("持久度", 2);
                secondStatus.replace("反射度", 2);
                break;
            case 5:
                firstStatus.replace("体力点", 1);
                firstStatus.replace("魂魄点", 4);
                firstStatus.replace("技量点", 3);
                firstStatus.replace("知力点", 2);
                secondStatus.replace("集中度", 1);
                secondStatus.replace("持久度", 2);
                secondStatus.replace("反射度", 4);
                break;
        }
    }

    public void randomStatus() {
        Random rand = new Random();
        switch (race) {
            case 1:
                firstStatus.replace("体力点", rand.nextInt(3) + 1 + 1);
                firstStatus.replace("魂魄点", rand.nextInt(3) + 1);
                firstStatus.replace("技量点", rand.nextInt(3) + 1);
                firstStatus.replace("知力点", rand.nextInt(3) + 1 + 1);
                secondStatus.replace("集中度", rand.nextInt(3) + 1);
                secondStatus.replace("持久度", rand.nextInt(3) + 1 + 2);
                secondStatus.replace("反射度", rand.nextInt(3) + 1);
                break;
            case 2:
                firstStatus.replace("体力点", rand.nextInt(3) + 1 + 2);
                firstStatus.replace("魂魄点", rand.nextInt(3) + 1);
                firstStatus.replace("技量点", rand.nextInt(3) + 1 + 2);
                firstStatus.replace("知力点", rand.nextInt(3) + 1 - 1);
                secondStatus.replace("集中度", rand.nextInt(3) + 1 + 1);
                secondStatus.replace("持久度", rand.nextInt(3) + 1 + 1);
                secondStatus.replace("反射度", rand.nextInt(3) + 1 - 1);
                break;
            case 3:
                firstStatus.replace("体力点", rand.nextInt(3) + 1 - 1);
                firstStatus.replace("魂魄点", rand.nextInt(3) + 1 + 1);
                firstStatus.replace("技量点", rand.nextInt(3) + 1 + 1);
                firstStatus.replace("知力点", rand.nextInt(3) + 1 + 1);
                secondStatus.replace("集中度", rand.nextInt(3) + 1);
                secondStatus.replace("持久度", rand.nextInt(3) + 1 - 1);
                secondStatus.replace("反射度", rand.nextInt(3) + 1 + 1);
                break;
            case 4:
                firstStatus.replace("体力点", rand.nextInt(3) + 1 + 2);
                firstStatus.replace("魂魄点", rand.nextInt(3) + 1 + 1);
                firstStatus.replace("技量点", rand.nextInt(3) + 1);
                firstStatus.replace("知力点", rand.nextInt(3) + 1);
                secondStatus.replace("集中度", rand.nextInt(3) + 1 + 1);
                secondStatus.replace("持久度", rand.nextInt(3) + 1);
                secondStatus.replace("反射度", rand.nextInt(3) + 1);
                break;
            case 5:
                firstStatus.replace("体力点", rand.nextInt(3) + 1 - 1);
                firstStatus.replace("魂魄点", rand.nextInt(3) + 1 + 2);
                firstStatus.replace("技量点", rand.nextInt(3) + 1);
                firstStatus.replace("知力点", rand.nextInt(3) + 1);
                secondStatus.replace("集中度", rand.nextInt(3) + 1 - 1);
                secondStatus.replace("持久度", rand.nextInt(3) + 1);
                secondStatus.replace("反射度", rand.nextInt(3) + 1 + 2);
                break;
        }
    }

    public void reliefStatus(int statNum) {
        switch (statNum) {
            case 1:
                switch (race) {
                    case 1:
                        firstStatus.replace("体力点", 4);
                        break;
                    case 2:
                        firstStatus.replace("体力点", 5);
                        break;
                    case 3:
                        firstStatus.replace("体力点", 2);
                        break;
                    case 4:
                        firstStatus.replace("体力点", 5);
                        break;
                    case 5:
                        firstStatus.replace("体力点", 2);
                        break;
                }
                break;
            case 2:
                switch (race) {
                    case 1:
                        firstStatus.replace("魂魄点", 3);
                        break;
                    case 2:
                        firstStatus.replace("魂魄点", 3);
                        break;
                    case 3:
                        firstStatus.replace("魂魄点", 4);
                        break;
                    case 4:
                        firstStatus.replace("魂魄点", 4);
                        break;
                    case 5:
                        firstStatus.replace("魂魄点", 5);
                        break;
                }
                break;
            case 3:
                switch (race) {
                    case 1:
                        firstStatus.replace("技量点", 3);
                        break;
                    case 2:
                        firstStatus.replace("技量点", 5);
                        break;
                    case 3:
                        firstStatus.replace("技量点", 4);
                        break;
                    case 4:
                        firstStatus.replace("技量点", 3);
                        break;
                    case 5:
                        firstStatus.replace("技量点", 3);
                        break;
                }
                break;
            case 4:
                switch (race) {
                    case 1:
                        firstStatus.replace("知力点", 4);
                        break;
                    case 2:
                        firstStatus.replace("知力点", 2);
                        break;
                    case 3:
                        firstStatus.replace("知力点", 4);
                        break;
                    case 4:
                        firstStatus.replace("知力点", 3);
                        break;
                    case 5:
                        firstStatus.replace("知力点", 3);
                        break;
                }
                break;
        }
    }

    public void naturalSkill() {
        switch (race) {
            case 1:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【武器：投擲武器】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                adventurerSkill.set(adventurerSkill.indexOf(""), "【過重行動】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【長距離移動】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 2:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【治癒適正】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【暗視】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【工作】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 3:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【武器：弩弓】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【暗視】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【精霊の愛し子】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 4:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【免疫強化】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【暗視】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【竜の末裔】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 5:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【隠密】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                adventurerSkill.set(adventurerSkill.indexOf(""), "【機先】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【調理】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
        }
    }

    public void career() {
        Random rand = new Random();
        originDice = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
        historyDice = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
        encounterDice = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
        switch (race) {
            case 1:
                switch (originDice) {
                    case 2:
                        origin = fume[originDice - 2];
                        initialClass = "好きな職業";
                        initialClassLevel = "1";
                        break;
                    case 3:
                        origin = fume[originDice - 2];
                        initialClass = "武道家";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = fume[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【怪物知識】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = fume[originDice - 2];
                        initialClass = "魔術師";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【文献調査】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【職人:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【手仕事】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【生産業:農業】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【頑健】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        vitality += 5;
                        break;
                    case 8:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【交渉:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 10;
                        break;
                    case 9:
                        origin = fume[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【第六感】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = fume[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【騎乗】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = fume[originDice - 2];
                        initialClass = "神官or竜司祭or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【祈祷or瞑想】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【統率】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 50;
                        break;
                }
                break;
            case 2:
                switch (originDice) {
                    case 2:
                        origin = dwarf[originDice - 2];
                        initialClass = "好きな職業";
                        initialClassLevel = "1";
                        break;
                    case 3:
                        origin = dwarf[originDice - 2];
                        initialClass = "武道家";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = dwarf[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【怪物知識】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【交渉:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 10;
                        break;
                    case 6:
                        origin = dwarf[originDice - 2];
                        initialClass = "戦士or武道家or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【観察】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【職人:鍛冶】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【手仕事】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 8:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【職人:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【手仕事】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 9:
                        origin = dwarf[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【第六感】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = dwarf[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【強打攻撃・斬】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = dwarf[originDice - 2];
                        initialClass = "神官or竜司祭";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【祈祷】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【統率】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 50;
                        break;
                }
                break;
            case 3:
                switch (originDice) {
                    case 2:
                        origin = elf[originDice - 2];
                        initialClass = "好きな職業";
                        initialClassLevel = "1";
                        break;
                    case 3:
                        origin = elf[originDice - 2];
                        initialClass = "武道家";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = elf[originDice - 2];
                        initialClass = "野伏or精霊使い";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【応急手当】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = elf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【職人:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【手仕事】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = elf[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【第六感】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = elf[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【怪物知識】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 8:
                        origin = elf[originDice - 2];
                        initialClass = "魔術師or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:即興詩】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 9:
                        origin = elf[originDice - 2];
                        initialClass = "野伏or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:演奏】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = elf[originDice - 2];
                        initialClass = "精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【礼儀作法】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = elf[originDice - 2];
                        initialClass = "神官";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【祈祷】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = elf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【統率】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 50;
                        break;
                }
                break;
            case 4:
                switch (originDice) {
                    case 2:
                        origin = lizard[originDice - 2];
                        initialClass = "好きな職業";
                        initialClassLevel = "1";
                        break;
                    case 3:
                        origin = lizard[originDice - 2];
                        initialClass = "武道家";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = lizard[originDice - 2];
                        initialClass = "野伏or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【職人:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = lizard[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【騎乗】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = lizard[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【工作】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = lizard[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【武器:弩弓】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 8:
                        origin = lizard[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【武器:槍】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 9:
                        origin = lizard[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【盾】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = lizard[originDice - 2];
                        initialClass = "魔術師or竜司祭";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【機先】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = lizard[originDice - 2];
                        initialClass = "神官or竜司祭";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【祈祷】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = lizard[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【統率】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 50;
                        break;
                }
                break;
            case 5:
                switch (originDice) {
                    case 2:
                        origin = layer[originDice - 2];
                        initialClass = "好きな職業";
                        initialClassLevel = "1";
                        break;
                    case 3:
                        origin = layer[originDice - 2];
                        initialClass = "武道家";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = layer[originDice - 2];
                        initialClass = "魔術師or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【芸能:即興詩】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = layer[originDice - 2];
                        initialClass = "魔術師";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【文献調査】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【職人:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【手仕事】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【生産業:農業】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【頑健】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        vitality += 5;
                        break;
                    case 8:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【交渉:】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 10;
                        break;
                    case 9:
                        origin = layer[originDice - 2];
                        initialClass = "戦士or武道家or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【観察】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = layer[originDice - 2];
                        initialClass = "野伏or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【生産業:農業】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = layer[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【騎乗】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【統率】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 50;
                        break;
                }
                break;
        }
        switch (historyDice) {
            case 2:
                generalSkill.set(generalSkill.indexOf(""), "【労働】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 3:
                generalSkill.set(generalSkill.indexOf(""), "【犯罪知識】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 4:
                generalSkill.set(generalSkill.indexOf(""), "【冷静沈着】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 5:
                generalSkill.set(generalSkill.indexOf(""), "【神学】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 6:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【忍耐】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 7:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【幸運】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 8:
                generalSkill.set(generalSkill.indexOf(""), "【生存術】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 9:
                generalSkill.set(generalSkill.indexOf(""), "【博識】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 10:
                generalSkill.set(generalSkill.indexOf(""), "【先入観なし】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 11:
                generalSkill.set(generalSkill.indexOf(""), "【鑑定】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 12:
                generalSkill.set(generalSkill.indexOf(""), "【礼儀作法】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
        }
        historyDeci = history[historyDice - 2];
        encounterDeci = encounter[encounterDice - 2];
    }

    public boolean bonusStatus(int statNum) {
        switch (statNum) {
            case 1:
                firstStatus.replace("体力点", firstStatus.get("体力点") + 1);
                return true;
            case 2:
                firstStatus.replace("魂魄点", firstStatus.get("魂魄点") + 1);
                return true;
            case 3:
                firstStatus.replace("技量点", firstStatus.get("技量点") + 1);
                return true;
            case 4:
                firstStatus.replace("知力点", firstStatus.get("知力点") + 1);
                return true;
            default:
                System.out.println("入力された値が違います。");
                return false;
        }
    }

    public void stateDice() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            stateValue.add(rand.nextInt(6) + 1 + rand.nextInt(6) + 1);
        }
    }

    public void stateFixed() {
        stateValue.add(5);
        stateValue.add(7);
        stateValue.add(9);
    }

    public void decisionVitality(int vitalityDice) {
        vitality += firstStatus.get("体力点") + firstStatus.get("魂魄点") + secondStatus.get("持久度") + vitalityDice;
    }

    public void decisionMobility(int mobilityDice) {
        switch (race) {
            case 1:
            case 5:
                mobility = mobilityDice * 3;
                break;
            case 2:
            case 4:
                mobility = mobilityDice * 2;
                break;
            case 3:
                mobility = mobilityDice * 4;
                break;
        }
    }

    public void decisionSpellUsageCount(int spellUsageDice) {
        if (spellUsageDice <= 6) {
            spellUsageCount = 0;
        } else if (spellUsageDice <= 9) {
            spellUsageCount = 1;
        } else if (spellUsageDice <= 11) {
            spellUsageCount = 2;
        } else {
            spellUsageCount = 3;
        }
    }

    public void printStatus() {
        System.out.println("第一能力値\n体力点:" + firstStatus.get("体力点") + "\n魂魄点:" + firstStatus.get("魂魄点") + "\n技量点:"
                + firstStatus.get("技量点") + "\n知力点:" + firstStatus.get("知力点") + "\n第二能力値\n集中度:" + secondStatus.get("集中度")
                + "\n持久度:" + secondStatus.get("持久度") + "\n反射度:" + secondStatus.get("反射度"));
    }

    public void printState() {
        System.out.println("生命力:" + vitality + "\n移動力:" + mobility + "\n呪文使用回数:" + spellUsageCount);
    }

    public void printCareer() {
        System.out.println("\n出自:" + origin + "\n来歴:" + historyDeci + "\n邂逅:" + encounterDeci);
    }
}