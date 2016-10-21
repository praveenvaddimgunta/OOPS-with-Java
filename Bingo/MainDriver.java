/*

Problem Description
-------------------
there should be no duplicate cards

The standard Bingo card is a 5 x 5 table containing integers between 1 and 75, with a free square at the center that contains 0. The first column in the table contains only integers between 1 and 15, the second column numbers are all between 16 and 30, the third are 31 to 45, the fourth 46-60, and the fifth 61-75. There are no duplicate numbers on a Bingo card.

Before the game starts, each player is given a Bingo card. The game also has a "caller", who issues a list of all the integers between 1 and 75 in random order. As each number is called, players mark the appropriate squares on their cards. The middle square, the free square, is always marked.

The winner of the game is the first person whose Bingo card has one of the following winning conditions:

 - All five squares in a column are marked
 - All five squares in a row are marked
 - All the squares in either of the two diagonals are marked
 - The four corner squares are all marked

Programming Instructions:
-------------------------

Implmement the following methods in the class Bingo.

----- public void write(String outputFile) -----

	Implement a method public void write(String outputFile, int cardCount). The function should generate 'cardCount' number of Bingo cards along with random numbers between 1 and 75. The follwoing example is for cardCount 2.

	 3 18 34 60 75
	12 26 38 47 73
	 2 23  0 49 66
	15 21 43 58 67
	 6 22 31 56 62

 	4 16 35 51 74
	15 27 39 48 73
	 3 24  0 50 63
	12 22 44 59 64
	 1 23 32 57 61	
	
	59 69 7 39 32 44 27 53 21 25 28 9 17 61 12 37 5 55 [et cetera, until all numbers have been listed]

	The first five lines of the output represent the Bingo card. Each line is a row of five integers separated by spaces. The third number in the third line, the free square, is always contain the number 0.

	Second card has the same format and begins after one blank line. Last line will come seventy five integers, all in one line, in random order.

	The first column in the Bingo card configuration must contain only integers between 1 and 15; the second column numbers are all between 16 and 30, the third are 31 to 45, the fourth 46-60, and the fifth 61-75. There are no duplicate numbers on a Bingo card.

	Write this data into the outputFile given as an arugment to the method.

----- public void read(String inputFile) -----

	Implement a method  that reads an input file created by the above method write(). You will store a Bingo card configuration (the first five lines) in a two-dimensional array of integers, called card. A list of 75 integers should be stored in the array stream.

	Implement a method public int playGame() that returns the first integer from the stream array that gives you the earliest possible winning condition, i.e, the last number called before you would declare Bingo. The winning conditions are defined in the Overview.

*/

import java.io.*;
import java.util.*;

public class MainDriver
{
   public static void main (String[] args) throws Exception
   {
		Bingo game = new Bingo();

		game.write("input.txt", 6);	// The second parameter is the cardCount which may vary from test case to test case.
		game.read("input.txt");
		int x[] = game.playGame();
		for(int i=0;i<x.length;i++){
			System.out.println("the winning number is " + x);
		}
	}
}

class Bingo {

	// Bingo obj = new Bingo();

	public void write(String file) throws Exception{
    	FileWriter fWriter = new FileWriter (file);
    	PrintWriter pWriter = new PrintWriter (fWriter);
    	int[][] cards = new int[5][5];
    	Random rand = new Random();
    	for (int i=0; i<5; i++) {
    		for(int j=0; j<5; j++) {
    			int randomNum = rand.nextInt((75 - 1) + 1) + 1;
    			cards[i][j]=randomNum;
    			if(i==2 && j==2) {
    				cards[i][j]=0;
    			}
    			System.out.print(cards[i][j]+" ");
    			pWriter.print(cards[i][j]+" ");
    			if(j==4){
    				pWriter.println();
    			}
    		}
    	}
    	pWriter.close();
  	}

  	public void write(String file, int cardsCount) throws Exception{
  		FileWriter fWriter = new FileWriter (file);
    	PrintWriter pWriter = new PrintWriter (fWriter);

  	for(int a=0; a<cardsCount; a++){
    	int[][] cards = new int[5][5];
    	Random rand = new Random();
    	for (int i=0; i<5; i++) {
    		for(int j=0; j<5; j++) {
    			int randomNum = rand.nextInt((75 - 1) + 1) + 1;
    			cards[i][j]=randomNum;
    			if(i==2 && j==2) {
    				cards[i][j]=0;
    			}
    			//System.out.print(cards[i][j]+" ");
    			pWriter.print(cards[i][j]+" ");
    			if(j==4){
    				pWriter.println();
    			}
    		}
    	}
    	pWriter.println();
    	}pWriter.close();
  	}

    public void read(String file)throws Exception {
    	File output = new File(file);
        Scanner sc = new Scanner (output);
    	while (sc.hasNextLine()){
      		String line = sc.nextLine();
      		System.out.println (line);
      		//StringTokenizer st = new StringTokenizer(line,"\n");
 	   	}
    	sc.close();
    }

    public int caller() {
    	Random rand = new Random();
    	int randomNum = rand.nextInt((75 - 1) + 1) + 1;
    	//System.out.println(randomNum+"  ");
    	return randomNum;
    }

     public int[] playGame() {
     	Bingo obj = new Bingo();
    	int size = 0;
    	int[] winners = new int[size];
    	if(winners.length==size)
    		size = size*2;

    	return winners;
    }	
}
