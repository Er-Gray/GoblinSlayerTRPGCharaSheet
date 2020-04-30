package app;

import java.util.*;
import java.awt.*;
import java.awt.datatransfer.*;

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
    private String raceStr;

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

    public void decisionRaceStr() {
        switch (race) {
            case 1:
                raceStr = "只人";
                break;
            case 2:
                raceStr = "鉱人";
                break;
            case 3:
                raceStr = "森人";
                break;
            case 4:
                raceStr = "蜥蜴人";
                break;
            case 5:
                raceStr = "圃人";
                break;
        }
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
            case 5:
                switch (race) {
                    case 1:
                        secondStatus.replace("集中度", 3);
                        break;
                    case 2:
                        secondStatus.replace("集中度", 4);
                        break;
                    case 3:
                        secondStatus.replace("集中度", 3);
                        break;
                    case 4:
                        secondStatus.replace("集中度", 4);
                        break;
                    case 5:
                        secondStatus.replace("集中度", 2);
                        break;
                }
                break;
            case 6:
                switch (race) {
                    case 1:
                        secondStatus.replace("持久度", 5);
                        break;
                    case 2:
                        secondStatus.replace("持久度", 4);
                        break;
                    case 3:
                        secondStatus.replace("持久度", 2);
                        break;
                    case 4:
                    case 5:
                        secondStatus.replace("持久度", 3);
                        break;
                }
            case 7:
                switch (race) {
                    case 1:
                    case 4:
                        secondStatus.replace("反射度", 3);
                        break;
                    case 2:
                        secondStatus.replace("反射度", 2);
                        break;
                    case 3:
                        secondStatus.replace("反射度", 4);
                        break;
                    case 5:
                        secondStatus.replace("反射度", 5);
                        break;
                }
        }
    }

    public void naturalSkill() {
        switch (race) {
            case 1:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【武器：投擲武器】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                adventurerSkill.set(adventurerSkill.indexOf(""), "【   過重行動   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【  長距離移動  】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 2:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【   治癒適正   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【     暗視     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【     工作     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 3:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【  武器：弩弓  】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【     暗視     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【 精霊の愛し子 】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 4:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【   免疫強化   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【     暗視     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【   竜の末裔   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 5:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【     隠密     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                adventurerSkill.set(adventurerSkill.indexOf(""), "【     機先     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                generalSkill.set(generalSkill.indexOf(""), "【     調理     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
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
                        generalSkill.set(generalSkill.indexOf(""), "【    芸能：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = fume[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【   怪物知識   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = fume[originDice - 2];
                        initialClass = "魔術師";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【   文献調査   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【    職人：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    手仕事    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【 生産業：農業 】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【     頑健     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        vitality += 5;
                        break;
                    case 8:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     交渉     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 10;
                        break;
                    case 9:
                        origin = fume[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    第六感    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = fume[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     騎乗     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = fume[originDice - 2];
                        initialClass = "神官or竜司祭or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【  祈祷or瞑想  】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = fume[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     統率     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
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
                        generalSkill.set(generalSkill.indexOf(""), "【    芸能：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = dwarf[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【   怪物知識   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     交渉     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 10;
                        break;
                    case 6:
                        origin = dwarf[originDice - 2];
                        initialClass = "戦士or武道家or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     観察     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【  職人：鍛冶  】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    手仕事    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 8:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【    職人：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    手仕事    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 9:
                        origin = dwarf[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    第六感    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = dwarf[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【 強打攻撃・斬 】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = dwarf[originDice - 2];
                        initialClass = "神官or竜司祭";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     祈祷     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = dwarf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     統率     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
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
                        generalSkill.set(generalSkill.indexOf(""), "【    芸能：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = elf[originDice - 2];
                        initialClass = "野伏or精霊使い";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【   応急手当   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = elf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【    職人：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    手仕事    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = elf[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    第六感    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = elf[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【   怪物知識   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 8:
                        origin = elf[originDice - 2];
                        initialClass = "魔術師or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【 芸能：即興詩 】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 9:
                        origin = elf[originDice - 2];
                        initialClass = "野伏or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【  芸能：演奏  】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = elf[originDice - 2];
                        initialClass = "精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【   礼儀作法   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = elf[originDice - 2];
                        initialClass = "神官";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     祈祷     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = elf[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     統率     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
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
                        generalSkill.set(generalSkill.indexOf(""), "【    芸能：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = lizard[originDice - 2];
                        initialClass = "野伏or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【    職人：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = lizard[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     騎乗     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = lizard[originDice - 2];
                        initialClass = "斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     工作     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = lizard[originDice - 2];
                        initialClass = "野伏";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【  武器：弩弓  】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 8:
                        origin = lizard[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【   武器：槍   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 9:
                        origin = lizard[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""),
                                "【      盾      】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = lizard[originDice - 2];
                        initialClass = "魔術師or竜司祭";
                        initialClassLevel = "1";
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【     機先     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = lizard[originDice - 2];
                        initialClass = "神官or竜司祭";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     祈祷     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = lizard[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     統率     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
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
                        generalSkill.set(generalSkill.indexOf(""), "【    芸能：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 4:
                        origin = layer[originDice - 2];
                        initialClass = "魔術師or精霊使い";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【 芸能：即興詩 】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 5:
                        origin = layer[originDice - 2];
                        initialClass = "魔術師";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【   文献調査   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 6:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【    職人：    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【    手仕事    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 7:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【 生産業：農業 】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        adventurerSkill.set(adventurerSkill.indexOf(""), "【     頑健     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        vitality += 5;
                        break;
                    case 8:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     交渉     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 10;
                        break;
                    case 9:
                        origin = layer[originDice - 2];
                        initialClass = "戦士or武道家or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     観察     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 10:
                        origin = layer[originDice - 2];
                        initialClass = "野伏or斥候";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【 生産業：農業 】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 11:
                        origin = layer[originDice - 2];
                        initialClass = "戦士";
                        initialClassLevel = "1";
                        generalSkill.set(generalSkill.indexOf(""), "【     騎乗     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        break;
                    case 12:
                        origin = layer[originDice - 2];
                        generalSkill.set(generalSkill.indexOf(""), "【     統率     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                        credit += (rand.nextInt(6) + 1 + rand.nextInt(6) + 1) * 50;
                        break;
                }
                break;
        }
        switch (historyDice) {
            case 2:
                generalSkill.set(generalSkill.indexOf(""), "【     労働     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 3:
                generalSkill.set(generalSkill.indexOf(""), "【   犯罪知識   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 4:
                generalSkill.set(generalSkill.indexOf(""), "【   冷静沈着   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 5:
                generalSkill.set(generalSkill.indexOf(""), "【     神学     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 6:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【     忍耐     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 7:
                adventurerSkill.set(adventurerSkill.indexOf(""), "【     幸運     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 8:
                generalSkill.set(generalSkill.indexOf(""), "【    生存術    】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 9:
                generalSkill.set(generalSkill.indexOf(""), "【     博識     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 10:
                generalSkill.set(generalSkill.indexOf(""), "【  先入観なし  】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 11:
                generalSkill.set(generalSkill.indexOf(""), "【     鑑定     】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
                break;
            case 12:
                generalSkill.set(generalSkill.indexOf(""), "【   礼儀作法   】　 ●　　　　○　　　　○　　　　○　　 　 ○　 ／\n");
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
                + "\n持久度:" + secondStatus.get("持久度") + "\n反射度:" + secondStatus.get("反射度") + "\n");
    }

    public void printState() {
        System.out.println("生命力:" + vitality + "\n移動力:" + mobility + "\n呪文使用回数:" + spellUsageCount);
    }

    public void printCareer() {
        System.out.println("\n出自:" + origin + "\n来歴:" + historyDeci + "\n邂逅:" + encounterDeci);
    }

    public void printSheet() {
        System.out.println("名前：【】　　種族：【 " + raceStr + " 】　　性別：【 】　　年齢：【  】　　PL：【  】\n\n経歴：【 " + origin + " ／ "
                + historyDeci + " ／ " + encounterDeci
                + " 】　　等級：【 白磁等級 】\n\n身体的特徴：【  】\n\n経験点：【 3000 ／ 3000 】　　成長点：【 10 ／ 10 】\n\n冒険回数：【 0 】　　冒険達成数：【 0 】\n\n 設定\n\n◆能力値 \n【能力値】                           [第二能力値]\n［第一能力値］   【 集中度："
                + secondStatus.get("集中度") + " 】    【 持久度：" + secondStatus.get("持久度") + " 】    【 反射度："
                + secondStatus.get("反射度") + " 】\n 【 体力点：" + firstStatus.get("体力点") + " 】       [ "
                + (firstStatus.get("体力点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("体力点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("体力点") + secondStatus.get("反射度")) + " ]\n 【 魂魄点：" + firstStatus.get("魂魄点")
                + " 】       [ " + (firstStatus.get("魂魄点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("魂魄点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("魂魄点") + secondStatus.get("反射度")) + " ]\n 【 技量点：" + firstStatus.get("技量点")
                + " 】       [ " + (firstStatus.get("技量点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("技量点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("技量点") + secondStatus.get("反射度")) + " ]\n 【 知力点：" + firstStatus.get("知力点")
                + " 】       [ " + (firstStatus.get("知力点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("知力点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("知力点") + secondStatus.get("反射度")) + " ]\n\n　 生命力：【　" + vitality + "　】　 　 生命力２倍：【　"
                + (vitality * 2) + "　】\n\n　 移動力：【　" + mobility + "　】　　　呪文使用回数：【 " + spellUsageCount
                + " 】\n\n 呪文抵抗基準値（魂魄反射+冒険者LV+技能補正）：【 " + (firstStatus.get("魂魄点") + secondStatus.get("反射度") + 1)
                + " 】\n\n◆冒険者レベル：【 1 】\n\n　職業レベル：【 " + initialClass + "：" + initialClassLevel
                + " 】【 ： 】\n\n◆冒険者技能　　    初歩　／　習熟　／　熟達　／　達人　／　伝説　／　効果\n" + adventurerSkill.get(0)
                + adventurerSkill.get(1) + adventurerSkill.get(2) + adventurerSkill.get(3)
                + "\n◆一般技能 　 　    初歩　／　習熟　／　熟達　／　達人　／　伝説　／　効果\n" + generalSkill.get(0) + generalSkill.get(1)
                + generalSkill.get(2) + generalSkill.get(3)
                + "\n◆呪文\n　呪文行使基準値（知力集中or魂魄集中+技能補正）：【  】\n　真言：【  】　　奇跡：【  】　　祖竜：【  】　　精霊：【  】\n\n◎習得呪文：\n《 () 》：\n\n◆攻撃\n　命中基準値（技量集中）：【 "
                + (firstStatus.get("技量点") + secondStatus.get("集中度"))
                + " 】\n　近接：【  】　　弩弓：【  】　　投擲：【  】\n\n◎武器：\n【 () 】\n　用途／属性／射程：【  】 命中値合計：【  】 ダメージ：【  】\n　効果：\n\n◎効力値\n　～14：変化無し　15～19：+1D6　20～24：+2D6　25～29：+3D6　30～39：+4D6　40～：+5D6\n\n◆防御\n　回避基準値（技量反射+回避可能な職業LV+技能補正）：【 "
                + (firstStatus.get("技量点") + secondStatus.get("反射度"))
                + "回避可能な職業Lv+技能補正 】\n　盾受け基準値（技量反射+盾受け可能な職業LV+技能補正）：【 "
                + (firstStatus.get("技量点") + secondStatus.get("反射度"))
                + "盾受け可能な職業LV+技能補正 】\n\n◎鎧：\n【 () 】\n　属性：【  】　　装甲値：【  】　　回避値補正：【  】　　移動力修正：【  】　　隠密性：【  】\n　効果：\n\n◎盾：\n【  】\n　属性：【  】　盾受け修正：【  】　　盾受け値：【  】　　隠密性：【  】\n　効果：\n\n　移動力合計：【  】　　装甲値合計：【  】　　回避値合計：【  】\n　盾受け基準値合計：【  】　　隠密性合計：【  】\n\n◆所持金\n　銀貨："
                + credit + "枚\n\n◆その他の所持品\n　　冒険者ツール（鈎縄,楔*10,小槌,火口箱,背負い袋,水袋,携帯用食器,白墨,小刀,松明*6）\n　　携帯食(一日セット)*７、衣類");
    }

    public void copyToClipboard() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection selection = new StringSelection("名前：【】　　種族：【 " + raceStr
                + " 】　　性別：【 】　　年齢：【  】　　PL：【  】\n\n経歴：【 " + origin + " ／ " + historyDeci + " ／ " + encounterDeci
                + " 】　　等級：【 白磁等級 】\n\n身体的特徴：【  】\n\n経験点：【 3000 ／ 3000 】　　成長点：【 10 ／ 10 】\n\n冒険回数：【 0 】　　冒険達成数：【 0 】\n\n 設定\n\n◆能力値 \n【能力値】                           [第二能力値]\n［第一能力値］   【 集中度："
                + secondStatus.get("集中度") + " 】    【 持久度：" + secondStatus.get("持久度") + " 】    【 反射度："
                + secondStatus.get("反射度") + " 】\n 【 体力点：" + firstStatus.get("体力点") + " 】       [ "
                + (firstStatus.get("体力点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("体力点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("体力点") + secondStatus.get("反射度")) + " ]\n 【 魂魄点：" + firstStatus.get("魂魄点")
                + " 】       [ " + (firstStatus.get("魂魄点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("魂魄点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("魂魄点") + secondStatus.get("反射度")) + " ]\n 【 技量点：" + firstStatus.get("技量点")
                + " 】       [ " + (firstStatus.get("技量点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("技量点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("技量点") + secondStatus.get("反射度")) + " ]\n 【 知力点：" + firstStatus.get("知力点")
                + " 】       [ " + (firstStatus.get("知力点") + secondStatus.get("集中度")) + " ]              [ "
                + (firstStatus.get("知力点") + secondStatus.get("持久度")) + " ]              [ "
                + (firstStatus.get("知力点") + secondStatus.get("反射度")) + " ]\n\n　 生命力：【　" + vitality + "　】　 　 生命力２倍：【　"
                + (vitality * 2) + "　】\n\n　 移動力：【　" + mobility + "　】　　　呪文使用回数：【 " + spellUsageCount
                + " 】\n\n 呪文抵抗基準値（魂魄反射+冒険者LV+技能補正）：【 " + (firstStatus.get("魂魄点") + secondStatus.get("反射度") + 1)
                + " 】\n\n◆冒険者レベル：【 1 】\n\n　職業レベル：【 " + initialClass + "：" + initialClassLevel
                + " 】【 ： 】\n\n◆冒険者技能　　    初歩　／　習熟　／　熟達　／　達人　／　伝説　／　効果\n" + adventurerSkill.get(0)
                + adventurerSkill.get(1) + adventurerSkill.get(2) + adventurerSkill.get(3)
                + "\n◆一般技能 　 　    初歩　／　習熟　／　熟達　／　達人　／　伝説　／　効果\n" + generalSkill.get(0) + generalSkill.get(1)
                + generalSkill.get(2) + generalSkill.get(3)
                + "\n◆呪文\n　呪文行使基準値（知力集中or魂魄集中+技能補正）：【  】\n　真言：【  】　　奇跡：【  】　　祖竜：【  】　　精霊：【  】\n\n◎習得呪文：\n《 () 》：\n\n◆攻撃\n　命中基準値（技量集中）：【 "
                + (firstStatus.get("技量点") + secondStatus.get("集中度"))
                + " 】\n　近接：【  】　　弩弓：【  】　　投擲：【  】\n\n◎武器：\n【 () 】\n　用途／属性／射程：【  】 命中値合計：【  】 ダメージ：【  】\n　効果：\n\n◎効力値\n　～14：変化無し　15～19：+1D6　20～24：+2D6　25～29：+3D6　30～39：+4D6　40～：+5D6\n\n◆防御\n　回避基準値（技量反射+回避可能な職業LV+技能補正）：【 "
                + (firstStatus.get("技量点") + secondStatus.get("反射度"))
                + "回避可能な職業Lv+技能補正 】\n　盾受け基準値（技量反射+盾受け可能な職業LV+技能補正）：【 "
                + (firstStatus.get("技量点") + secondStatus.get("反射度"))
                + "盾受け可能な職業LV+技能補正 】\n\n◎鎧：\n【 () 】\n　属性：【  】　　装甲値：【  】　　回避値補正：【  】　　移動力修正：【  】　　隠密性：【  】\n　効果：\n\n◎盾：\n【  】\n　属性：【  】　盾受け修正：【  】　　盾受け値：【  】　　隠密性：【  】\n　効果：\n\n　移動力合計：【  】　　装甲値合計：【  】　　回避値合計：【  】\n　盾受け基準値合計：【  】　　隠密性合計：【  】\n\n◆所持金\n　銀貨："
                + credit + "枚\n\n◆その他の所持品\n　　冒険者ツール（鈎縄,楔*10,小槌,火口箱,背負い袋,水袋,携帯用食器,白墨,小刀,松明*6）\n　　携帯食(一日セット)*７、衣類");
        clipboard.setContents(selection, selection);
        System.out.println("キャラクターシートをクリップボードにコピーしました");
    }
}