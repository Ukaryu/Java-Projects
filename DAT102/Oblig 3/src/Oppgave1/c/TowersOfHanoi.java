package Oppgave1.c;

/**
 * Created by Martin on 19.03.2015.
 */
public class TowersOfHanoi {

    private int totalDisks;
    private int totalMoves = 0;

    public TowersOfHanoi(int disks){
        totalDisks = disks;
    }

    public void solve(){
        moveTower(totalDisks, 1, 3, 2);
    }

    private void moveTower(int numDisks, int start, int end, int temp){
        if (numDisks == 1){
            moveOneDisk(start,end);
        } else {
            moveTower(numDisks-1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks-1, temp, end, start);
        }
    }

    private void moveOneDisk(int start, int end){
        //System.out.println("Move one disk from " + start + " to " + end);
        totalMoves++;
    }

    public int getMovement() {
        return totalMoves;
    }
}
