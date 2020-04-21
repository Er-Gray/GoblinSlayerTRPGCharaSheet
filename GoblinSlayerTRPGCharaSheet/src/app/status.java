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
    }

    public HashMap<String, Integer> getFirstStatus() {
        return firstStatus;
    }

    public HashMap<String, Integer> getSecondStatus() {
        return secondStatus;
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
                        break;
                    case 3:
                        origin = fume[originDice - 2];
                        break;
                    case 4:
                        origin = fume[originDice - 2];
                        break;
                    case 5:
                        origin = fume[originDice - 2];
                        break;
                    case 6:
                        origin = fume[originDice - 2];
                        break;
                    case 7:
                        origin = fume[originDice - 2];
                        break;
                    case 8:
                        origin = fume[originDice - 2];
                        break;
                    case 9:
                        origin = fume[originDice - 2];
                        break;
                    case 10:
                        origin = fume[originDice - 2];
                        break;
                    case 11:
                        origin = fume[originDice - 2];
                        break;
                    case 12:
                        origin = fume[originDice - 2];
                        break;
                }
                break;
            case 2:
                switch (originDice) {
                    case 2:
                        origin = dwarf[originDice - 2];
                        break;
                    case 3:
                        origin = dwarf[originDice - 2];
                        break;
                    case 4:
                        origin = dwarf[originDice - 2];
                        break;
                    case 5:
                        origin = dwarf[originDice - 2];
                        break;
                    case 6:
                        origin = dwarf[originDice - 2];
                        break;
                    case 7:
                        origin = dwarf[originDice - 2];
                        break;
                    case 8:
                        origin = dwarf[originDice - 2];
                        break;
                    case 9:
                        origin = dwarf[originDice - 2];
                        break;
                    case 10:
                        origin = dwarf[originDice - 2];
                        break;
                    case 11:
                        origin = dwarf[originDice - 2];
                        break;
                    case 12:
                        origin = dwarf[originDice - 2];
                        break;
                }
                break;
            case 3:
                switch (originDice) {
                    case 2:
                        origin = elf[originDice - 2];
                        break;
                    case 3:
                        origin = elf[originDice - 2];
                        break;
                    case 4:
                        origin = elf[originDice - 2];
                        break;
                    case 5:
                        origin = elf[originDice - 2];
                        break;
                    case 6:
                        origin = elf[originDice - 2];
                        break;
                    case 7:
                        origin = elf[originDice - 2];
                        break;
                    case 8:
                        origin = elf[originDice - 2];
                        break;
                    case 9:
                        origin = elf[originDice - 2];
                        break;
                    case 10:
                        origin = elf[originDice - 2];
                        break;
                    case 11:
                        origin = elf[originDice - 2];
                        break;
                    case 12:
                        origin = elf[originDice - 2];
                        break;
                }
                break;
            case 4:
                switch (originDice) {
                    case 2:
                        origin = lizard[originDice - 2];
                        break;
                    case 3:
                        origin = lizard[originDice - 2];
                        break;
                    case 4:
                        origin = lizard[originDice - 2];
                        break;
                    case 5:
                        origin = lizard[originDice - 2];
                        break;
                    case 6:
                        origin = lizard[originDice - 2];
                        break;
                    case 7:
                        origin = lizard[originDice - 2];
                        break;
                    case 8:
                        origin = lizard[originDice - 2];
                        break;
                    case 9:
                        origin = lizard[originDice - 2];
                        break;
                    case 10:
                        origin = lizard[originDice - 2];
                        break;
                    case 11:
                        origin = lizard[originDice - 2];
                        break;
                    case 12:
                        origin = lizard[originDice - 2];
                        break;
                }
                break;
            case 5:
                switch (originDice) {
                    case 2:
                        origin = layer[originDice - 2];
                        break;
                    case 3:
                        origin = layer[originDice - 2];
                        break;
                    case 4:
                        origin = layer[originDice - 2];
                        break;
                    case 5:
                        origin = layer[originDice - 2];
                        break;
                    case 6:
                        origin = layer[originDice - 2];
                        break;
                    case 7:
                        origin = layer[originDice - 2];
                        break;
                    case 8:
                        origin = layer[originDice - 2];
                        break;
                    case 9:
                        origin = layer[originDice - 2];
                        break;
                    case 10:
                        origin = layer[originDice - 2];
                        break;
                    case 11:
                        origin = layer[originDice - 2];
                        break;
                    case 12:
                        origin = layer[originDice - 2];
                        break;
                }
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

    public void printStatus() {
        System.out.println("第一能力値\n体力点:" + firstStatus.get("体力点") + "\n魂魄点:" + firstStatus.get("魂魄点") + "\n技量点:"
                + firstStatus.get("技量点") + "\n知力点:" + firstStatus.get("知力点") + "\n第二能力値\n集中度:" + secondStatus.get("集中度")
                + "\n持久度:" + secondStatus.get("持久度") + "\n反射度:" + secondStatus.get("反射度"));
    }

    public void printCareer() {
        System.out.println("\n出自:" + origin + "\n来歴:" + historyDeci + "\n邂逅:" + encounterDeci);
    }
}