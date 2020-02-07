/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author gubotdev
 */
public class Dealer {
    private Player[] myPlayers;
    private Deck myDeck = new Deck();
    private Hand dealerHand = new Hand();
    private Scanner scan = new Scanner(System.in);
    public Dealer(int numOfPlayers){
        
    }
   
    public void dealOutOpeningHand(){
        for(int i = 0; i < 2; i++){
            for(Player currPlayer : myPlayers){
                currPlayer.getMyHand().addCard(myDeck.dealCard());
            }
            dealerHand.addCard(myDeck.dealCard());
            
            }
        }
    }
    
    public void takePlayerTurns(){
for(Player currplayer : myPlayers){
while(currPlayer.getMyHand().getNumOfCards() < 5 &&
        currPlayer.getMyHand().getScore() < 21){
System.out.println(currPlayer.getName() + "'S Hand");
currPlayer.getMyHand().printHand();
System.out.println("Wanna Hit? (y/n)");
char opt = scan.next().charAt(0);
if(opt=='y'){
currPlayer.getMyHand().addCard(myDeck.dealCard());

}

}
    }
    public void playOutDealerHand(){
while(dealerHand.getScore() < 16){
dealerHand.addCard(myDeck.dealCard());
}
dealerHand.printHand();
        
    }
    public void declareWinners(){
        
   
    
    
    }
    
    
    
    
    
    
    private void initMyPlayers(int num){
        myPlayers = new Player[numOfPlayers];
        for(int i = 0; i < myPlayers.length; i++){
            System.out.println("Player" + (i+1) + "whats your name  ");
            String name = scan.next();
            if(name.equals("")){
                myPlayers[i] = new Player(i+1);
            }else{
                myPlayers[i] = new Player(name);
            }
            
        }
    }
}
