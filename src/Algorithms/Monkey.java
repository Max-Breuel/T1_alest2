package Algorithms;

public class Monkey {
    private int monkeyNum; // numero do macaquinho
    private int evenRocks; // numero do macaquinho que o sera enviado em caso de numero par
    private int oddRocks; // numeto do macaquingo que sera enviado em caso de numero impar
    private int numStartingRocks; // numero inicial de artefatos
    private int numEvenRocks; // numero de artfatos que o macaquinho tem com numero par
    private int numOddRocks; // numero de artfatos que o macaquinho tem com numero impar
    public Monkey(int monkeyNum, int evenRocks, int oddRocks, int numStartingRocks, int numEvenRocks, int numOddRocks){
        this.monkeyNum = monkeyNum;
        this.evenRocks = evenRocks;
        this.oddRocks = oddRocks;
        this.numStartingRocks = numStartingRocks;
        this.numEvenRocks = numEvenRocks;
        this.numOddRocks = numOddRocks;
    }
    public int getMonkeyNum() {
        return monkeyNum;
    }

    public int getEvenRocks() {
        return evenRocks;
    }

    public int getOddRocks() {
        return oddRocks;
    }

    public int getNumEvenRocks() {
        return numEvenRocks;
    }

    public void setNumEvenRocks(int numEvenRocks) {
        this.numEvenRocks = numEvenRocks;
    }

    public int getNumOddRocks() {
        return numOddRocks;
    }

    public void setNumOddRocks(int numOddRocks) {
        this.numOddRocks = numOddRocks;
    }
}
