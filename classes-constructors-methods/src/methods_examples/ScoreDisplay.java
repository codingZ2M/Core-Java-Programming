package methods_examples;

public class ScoreDisplay {

	public static void main(String[] args) {
		
		 System.out.println("Score Position:");
		 
		  int highScorePosition = CalculateScore.calculateHighScorePosition(1500);  
		  CalculateScore.displayHighScorePosition("Tim", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(900);
	        CalculateScore.displayHighScorePosition("Bob", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(400);
	        CalculateScore.displayHighScorePosition("Percy", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(50);
	        CalculateScore.displayHighScorePosition("Gilbert", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(1000);
	        CalculateScore.displayHighScorePosition("Louise", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(500);
	        CalculateScore.displayHighScorePosition("Carol", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(100);
	        CalculateScore.displayHighScorePosition("Frank", highScorePosition);
	        
	        
	        System.out.println("Final Score:");
	        boolean gameOver = true;
	        
	        int score = 9000;
	        int levelCompleted = 5;
	        int bonus = 100;
	        CalculateScore.calculateScore(gameOver, score, levelCompleted, bonus, "Tim");
	        
	        score = 10000;
	        levelCompleted = 8;
	        bonus = 200;
	        CalculateScore.calculateScore(gameOver, score, levelCompleted, bonus, "Bob");
	}
}
