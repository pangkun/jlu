package my;

import java.util.Scanner;

/**
 * @author pangkun
 * @date 2018/11/11 下午5:02
 */
public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard=new ChessBoard();
        Robot robot=new Robot(chessBoard);
        Person person=new Person(chessBoard);
        while (true){
            Scanner scanner=new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            person.move(x,y);

        }
    }
}
