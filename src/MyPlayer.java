import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];
//        int[]values = {100,110,111,200,210,211,220,221,222,300,310,311,320,321,322,330,331,332,333};
//            for (int i: values){
//                System.out.println(i);

        for (int f = 1; f <= 3; f++){
            for (int s = 0; s <= f; s++){
                for (int t = 0; t <= s; t++){
                        System.out.println(f + "," + s + "," + t);
                }
            }
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
