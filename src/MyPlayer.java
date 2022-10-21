import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];

//    ArrayList<int[]> boards = new ArrayList<int[]>();
//        for (int f = 1; f <= 3; f++){
//            for (int s = 0; s <= f; s++){
//                for (int t = 0; t <= s; t++){
//                        System.out.println(f + "" + s + "" + t);
//                        int [] board3x3 = {f,s,t};
//                }}}


        System.out.println("333 BOARD PRINT OUTS");
        for (int c = 3; c>=0; c--) {
            int a = 3;
            int b = 3;
            System.out.println(a + "" + b + "" + c);
        }

        for (int b = 2; b >= 0;b--){
            int a = 3;
            int c = b;
            System.out.println(a + "" + b + "" + c);
        }

        for (int a = 2; a>= 1; a--){
            int b = a;
            int c = a;
            System.out.println(a + "" + b + "" + c);
        }






        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
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
