package Algorithms;

import java.util.ArrayList;

public class Monkeys {
    private ArrayList<Monkey> monkeys;
    public Monkeys(){
        monkeys = new ArrayList<>();
    }
    public ArrayList<Monkey> getMonkeys() {
        return monkeys;
    }

    public boolean addMonkey(String[] line){
        int monkeyNum = Integer.parseInt(line[0]);
        int evenRocks = Integer.parseInt(line[1]);
        int oddRocks = Integer.parseInt(line[2]);
        int startingRocks = Integer.parseInt(line[3]);
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 4; i < line.length; i++){
            int value = Integer.parseInt(line[i]);
            if(value%2==0){
                evenNumber++;
            }else {oddNumber++;}
        }
        return monkeys.add(new Monkey(monkeyNum,evenRocks,oddRocks,startingRocks,evenNumber,oddNumber));
    }
}
