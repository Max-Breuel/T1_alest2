package Algorithms;

import java.util.ArrayList;

public class Rounds {
    private int numRounds;
    private ArrayList<Monkey> monkeys = new ArrayList<>();

    public Rounds(int numRounds, ArrayList<Monkey> monkeys) {
        this.numRounds = numRounds;
        this.monkeys = monkeys;
    }

    public Monkey doRounds() {
        int round = 0;
        while (round <= numRounds) {
            for (int i = 0; i < monkeys.size(); i++) {
                int evenRockReciever = monkeys.get(i).getEvenRocks();
                int oddRockReciever = monkeys.get(i).getOddRocks();

                setNumRocks(i, evenRockReciever, 0);
                setNumRocks(i, oddRockReciever, 1);
            }
            round++;
        }
        return setWinner();
    }
    private void setNumRocks( int index, int recieverIndex, int evenOrOdd){
        if(evenOrOdd == 0){ // in case of the trade with the even monkey
            int valueSender = monkeys.get(index).getNumEvenRocks();
            int valueReciever = monkeys.get(recieverIndex).getNumEvenRocks();
            monkeys.get(recieverIndex).setNumEvenRocks(valueSender + valueReciever);
            monkeys.get(index).setNumEvenRocks(0);
            return;
        }
        if(evenOrOdd == 1){ // in case of an odd number monkey
            int valueSender = monkeys.get(index).getOddRocks();
            int valueReciever = monkeys.get(recieverIndex).getNumOddRocks();
            monkeys.get(recieverIndex).setNumOddRocks(valueSender + valueReciever);
            monkeys.get(index).setNumOddRocks(0);
            return;
        }
    }
    public Monkey setWinner () {
        Monkey monkey = new Monkey(0,0,0,0,0,0);
        for (Monkey value: monkeys) {
            if (value.getNumEvenRocks() + value.getNumOddRocks() > monkey.getNumEvenRocks() + monkey.getNumOddRocks()){
                monkey = value;
            }
        }
        return monkey;
    }
}