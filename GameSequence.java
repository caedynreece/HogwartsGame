import java.utig
l.*;

public class GameSequence {
    //clears the screen
    static String CLS = "\033[2J\033[1;1H";
    static String Red = "\033[31;1m";
    static String Green = "\033[32;1m";
    static String Yellow = "\033[33;1m";
    static String Blue = "\033[34;1m";
    static String Purple = "\033[35;1m";
    static String Cyan = "\033[36;1m";
    static String White = "\033[37;1m";
    static String Normal = "\033[0m";


    public static void main(String[] args) {
        Display screens = new Display();
        screens.DrawIntroScreen();
        Scanner in = new Scanner(System.in);
        //Player Created
        Player P = new Player('W', "Wizard");
        //ask user for player choice
        P.PlayerChoice = 'r'; //hard coded value for testing
        ArrayList<Enemy> Enemies = new ArrayList<Enemy>();
        //2 Death Eaters
        for (int i = 0; i <= 1; i++)
            Enemies.add(new Enemy("Death Eater"));
        //2 Dementors
        for (int i = 0; i <= 1; i++)
            Enemies.add(new Enemy("Dementor"));
        //3 Giants
        for (int i = 0; i <= 2; i++)
            Enemies.add(new Enemy("Giant"));
        //2 Trolls
        for (int i = 0; i <= 1; i++)
            Enemies.add(new Enemy("Troll"));
        //1 Blast Ended Skrewts
        Enemies.add(new Enemy("Blast Ended Skrewt"));
        //2 Pixies
        for (int i = 0; i <= 1; i++)
            Enemies.add(new Enemy("Pixie"));
        String Choice = "";
        String Message = "";
//*************************************************Choose Hogwarts House*****************************************************************
        System.out.println("Choose Your Hogwarts House: ");
        System.out.println(Red + "\n\tGryffindor (g)" + Cyan + "\n\tRavenclaw (r)" + Green + "\n\tSlytherin (s)" + Yellow + "\n\tHufflepuff (h)" + Normal);
        System.out.println("            _            _.,----,	");
        System.out.println(" __  _.-._ / '-.        -  ,._  \\) 	");
        System.out.println("|  `-)_   '-.   \\       / < _ )/\" }	");
        System.out.println("/__    '-.   \\   '-, ___(c-(6)=(6)");
        System.out.println(" , `'.    `._ '.  _,'   >\\    \"  )");
        System.out.println(" :;;,,'-._   '---' (  ( \"/`. -='/");
        System.out.println(";:;;:;;,  '..__    ,`-.`)'- '--'");
        System.out.println(";';:;;;;;'-._ /'._|   Y/   _/' \\");
        System.out.println("      '''\"._ F    |  _/ _.'._   `\\");
        System.out.println("             L    \\   \\/     '._  \\");
        System.out.println("      .-,-,_ |     `.  `'---,  \\_ _|");
        System.out.println("      //    'L    /  \\,   (\"--',=`)7");
        System.out.println("     | `._       : _,  \\  /'`-._L,_'-._");
        System.out.println("     '--' '-.\\__/ _L   .`'         './/");
        System.out.println("                 [ (  /");
        System.out.println("                  ) `{");
        System.out.println("	snd        \\__)");
        P.PlayerChoice = in.next().charAt(0);

//************************************************Game Loop******************************************
        while (!Choice.equals("q") && P.HP > 0 && Enemies.size() > 0) {
            System.out.print(CLS); //clear the screen each time
            P.PrintWorld();
            System.out.println(P.Name + " HP: " + P.HP + " Armor: " + P.Armor + " Attack: " + P.Attack + " Message: " + Message);
            Message = "";
            System.out.println("Move: asdw Quit: q Enter a Command: ");
            Choice = in.nextLine();

//*******************************Player Moves via Keyboard input***************************************
            if (Choice.equals("d")) {
                P.MoveRight();
            }
            if (Choice.equals("a")) {
                P.MoveLeft();
            }
            if (Choice.equals("s")) {
                P.MoveDown();
            }
            if (Choice.equals("w")) {
                P.MoveUp();
            }

//*************************Player Attacks and Enemy Attacks with Armor****************************************************
            for (int i = 0; i < Enemies.size(); i++) {
                if ((Enemies.get(i).Ypos == P.Ypos && (Enemies.get(i).Xpos == P.Xpos + 1)) || // player is to the left
                        (Enemies.get(i).Ypos == P.Ypos && (Enemies.get(i).Xpos == P.Xpos - 1)) ||  // player is to the right
                        (Enemies.get(i).Xpos == P.Xpos && (Enemies.get(i).Ypos == P.Ypos + 1)) ||  // player is above
                        (Enemies.get(i).Xpos == P.Xpos && (Enemies.get(i).Ypos == P.Ypos - 1)))    // player is below
                {
                    Message += Enemies.get(i).Type + " attacks!";
                    Enemies.get(i).HP -= (100 * P.Attack) / (100 + Enemies.get(i).Armor); // Player attacks Enemy w/ Armor
                    P.HP -= (100 * Enemies.get(i).Attack) / (100 + P.Armor);    // Enemy attacks Player w/ Armor

                    if (Enemies.get(i).HP <= 0)    // Enemy dies
                    {
                        Message += Enemies.get(i).Type + " dies!";
                        P.World[Enemies.get(i).Xpos][Enemies.get(i).Ypos] = ' ';
                        Enemies.remove(i);
                    }
                }
            }
//***************Move Enemies towards player***********************************************
// Step through Enemy ArrayList and move towards the player
//Move Enemy within Range
            for (int i = 0; i < Enemies.size(); i++) {
                if (Math.abs(Enemies.get(i).Xpos - P.Xpos) <= Enemies.get(i).Range &&
                        Math.abs(Enemies.get(i).Ypos - P.Ypos) <= Enemies.get(i).Range) {
                    if (Enemies.get(i).Xpos > P.Xpos)
                        Enemies.get(i).MoveLeft();
                    else
                        Enemies.get(i).MoveRight();
                    if (Enemies.get(i).Ypos > P.Ypos)
                        Enemies.get(i).MoveUp();
                    else
                        Enemies.get(i).MoveDown();
                } else {
                    int R = (int) (Math.random() * 3) + 1;
                    if (R == 1) Enemies.get(i).MoveUp();
                    if (R == 2) Enemies.get(i).MoveDown();
                    if (R == 3) Enemies.get(i).MoveLeft();
                    else Enemies.get(i).MoveRight();
                }
            }
        }
//**************************************End of Game Loop**************************************************************
        if (P.HP <= 0)
            screens.DrawLoseScreen();
        if (Enemies.size() == 0)
            screens.DrawWinScreen();
        else
            System.out.println("Thanks for playing!");
    }
}







