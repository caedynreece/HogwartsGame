import java.util.Scanner;

public class Display {
    static String CLS = "\033[2J\033[1;1H";
    static String Red = "\033[31;1m";
    static String Green = "\033[32;1m";
    static String Yellow = "\033[33;1m";
    static String Purple = "\033[35;1m";
    static String Cyan = "\033[36;1m";
    static String White = "\033[37;1m";


    static String Blue = "\033[34;1m";
    static String Normal = "\033[0m";
    static char PlayerChoice;
    static String PC = String.valueOf(PlayerChoice);

    //******************************************Introduction/Menu Screen****************************************************************
    void DrawIntroScreen()
    {
        Scanner in = new Scanner(System.in);
        System.out.print(CLS);
        System.out.println(Yellow+ "__________________________________________________________________________"+Normal);
        System.out.println(Yellow +" __    __     _                            _          _   _               " + Normal);
        System.out.println(Yellow +"/ / /\\ \\ \\___| | ___ ___  _ __ ___   ___  | |_ ___   | |_| |__   ___      " + Normal);
        System.out.println(Yellow +"\\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | __| '_ \\ / _ \\     \tYou've just been recruited by" + Normal);
        System.out.println(Yellow +" \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | |_| | | |  __/     \tthe Ministry of Magic to help" + Normal);
        System.out.println(Yellow +"  \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/   \\__|_| |_|\\___|     \tdefeat You-Know-Who." + Normal);
        System.out.println(Yellow +"                                               								" + Normal);
        System.out.println(Yellow +" __    __ _                  _ _               __    __           _     _ \tDefeat the Dark Wizards and Creatures" + Normal);
        System.out.println(Yellow +"/ / /\\ \\ (_)______ _ _ __ __| (_)_ __   __ _  / / /\\ \\ \\___  _ __| | __| |\tbefore they can defeat you!" + Normal);
        System.out.println(Yellow +"\\ \\/  \\/ / |_  / _` | '__/ _` | | '_ \\ / _` | \\ \\/  \\/ / _ \\| '__| |/ _` |" + Normal);
        System.out.println(Yellow +" \\  /\\  /| |/ / (_| | | | (_| | | | | | (_| |  \\  /\\  / (_) | |  | | (_| |" + Normal);
        System.out.println(Yellow +"  \\/  \\/ |_/___\\__,_|_|  \\__,_|_|_| |_|\\__, |   \\/  \\/ \\___/|_|  |_|\\__,_|" + Normal);
        System.out.println(Yellow +"                               		|___/                              " + Normal);
        System.out.println(Yellow+ "__________________________________________________________________________"+ Normal);
        System.out.println("\n");
        System.out.println(Red+"Dark Creatures and Wizards: "+Normal + Yellow+ "\t\t\t\t\tPlayer Status: "+Normal);
        System.out.println(Red+"----------------------------"+Normal + Yellow+ "\t\t\t\t\t---------------"+Normal);
        System.out.println(Cyan+"Pixies (P): \t\t10 HP, 2 Attack, 0 Armor "+Normal+Yellow+"\t\tWitch/Wizard (W)"+Normal);
        System.out.println(Red+"Skrewts (S): \t\t20 HP, 5 Attack, 5 Armor"+Normal+Yellow+"\t\t125 HP"+Normal);
        System.out.println(Green+"Trolls (T): \t\t30 HP, 7 Attack, 10 Armor"+Normal+Yellow+"\t\t10 Armor"+Normal);
        System.out.println(Green+"Giants (G): \t\t40 HP, 10 Attack, 15 Armor"+Normal+Yellow+"\t\t15 Attack"+Normal);
        System.out.println(Cyan+"Dementors (D):\t\t75 HP, 15 Attack, 10 Armor"+Normal);
        System.out.println(Red+"Death Eaters (E): \t125 HP, 15 Attack, 15 Armor"+Normal);
        System.out.println(Purple+"\t\t\t\t\t\t\t\tPotions: "+Normal);
        System.out.println(Purple+"\t\t\t\t\t\t\t\t-------"+Normal);
        System.out.println(Purple+"\t\t\t\t\t\t\t\tProtego Shield ($): + 5 Armor"+Normal);
        System.out.println(Purple+"\t\t\t\t\t\t\t\tAttack Charm (+): + 15 Attack"+Normal);
        System.out.println(Purple+"\t\t\t\t\t\t\t\tHealth Potion (#): + 20 HP"+Normal);
        System.out.println("Press <ENTER> to begin...");
        in.nextLine();
        System.out.print(CLS);
    }

