import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;


    public MyPlayer() {
        columns = new int[10];
        ArrayList<int[]> allBoards = new ArrayList<>();
        for (int f = 1; f <= 3; f++) {
            for (int s = 0; s <= f; s++) {
                for (int t = 0; t <= s; t++) {
                    System.out.println("board: " + f + "" + s + "" + t);
                    generatePossibleBoards(f,s,t);

                }
            }
        }

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
    }

    public void generatePossibleBoards(int f, int s, int t) {
        System.out.println("results: ");
        for (int c = 0; c <= t; c++){
            System.out.println(f+""+s+""+c);
        }
        for (int b = 0; b <= s; b++){
            System.out.println(f+""+b+""+t);
        }
        for (int a = 1; a <= f; a++){
            System.out.println(a+""+s+""+t);
        }

    }



    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

}
