import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    ArrayList<int[]> allBoards = new ArrayList<int[]>();
    ArrayList<int[]> loseBoards = new ArrayList<int[]>();






    public MyPlayer() {
        columns = new int[10];
        for (int f = 1; f <= 3; f++) {
            for (int s = 0; s <= f; s++) {
                for (int t = 0; t <= s; t++) {
                    System.out.println("board: " + f + "" + s + "" + t);
                    generatePossibleBoards(f, s, t); //create board object
                    int[] OGboards = new int[3];
                    OGboards[0] = f;
                    OGboards[1] = s;
                    OGboards[2] = t;
                    allBoards.add(OGboards);
                }
            }
        }
    }

    public void generatePossibleBoards(int f, int s, int t) {
        System.out.println("vv results vv ");
        int x = f;
        int y = s;
        int z = t;
        // x,y, and z are storing the original values of f,s,and t so that when boards like 111 and 222 need to be printed, we can refer to original values of
        //f,s,and t rather than the the changed values of f,s,and t

        for (int c = t-1; c >= 0; c--){
            System.out.println(f+""+s+""+c);
            if (c == 0 && c == s && f == c+1){
                System.out.println("LOSE^");
            }
        }
        for (int b = s-1; b >=0; b--){
            if (b < t){
                t = b;
            }
            System.out.println(f+""+b+""+t);
            if (b == 0 && b == t && f == b+1){
                System.out.println("LOSE^");
            }
        }
        t = z;
        // f-1 (same for s-1 and t-1) allow the actual board not to be reprinted because the "-1" subtracts that number (3,2, or 1)
        // after all of the boards requiring that number have already been printed

        for (int a = f-1; a >= 1; a--){
            if (a < s){
                s = a;
            }
            if (a < t){
                t = a;
            }
            System.out.println(a+""+s+""+t);
            if (a == 1 && a == s+1 && a == t+1){
                System.out.println("LOSE^");
            }
        }
        int[] LB = new int[5];
        LB[0] = 100;
        LB[1] = 210;
        LB[2] = 221;
        LB[3] = 311;
        LB[4] = 320;
        loseBoards.add(LB);

        for (int cycle = 0; cycle <= LB.length - 1; cycle++){
            System.out.print("This is a losing board: ");
            System.out.println(LB[cycle]);
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
