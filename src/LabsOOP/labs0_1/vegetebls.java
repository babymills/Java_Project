package LabsOOP.labs0_1;

/**
 * Created by Катя on 27.10.2015.
 */
public class vegetebls implements Comparable<vegetebls> {
    private String name;
    private int callories;
    private int gramm;

    public vegetebls(String name, int callories, int gramm) {
        this.name = name;
        this.callories = callories;
        this.gramm = gramm;
    }

    public String getName() {
        return name;
    }

    public int getCallories() {
        return callories;
    }

    public int getGramm() {
        return gramm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }

    public void setGramm(int gramm) {
        this.gramm = gramm;
    }

    @Override
    public String toString() {
        return   name +
                ": callories=" + callories ;
    }

    public  int compareTo(vegetebls e){
        if(callories < e.callories) return -1;
        if(callories > e.callories) return 1;
        return 0;

    }

}