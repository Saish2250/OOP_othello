package othello;
	public class Player{
		
		private String name;
		private Character pieces;

		public Player(String name, Character pieces){
			
			this.name=name;		
			this.pieces=pieces;
			
		}
		
		public void setName(String name) {
			
			this.name=name;
			
		}
		
		public String getName() {
			
			return this.name;
			
		}
		
		public void setPieces(Character pieces) {
			
			this.pieces=pieces;
			
		}
		
		public char getPieces() {
			
			return this.pieces;
			
		}
		
	}