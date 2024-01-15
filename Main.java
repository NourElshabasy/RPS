import java.util.Scanner;


class Main 
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    rps.clearScreen();
    rps.mainMenu();
    String userChoice = "";
    int menuChoice = 0;
    
    rps rpsGame = new rps();

    while (true)
    {
      menuChoice = input.nextInt();
      if (menuChoice == 1)
      {
        rps.clearScreen();
        System.out.println("============ R P S ============");
        System.out.println("Enter Rock, Paper, or Scissors!\n");
        userChoice = input.next();
        userChoice = userChoice.toLowerCase();
        rpsGame.setUserInput(userChoice);
        rpsGame.setCPUinput();
        System.out.println("\nYou Chose : " + rpsGame.getUserInput());
        System.out.println("CPU Chose : " + rpsGame.getCPUinput());
        System.out.println(rpsGame.game());
        System.out.println("\nBack to Menu (1)");
        menuChoice = input.nextInt();
        while (menuChoice != 1)
        {
          System.out.println("\nErorr : Input must be 1");
          menuChoice = input.nextInt();
        }
        rps.clearScreen();
        rps.mainMenu();
      }
      else if (menuChoice == 2)
      {
        rps.clearScreen();
        System.out.println(rpsGame);
        System.out.println("\nBack to Menu (1)");
        menuChoice = input.nextInt();
        while (menuChoice != 1)
        {
          System.out.println("\nErorr : Input must be 1");
          menuChoice = input.nextInt();
        }
        rps.clearScreen();
        rps.mainMenu();
      }
      else if (menuChoice == 3)
        break;
      else
        System.out.println("Erorr : Input must be 1, 2, or 3");
    }
  }
}
