public class rps
{
  private static int wins = 0;
  private static int losses = 0;
  private static int draws = 0;
  private String userInput;
  private String cpuInput;

  public rps()
  {
    cpuInput = "";
    userInput = "";
  }

  public static void mainMenu()
  {
    System.out.println("============ R P S ============");
    System.out.println("> Start Game");
    System.out.println("> Stats");
    System.out.println("> Exit");
    System.out.println("");
    System.out.println("Input the number of an option above...");
  }

  public static void addWin()
  {
    wins ++;
  }

  public static void addLoss()
  {
    losses ++;
  }

  public static void addDraw()
  {
    draws ++;
  }

  public String getUserInput()
  {
    return userInput;
  }

  public void setUserInput(String newInput)
  {
    userInput = newInput;
  }

  public void setCPUinput()
  {
    int x = (int)(Math.random() * 3);
    if (x == 1)
      cpuInput = "rock";
    else if (x == 2)
      cpuInput = "paper";
    else
      cpuInput = "scissors";
  }
  
  public String getCPUinput()
  {
    return cpuInput;
  }

  public String game()
  {
    if ((userInput.equals("rock") && cpuInput.equals("paper")) || (userInput.equals("paper") && cpuInput.equals("scissors")) || userInput.equals("scissors") && cpuInput.equals("rock"))
    {
      rps.addLoss();
      return "\nCPU Wins!";
    }
    else if ((userInput.equals("rock") && cpuInput.equals("scissors")) || (userInput.equals("paper") && cpuInput.equals("rock")) || (userInput.equals("scissors") && cpuInput.equals("paper")))
    {
      rps.addWin();
      return "\nYou Win!";
    }
    else
    {
      rps.addDraw();
      return "\nDraw!";
    }
  }

  public static void clearScreen()
  {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  

  public String toString()
  {
    return "============ Wins & Losses ============\n" + "Wins : " + wins + "\nLosses : " + losses + "\nDraws : " + draws;
  }
}
