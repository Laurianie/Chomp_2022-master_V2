import java.awt.*;

public class Boards {
    Point bMove;
    int col1;
    int col2;
    int col3;
    int col4;
    int col5;
    int loseCol1;
    int loseCol2;
    int loseCol3;
    int loseCol4;
    int loseCol5;


    public Boards(int f, int s, int t,int fo, int fi, int row, int col) {

    col1 = f;
    col2 = s;
    col3 = t;
    col4 = fo;
    col5 = fi;


    bMove = new Point (row,col);


}
}
