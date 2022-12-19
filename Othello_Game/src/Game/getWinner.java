public Character getWinner(Character ch1, Character ch2) {//to evaluate the winner of the game when no further moves can be made
				
    Integer count1=0;
    Integer count2=0;
    for(Integer i=0;i<getBoardSize();i++) {
        for(Integer j=0;j<getBoardSize();j++) {
            if(getBoard()[i][j]==ch1) {
                count1++;
            }
        }
    }
    count2=((getBoardSize()*getBoardSize())-count1);
    
    System.out.println("player1("+ch1+")'s score is : "+count1);
    System.out.println("player2("+ch2+")'s score is : "+count2);
    
    if(count1>count2) {
        return ch1;
    }
    else if(count1<count2) {
        return ch2;
    }
    else {
        return '\0';
    }
    
}