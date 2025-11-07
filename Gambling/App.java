import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner readinput = new Scanner(System.in);
        String input = "";
        System.out.println("Press 'enter' to gamble or type 'im a loser and want to stop gambling' to quit :3");
        while (!input.equalsIgnoreCase("im a loser and want to stop gambling")) {
            int Number1 = (int)(Math.random() * 10); int Number2 = (int)(Math.random() * 10); int Number3 = (int)(Math.random() * 10); // 0 to 9

            String gambleOutput = "|" + Number1 + "|" + Number2 + "|" + Number3 + "|";
            
            String gamblingReward = "you lost try again :3";

            if (gambleOutput.equals("|7|7|7|")) {
                gamblingReward = "YOU WON A BRAND NEW 2007 HONDA CIVIC :3";
            }

            if (gambleOutput.equals("|1|1|1|")) {
                System.out.println("YOU WON 10 ZWD :3");
            }

            input = readinput.nextLine();

            if (!input.equalsIgnoreCase("im a loser and want to stop gambling")) {
                System.out.println(gambleOutput); System.out.println(gamblingReward);
            }
        }

        System.out.println("fuck you bitch :3");
        readinput.close();
    }
}