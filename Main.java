import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        String player = "X";

        do{
            System.out.println(game.displayBoard());
            System.out.println("Enter the coordinate for row :");
            int row = input.nextInt();
            System.out.println("Enter the coordinate for column :");
            int col = input.nextInt();
            game.setPlayer(row,col,player);
            if (game.isGameOver()){
                System.out.println(game.displayBoard()+ "\n"+ player +" Wins !");
                break;
            }
            if (player == "X")
                player = "O";
            else player = "X";
        }while(true);


    }
}
