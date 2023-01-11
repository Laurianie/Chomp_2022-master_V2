import java.awt.*;
import java.util.ArrayList;

public class Boards {
 //   int[] boardState = new int[3];
    Point bMove;
    int col1;
    int col2;
    int col3;
    int loseCol1;
    int loseCol2;
    int loseCol3;



    //original boards, lose boards, coordinates where to move
    public Boards(int f, int s, int t, int row, int col) {

    col1 = f;
    col2 = s;
    col3 = t;


    bMove = new Point (row,col);


}
}
