package main;

public class ListADT {
    private String name;
    private long rollno;
    public ListADT[] sectionG;
    private int listBottom = -1;
    public ListADT() {
        sectionG = new ListADT[37];
    }

    public String getName() {
        return name;
    }

    public long getRollno() {
        return rollno;
    }

    void insert(ListADT student){
        if(this.isFull())
        {
            System.out.println("List already full!");
        }
        else
        {
            listBottom++;
            sectionG[listBottom] = student;

        }
    }
    boolean isFull(){
        if(listBottom == sectionG.length-1 && sectionG[sectionG.length-1] != null)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}


