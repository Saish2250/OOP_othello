package Game;

import java.util.Scanner;




public class Game {
private Players player1,player2;
private Board board;
private Scanner sc;
private Scanner sc1;

public void startGame() {
			
			sc1 = new Scanner(System.in);
			
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
				}else {
					if(move.noMovesAvailable(player2.getPieces())) {
						System.out.println("Player2 ("+player2.getPieces()+") cannot make a move");
						player1Turn=true;
						continue;
					}
					else {
						System.out.println("Enter player2 ("+player2.getPieces()+")'s move : ");
					}
				}
				while(!move.inRange(x, y) || !(move.isAvailable(x, y))) {
					System.out.println("Enter a Valid Point");
					x=sc1.nextInt();
					y=sc1.nextInt();
					
				}				
				
				if(player1Turn) {										
					while(!move.canMove(x, y, player1.getPieces())) {
						System.out.println("Enter a point where a move can be made : ");					
						x=sc1.nextInt();
						y=sc1.nextInt();
					}					
				}
				else {									
					while(!move.canMove(x, y, player2.getPieces())) {								
						System.out.println("Enter a point where a move can be made : ");					
						x=sc1.nextInt();
						y=sc1.nextInt();
					}							
				}
				
				if(player1Turn) {
					move.makeMove(x, y, player1.getPieces());
					player1Turn=false;
				}
				else {
					move.makeMove(x, y, player2.getPieces());
					player1Turn=true;
				}
				
				move.print();
				
			}			
			Character ch=board.getWinner(player1.getPieces(), player2.getPieces());//evaluate the winner after the board is full
			
			if(ch==player1.getPieces()) {
				System.out.println("PLAYER1 ("+player1.getName()+") WINS!!!");
			}
			else if(ch==player2.getPieces()){
				System.out.println("PLAYER2 ("+player2.getName()+") WINS!!!");
			}
			else {
				System.out.println("ITS A DRAW...");
			}
			
}

private Player input(Integer num) {
		
		Scanner s=new Scanner(System.in);
					
		System.out.println("Enter the name of player"+num+"(Only one word) : ");
		String name=sc.next();
		
		System.out.println("Enter the symbol of player"+num+"(Only one character) : ");			
		String str=sc.next();
		char ch=str.charAt(0);						
		
		Player play=new Player(name, ch);
		return play;
		
	}


}
