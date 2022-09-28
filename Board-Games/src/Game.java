import GameEntity.GameOperation;
import GameEntity.GameType;
import GameEntity.OrderChaos.OCGameOperation;
import GameEntity.TicTacToe.TTTGameOperation;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to board game");
        System.out.println("Please enter the game number to select game");
        System.out.println("1.Tic Tac Toe");
        System.out.println("2.Order & Chaos");
        Scanner scanner = new Scanner(System.in);
        int gameNum = scanner.nextInt();
        GameOperation gameOperation;
        switch (gameNum){
            case 1:
                 gameOperation = new TTTGameOperation(GameType.TicTacToe.getGameType());
                break;
            case 2:
                 gameOperation = new OCGameOperation(GameType.OrderChaos.getGameType(), 6,6);
                break;
            default:
                System.out.println();
        }
    }

    public void exit(){

    }
}
