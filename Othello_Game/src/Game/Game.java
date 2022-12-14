package Game;

import java.util.Scanner;


public class Game {
private Player player1,player2;
private Board board;
private Move move;
private Scanner sc;
private Scanner sc1;

Integer x,y;
	

public void startGame() {
			
			sc1 = new Scanner(System.in);
			
			player1=input1(1);
			player2=input2(2);
			final Integer boardSize=8;


			
			board=new Board(boardSize,player1.getPieces(), player2.getPieces());
			move=new Move(boardSize,player1.getPieces(),player2.getPieces());
			Clear clscr=new Clear();
			System.out.println("Start Playing The Othello");
			move.print();
			
			boolean player1Turn=true;
		
			while(!move.isFull()) {
				Clear.clearcon();
				if(player1Turn) {
					if(move.noMovesAvailable(player1.getPieces())) {						
						System.out.println("Player1 ("+player1.getPieces()+") cannot make a move");	
						player1Turn=false;
						continue;
					}else if(move.noMovesAvailable(player2.getPieces()) && move.noMovesAvailable(player1.getPieces())) {
						gameOver();
					}
					else {
						System.out.println("Enter player1("+player1.getPieces()+")'s move : ");
					}
				}else {
					if(move.noMovesAvailable(player2.getPieces())) {
						System.out.println("Player2 ("+player2.getPieces()+") cannot make a move");
						player1Turn=true;
						continue;
					}else if(move.noMovesAvailable(player2.getPieces()) && move.noMovesAvailable(player1.getPieces())) {
						gameOver();
					}
					else {
						System.out.println("Enter player2 ("+player2.getPieces()+")'s move : ");
					}
				}
				
				
				inputpoints();
				
				while(!move.isValid(x, y) || !(move.isAvailable(x, y))) {
					System.out.println("Enter a Valid Point");

					inputpoints();					
				}				
				
				if(player1Turn) {										
					while(!move.possibleMove(x, y, player1.getPieces())) {
						System.out.println("Enter a point where a move can be made : ");					
						inputpoints();
						
					}					
				}
				else {									
					while(!move.possibleMove(x, y, player2.getPieces())) {								
						System.out.println("Enter a point where a move can be made : ");					

						inputpoints();					}							
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
			gameOver();
			
}
public void gameOver() {
	Character ch=move.getWinner(player1.getPieces(), player2.getPieces());
	
	
		try {
			if (ch == player1.getPieces()) {
				System.out.println("-------PLAYER1 -->" + player1.getName() + " WINS!!!------");
			} else if (ch == player2.getPieces()) {
				System.out.println("-------PLAYER2 -->" + player2.getName() + " WINS!!!------");
			} else {
				System.out.println("-------ITS A DRAW!!!-------");
			} 
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("------ITS A DRAW!!!---------");
		}
}
	

public void inputpoints() {
	while(true) {
		try {
			x = sc1.nextInt();
			y = sc1.nextInt();
			break;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Invalid position re-enter points");
			sc1.next();
		}
	}
}
private Player input1(Integer num) {
		
		sc=new Scanner(System.in);
					
		System.out.println("Enter the name of player"+num+"(Only one word) : ");
		String name=sc.next();
		
		
		Character ch='W';					
		
		Player play=new Player(name, ch);
		return play;
		
}


private Player input2(Integer num) {
	
	sc=new Scanner(System.in);
				
	System.out.println("Enter the name of player"+num+"(Only one word) : ");
	String name=sc.next();
	
	
	Character ch='B';					
	
	Player play1=new Player(name, ch);
	return play1;
	
}


}