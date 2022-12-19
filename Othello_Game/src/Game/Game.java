package Game;

import java.util.Scanner;




public class Game {
private Players player1,player2;
private Board board;
private Scanner s;
private Scanner s2;

public void startGame() {
			
			s2 = new Scanner(System.in);
			
			player1=input(1);
			player2=input(2);
			Integer boardSize=8;


			
			board=new Board(boardSize,player1.getSymbol(), player2.getSymbol());
			move=new Move(boardSize,player1.getPieces(),player2.getPieces());
			System.out.println("Start Playing The Othello");
			move.print();
			
			boolean player1Turn=true;
		
			while(!move.isFull()) {
				
				if(player1Turn) {
					if(move.noMovesAvailable(player1.getPieces())) {						
						System.out.println("Player1 ("+player1.getPieces()+") cannot make a move");	
						player1Turn=false;
						continue;
					}
					else {
						System.out.println("Enter player1("+player1.getPieces()+")'s move : ");
					}
				}
}

private Player input(Integer num) {
		
		Scanner s=new Scanner(System.in);
					
		System.out.println("Enter the name of player"+num+"(one word) : ");
		String name=s.next();
		
		System.out.println("Enter the symbol of player"+num+"(one character) : ");			
		String str=s.next();
		char ch=str.charAt(0);						
		
		Player play=new Player(name, ch);
		return play;
		
	}


}
