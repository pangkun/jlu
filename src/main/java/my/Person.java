package my;

/**
 * @author pangkun
 * @date 2018/11/11 下午5:05
 */
public class Person {
    private ChessBoard chessBoard;

    public Person(ChessBoard chessBoard){
        this.chessBoard=chessBoard;
    }

    public void move(int x,int y){
        chessBoard.move(x,y,type.PERSON);
    }
}
