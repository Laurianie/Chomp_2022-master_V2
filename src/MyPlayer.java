import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    ArrayList<Boards> allBoards = new ArrayList<>();
    ArrayList<Boards> loseBoards = new ArrayList<>();
    boolean isLB = false;
    int xcord;
    int ycord;


    public MyPlayer() {
        columns = new int[10];
        for (int f = 1; f <= 5; f++) {
            for (int s = 0; s <= f; s++) {
                for (int t = 0; t <= s; t++) {
                    for (int fo = 0; fo <= t; fo++) {
                        for (int fi = 0; fi <= fo; fi++) {
                            System.out.println("board: " + f + "" + s + "" + t + "" + fo + "" + fi);
                            generatePossibleBoards(f, s, t, fo, fi);
                            int OGboards[] = {f, s, t, fo, fi};
                        }
                    }
                }
            }
        }
    }

    public void generatePossibleBoards(int f, int s, int t, int fo, int fi) {
        if (f == 2 && s == 2 && t == 2) {
            System.out.println("loose boards so far");
            for (int dd = 0; dd < loseBoards.size(); dd++) {
                System.out.println(loseBoards.get(dd).col1 + "" + loseBoards.get(dd).col2 + "" + loseBoards.get(dd).col3);
            }
        }
        System.out.println("results vv ");
        int x = f;
        int y = s;
        int z = t;
        int xy = fo;
        int xz = fi;

        isLB = false;

        Boards newBoard = new Boards(f, s, t, fo, fi, xcord, ycord);

        for (int e = fi - 1; e >= 0; e--) {
            for (int k = 0; k < loseBoards.size(); k++) {
                if (e == loseBoards.get(k).col5 && fo == loseBoards.get(k).col4 && t == loseBoards.get(k).col3 && s == loseBoards.get(k).col2 && f == loseBoards.get(k).col1) {

                    System.out.print("LOSE --> ");
                    coordSnatcher(f, s, t, fo, fi, f, s, t, fo, e, newBoard);
                    isLB = true;
                    xcord = 3;
                    ycord = 2;
                    newBoard.loseCol1 = f;
                    newBoard.loseCol2 = s;
                    newBoard.loseCol3 = t;
                    newBoard.loseCol4 = fo;
                }
            }

        }
        for (int d = fo - 1; d >= 0; d--) {
            for (int k = 0; k < loseBoards.size(); k++) {
                if (fi == loseBoards.get(k).col5 && d == loseBoards.get(k).col4 && t == loseBoards.get(k).col3 && s == loseBoards.get(k).col2 && f == loseBoards.get(k).col1) {

                    System.out.print("LOSE --> ");
                    coordSnatcher(f, s, t, fo, fi, f, s, t, d, fi, newBoard);
                    isLB = true;
                    xcord = d;
                    ycord = 2;
                    newBoard.loseCol1 = f;
                    newBoard.loseCol2 = s;
                    newBoard.loseCol3 = t;
                    newBoard.loseCol4 = fo;
                }
            }

        }
        for (int c = t - 1; c >= 0; c--) {
            for (int k = 0; k < loseBoards.size(); k++) {
                if (fi == loseBoards.get(k).col5 && fo == loseBoards.get(k).col4 && c == loseBoards.get(k).col3 && s == loseBoards.get(k).col2 && f == loseBoards.get(k).col1) {

                    System.out.print("LOSE --> ");
                    coordSnatcher(f, s, t, fo, fi, f, s, c, fo, fi, newBoard);
                    isLB = true;
                    xcord = c;
                    ycord = 2;
                    newBoard.loseCol1 = f;
                    newBoard.loseCol2 = s;
                    newBoard.loseCol3 = c;
                }
            }

            System.out.println(f + "" + s + "" + c);
        }

        for (int b = s - 1; b >= 0; b--) {
            if (b < t) {
                t = b;
            }
            for (int k = 0; k < loseBoards.size(); k++) {
                if (fi == loseBoards.get(k).col5 && fo == loseBoards.get(k).col4 && b == loseBoards.get(k).col2 && t == loseBoards.get(k).col3 && f == loseBoards.get(k).col1) {
                    System.out.print("LOSE --> ");
                    coordSnatcher(f, s, t, fo, fi, f, b, t, fo, fi, newBoard);
                    isLB = true;
                    xcord = b;
                    ycord = 1;
                    newBoard.loseCol1 = f;
                    newBoard.loseCol2 = b;
                    newBoard.loseCol3 = t;
                }
            }
            System.out.println(f + "" + b + "" + t);
        }


        t = z;
        for (int a = f - 1; a >= 1; a--) {
            if (a < s) {
                s = a;
            }
            if (a < t) {
                t = a;
            }
            for (int k = 0; k < loseBoards.size(); k++) {
                if (fi == loseBoards.get(k).col5 && fo == loseBoards.get(k).col4 && t == loseBoards.get(k).col3 && s == loseBoards.get(k).col2 && a == loseBoards.get(k).col1) {
                    System.out.print("LOSE --> ");
                    coordSnatcher(f, s, t, fo, fi, a, s, t, fo, fi, newBoard);
                    isLB = true;
                    xcord = a;
                    ycord = 0;
                    newBoard.loseCol1 = a;
                    newBoard.loseCol2 = s;
                    newBoard.loseCol3 = t;
                }
            }
            System.out.println(a + "" + s + "" + t);

        }


        System.out.println(isLB);
        t = z;
        s = y;
        f = x;
        if (isLB == false) {
            int[] LB = new int[3];
            LB[0] = f;
            LB[1] = s;
            LB[2] = t;
            System.out.println(f + "" + s + "" + t);
            loseBoards.add(new Boards(f, s, t, fo, fi, xcord, ycord));
        }

        allBoards.add(newBoard);
    }

    public void coordSnatcher(int f, int s, int t, int fo, int fi, int a, int b, int c, int d, int e, Boards B) {
        if (f - a == 0) {
            if (s - b == 0) {
                if (t - c == 0) {
                    if (fo - d == 0) {
                        if(fi - e!= 0){
                            System.out.println();
                            B.bMove = new Point(e, 4);
                        }
                    }
                    else{
                        System.out.println();
                        B.bMove = new Point(d, 3);
                    }
                } else {
                    System.out.println("c: " + 2 + " r: " + c);
                    B.bMove = new Point(c, 2);
                }
            } else {
                System.out.println("c: " + 1 + " r: " + b);
                B.bMove = new Point(b, 1);
            }
        } else {
            System.out.println("c: " + 0 + " r: " + a);
            B.bMove = new Point(a, 0);
        }

    }

    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");
        int CA = 0;
        int CB = 0;
        int CC = 0;

        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        for (int r = 0; r < gameBoard.length; r++) {
            for (int c = 0; c < gameBoard[row].length; c++) {
                if (c == 0 && gameBoard[r][c].isAlive) {
                    CA++;
                }
                if (c == 1 && gameBoard[r][c].isAlive) {
                    CB++;
                }
                if (c == 2 && gameBoard[r][c].isAlive) {
                    CC++;
                }
            }
        }
        System.out.println(CA + "" + CB + "" + CC);

        for (int aB = 0; aB < allBoards.size(); aB++) {
            if (CA == allBoards.get(aB).col1 && CB == allBoards.get(aB).col2 && CC == allBoards.get(aB).col3) {
                System.out.println("row: " + allBoards.get(aB).bMove.x + " col: " + allBoards.get(aB).bMove.y);

                return allBoards.get(aB).bMove;
            }

        }


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

