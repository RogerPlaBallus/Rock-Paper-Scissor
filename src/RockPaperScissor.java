import java.util.Random;

//backend
public class RockPaperScissor {
    //all of the choices that a computer can choose
    private static final String[] computerChoices = {"Rock", "Paper", "Scissor"};

    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    //store the computer choice so we can retrieve the value and display it on the front end
    private String computerChoice;

    //store the scores so that we can retrieve the values and display it to the front
    private int computerScore, playerScore;


    //use to generate a random number to randomly choose an option
    private Random random;

    //constructor - to initialize random object
    public RockPaperScissor() {
        random = new Random();
    }

    //call this method to begin playing
    //playerChoice - choice made by the player
    //this method will return the result of the game (computer or player win, or draw)
    public String playRockPaperScissor(String playerChoice) {
        //generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        //will contain the returning message indicating the result
        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock")) {
            if(playerChoice.equals("Paper")) {
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Scissor")) {
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }else if (computerChoice.equals("Paper")) {
            if(playerChoice.equals("Scissors")) {
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Rock")) {
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }else {
            if(playerChoice.equals("Rock")) {
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Paper")){
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }
        return result;
    }
}
