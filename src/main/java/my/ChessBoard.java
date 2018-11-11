package my;

public class ChessBoard {
    private final int N = 15;
    public chess[][] board = new chess[N][N];

    public ChessBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                board[i][j] = chess.NONE;
        }
    }

    public boolean move(int x, int y, type type) {
        if (x >= 0 && x < N && y >= 0 && y < N)
            if (board[x][y] == chess.NONE) {
                if (type == my.type.ROBOT) {
                    board[x][y] = Config.ROBOT_CHESS;
                } else {
                    board[x][y] = Config.PERSON_CHESS;
                }
                print();
                judge();
                return true;
            } else {
                System.out.println("此位置已经有棋子");
            }
        else {
            System.out.println("下棋位置不合法");
        }
        return false;
    }

    private void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                if (board[i][j] == chess.NONE) {
                    System.out.print(".");
                } else if (board[i][j] == chess.BLACK) {
                    System.out.print("@");
                } else {
                    System.out.print("#");
                }
            System.out.println();
        }
    }

    private void judge() {
        for (int i = 0; i < N - 4; i++) {
            for (int j = 0; j < N - 4; j++) {
                if (board[i][j] == Config.ROBOT_CHESS
                        && board[i][j + 1] == Config.ROBOT_CHESS
                        && board[i][j + 2] == Config.ROBOT_CHESS
                        && board[i][j + 3] == Config.ROBOT_CHESS
                        && board[i][j + 4] == Config.ROBOT_CHESS) {
                    System.out.println("机器人胜利！");
                    System.exit(1);
                }
            }
        }
        for (int i = 0; i < N - 4; i++) {
            for (int j = 0; j < N - 4; j++) {
                if (board[i][j] == Config.ROBOT_CHESS
                        && board[i + 1][j] == Config.ROBOT_CHESS
                        && board[i + 2][j] == Config.ROBOT_CHESS
                        && board[i + 3][j] == Config.ROBOT_CHESS
                        && board[i + 4][j] == Config.ROBOT_CHESS) {
                    System.out.println("机器人胜利！");
                    System.exit(1);
                }
            }
        }
        for (int i = 0; i < N - 4; i++) {
            for (int j = 0; j < N - 4; j++) {
                if (board[i][j] == Config.ROBOT_CHESS
                        && board[i + 1][j + 1] == Config.ROBOT_CHESS
                        && board[i + 2][j + 2] == Config.ROBOT_CHESS
                        && board[i + 3][j + 3] == Config.ROBOT_CHESS
                        && board[i + 4][j + 4] == Config.ROBOT_CHESS) {
                    System.out.println("机器人胜利！");
                    System.exit(1);
                }
            }
        }

        for (int i = 0; i < N - 4; i++) {
            for (int j = 0; j < N - 4; j++) {
                if (board[i][j] == Config.PERSON_CHESS
                        && board[i][j + 1] == Config.PERSON_CHESS
                        && board[i][j + 2] == Config.PERSON_CHESS
                        && board[i][j + 3] == Config.PERSON_CHESS
                        && board[i][j + 4] == Config.PERSON_CHESS) {
                    System.out.println("玩家胜利！");
                    System.exit(1);
                }
            }
        }
        for (int i = 0; i < N - 4; i++) {
            for (int j = 0; j < N - 4; j++) {
                if (board[i][j] == Config.PERSON_CHESS
                        && board[i + 1][j] == Config.PERSON_CHESS
                        && board[i + 2][j] == Config.PERSON_CHESS
                        && board[i + 3][j] == Config.PERSON_CHESS
                        && board[i + 4][j] == Config.PERSON_CHESS) {
                    System.out.println("玩家胜利！");
                    System.exit(1);
                }
            }
        }
        for (int i = 0; i < N - 4; i++) {
            for (int j = 0; j < N - 4; j++) {
                if (board[i][j] == Config.PERSON_CHESS
                        && board[i + 1][j + 1] == Config.PERSON_CHESS
                        && board[i + 2][j + 2] == Config.PERSON_CHESS
                        && board[i + 3][j + 3] == Config.PERSON_CHESS
                        && board[i + 4][j + 4] == Config.PERSON_CHESS) {
                    System.out.println("玩家胜利！");
                    System.exit(1);
                }
            }
        }
    }

}

enum chess {
    NONE,
    BLACK,
    WHITE
}

enum type {
    ROBOT,
    PERSON
}