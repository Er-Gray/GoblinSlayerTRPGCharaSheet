package app;

import java.util.*;

public class status {
    private int race;
    private HashMap<String, Integer> firstStatus = new HashMap<String, Integer>();
    private HashMap<String, Integer> secondStatus = new HashMap<String, Integer>();

    status(int race, HashMap<String, Integer> firstStatus, HashMap<String, Integer> secondStatus) {
        this.race = race;
        this.firstStatus = firstStatus;
        this.secondStatus = secondStatus;
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

    public void printStatus() {
        System.out.println("第一能力値\n体力点:" + firstStatus.get("体力点") + "\n魂魄点:" + firstStatus.get("魂魄点") + "\n技量点:"
                + firstStatus.get("技量点") + "\n知力点:" + firstStatus.get("知力点") + "\n第二能力値\n集中度:" + secondStatus.get("集中度")
                + "\n持久度:" + secondStatus.get("持久度") + "\n反射度:" + secondStatus.get("反射度"));
    }
}