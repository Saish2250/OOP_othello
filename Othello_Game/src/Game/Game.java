package Game;

import java.util.Scanner;




public class Game {
private Players player1,player2;
private Board board;
private Scanner s;
private Scanner s2;

public void startGame() {
			
			s2 = new Scanner(System.in);
			
			player1=takeInput(1);
			player2=takeInput(2);
			Integer boardSize=8;


			
			board=new Board(boardSize,player1.getSymbol(), player2.getSymbol());

}

/**private Player takeInput(Integer num) {
		
		Scanner s=new Scanner(System.in);
					
		System.out.println("Enter the name of player"+num+"(one word) : ");
		String name=s.next();
		
		System.out.println("Enter the symbol of player"+num+"(one character) : ");			
		String str=s.next();
		char ch=str.charAt(0);						
		
		Player play=new Player(name, ch);
		return play;
		
	}**/


}
