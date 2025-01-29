//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.import songboard.*;
import java.util.Arrays;
import songboard.*;

// Test SongBoard Implementation
public class Main {
    public static void main(String[] args) {
        SongBoard mySongBoard;
        mySongBoard = new SongBoard();
        mySongBoard.printTopTen();
        mySongBoard.scrambleBoard();
        int[] returnArray;
        // See if the scramble board worked
        System.out.println("\n\nThe new scrambled board is:");
        mySongBoard.printTopTen();
        // Now make call to insertionSortBoard here
        returnArray = mySongBoard.insertionSortBoard();
        System.out.println("\n\nThe now sorted board is:");
        mySongBoard.printTopTen();
        // For testing later: print returnArray, compare with expected
//        System.out.println();
        String sortedString = Arrays.toString(returnArray);
        System.out.println(sortedString);
        mySongBoard.printTopTen();
    }
}