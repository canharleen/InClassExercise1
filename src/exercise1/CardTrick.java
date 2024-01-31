package exercise1;


import java.util.Random;
import java.util.Scanner;



/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Harleen Kaur
 * @author Jan 31, 2024
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(13)+1);
            // 
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value for card");
        int userValue=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the suit");
        String userSuit = sc.nextLine();
        sc.close();
        
        Card userCard = new Card();
        userCard.setSuit(userSuit);
        userCard.setValue(userValue);
        System.out.println(userCard);
        
        for (Card hand1 : hand) {
            
            System.out.println(hand1);
            if (userCard.equals(hand1)) {
                printInfo();  
            }
        }
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Harleen Kaur Jan 2024
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Harleen, but you can call me Harleen");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Get a good job in IT sector");
        System.out.println("Pass the course with good grades");
	System.out.println();	

        System.out.println("My hobbies:");
       
        System.out.println("Listening to songs");
        System.out.println("Going for a walk");
        System.out.println("Watching movies");

        System.out.println();
        
    
    }

}
