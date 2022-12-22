import Game.Game;
import Game.Rule;
import java.util.*;

public class ClientApp {

	public static void main(String[] args) {
		int choice;
		// TODO Auto-generated method stub

		System.out.println("  __________   __________   __________   __________   __           __           __________");
		System.out.println(" |   ____   | |___    ___| |  |    |  | |  ________| |  |         |  |         |   ____   |");
		System.out.println(" |  |    |  |     |  |     |  |____|  | |  |____     |  |         |  |         |  |    |  |");
		System.out.println(" |  |    |  |     |  |     |   ____   | |   ____|    |  |         |  |         |  |    |  |");
		System.out.println(" |  |____|  |     |  |     |  |    |  | |  |_______  |  |_______  |  |_______  |  |____|  |");
		System.out.println(" |__________|     |__|     |__|    |__| |__________| |__________| |__________| |__________|");
		System.out.println(" __________________________________________________________________________________________\n");

		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Welcome to the Othello game! Would you like to play or read the rules?");
			System.out.println("1. Play");
			System.out.println("2. Read rules");
			System.out.println("0. Exit");
			while (true) {
				try {
					choice = input.nextInt();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Invalid value re-enter");
					input.next();
				}
			}

			switch (choice) {
			case 1:
				Game g1 = new Game();
				g1.startGame();
				break;
			case 2: {
				Rule r1 = new Rule();
				r1.readRules();
				break;
			}

			default:
				if (choice != 0) {
					System.out.println("If you want to exit enter 0");
					break;
				}
			}
		} while (choice != 0);
		System.out.println("Exited Successfully");
	}
}
