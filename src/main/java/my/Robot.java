package my;

/**
 * @author pangkun
 * @date 2018/11/11 下午3:59
 */
public class Robot {

    private ChessBoard chessBoard;
    public Robot(ChessBoard chessBoard) {
        this.chessBoard=chessBoard;
    }

    public void move(){
        int a[]= getNext();
        chessBoard.move(a[0],a[1],type.ROBOT);
    }

    private int []getNext(){
        int a[]=new int[2];
        return a;
    }

}