    //*****************************************Player Win Screen*************************************************************************
    void DrawWinScreen()
    {
        Scanner in = new Scanner(System.in);
        System.out.println(CLS);
        System.out.println(Red+"	____    ____  ______    __    __     ____    __    ____  __  .__   __.  __  "+Normal);
        System.out.println(Red+"	\\   \\  /   / /  __  \\  |  |  |  |    \\   \\  /  \\  /   / |  | |  \\ |  | |  | "+Normal);
        System.out.println(Cyan+"	 \\   \\/   / |  |  |  | |  |  |  |     \\   \\/    \\/   /  |  | |   \\|  | |  | "+Normal);
        System.out.println(Green+"	  \\_    _/  |  |  |  | |  |  |  |      \\            /   |  | |  . `  | |  | "+Normal);
        System.out.println(Green+"	    |  |    |  `--'  | |  `--'  |       \\    /\\    /    |  | |  |\\   | |__| "+Normal);
        System.out.println(Yellow+"	    |__|     \\______/   \\______/         \\__/  \\__/     |__| |__| \\__| (__) "+Normal);


        System.out.println(Yellow+"\n   _____ "+Normal);
        System.out.println(Yellow+"  /     \\"+Normal);
        System.out.println(Yellow+"/- (*) |*)\\"+Normal);
        System.out.println(Yellow+"|/\\.  _>/\\|"+Normal);
        System.out.println(Yellow+"    \\__/    |\\ \t\tCongratulations on defeating the Dark Creatures and Wizards!"+Normal);
        System.out.println(Yellow+"   _| |_   \\-/  \tThe Ministry of Magic is incredibly grateful for your hardwork."+Normal);
        System.out.println(Yellow+"  /|\\__|\\  //  \t\tYou-Know-Who is still gathering his forces. I hope we can count on you"+Normal);
        System.out.println(Yellow+" |/|   |\\\\//   \t\tto help us in the future!"+Normal);
        System.out.println(Yellow+" |||   | ~'"+Normal);
        System.out.println(Yellow+" ||| __|"+Normal);
        System.out.println(Yellow+" /_\\| ||"+Normal);
        System.out.println(Yellow+" \\_/| ||"+Normal);
        System.out.println(Yellow+"   |7 |7"+Normal);
        System.out.println(Yellow+"   || ||"+Normal);
        System.out.println(Yellow+"   || ||"+Normal);
        System.out.println(Yellow+"   /\\ \\ \\  fog"+Normal);
        System.out.println(Yellow+"   ^^^^ ^^^"+Normal);
    }
    //*****************************************Player Lose Screen************************************************************************
    void DrawLoseScreen()
    {
        Scanner in = new Scanner(System.in);
        System.out.println(CLS);
        System.out.println(Red+"  __   __            _           _   "+Normal);
        System.out.println(Red+"  \\ \\ / /__  _   _  | | ___  ___| |_ "+Normal);
        System.out.println(Red+"   \\ V / _ \\| | | | | |/ _ \\/ __| __|"+Normal);
        System.out.println(Red+"    | | (_) | |_| | | | (_) \\__ \\ |_ "+Normal);
        System.out.println(Red+"    |_|\\___/ \\__,_| |_|\\___/|___/\\__|"+Normal);

        System.out.println(Yellow+ "\n                  ,____ "+Normal);
        System.out.println(Yellow+ "                   |---.\\"+Normal);
        System.out.println(Yellow+ "           ___     |    `"+Normal);
        System.out.println(Yellow+ "          / .-\\  ./=) \t\tOh no! It looks like You-Know-Who and his forces "+ Normal);
        System.out.println(Yellow+ "         |  |\"|_/\\/| \t\twere ready for you! Continue working on you skills "+Normal);
        System.out.println(Yellow+ "         ;  |-;| /_| \t\tso you can return to defeat the Dark Lord!"+Normal);
        System.out.println(Yellow+ "        / \\_| |/ \\ |"+Normal);
        System.out.println(Yellow+ "       /      \\/\\( |"+Normal);
        System.out.println(Yellow+ "       |   /  |` ) |"+Normal);
        System.out.println(Yellow+ "       /   \\ _/    |"+Normal);
        System.out.println(Yellow+ "      /--._/  \\    |"+Normal);
        System.out.println(Yellow+ "      `/|)    |    /"+Normal);
        System.out.println(Yellow+ "        /     |   |"+Normal);
        System.out.println(Yellow+ "      .'      |   |"+Normal);
        System.out.println(Yellow+ "jgs  /         \\  |"+Normal);
        System.out.println(Yellow+ "    (_.-.__.__./  /"+Normal);
    }
}


