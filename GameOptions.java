public class GameOptions {
//*********************************GAMEOBJECT CLASS- WorldArray Creation, Colors, initial variable type declaration***************************
    static String CLS = "\033[2J\033[1;1H";
    static String Red = "\033[31;1m";
    static String Green = "\033[32;1m";
    static String Yellow = "\033[33;1m";
    static String Blue = "\033[34;1m";
    static String Purple = "\033[35;1m";
    static String Cyan = "\033[36;1m";
    static String White = "\033[37;1m";
    static String Normal = "\033[0m";
    static String WhiteOnGreen = "\033[42;1m";
    static String WhiteOnYellow = "\033[43;1m";
    static String WhiteOnBlue = "\033[44;1m";
    static String WhiteOnRed = "\033[41;1m";
    static String WhiteOnCyan = "\033[46;1m";

    static char World[][] = new char[81][21]; //Creates World Array
    //Variables that can be accessed through Inheritence
    static char PlayerChoice;
    int HP, Attack, Armor;
    int Xpos, Ypos;
    char Avatar;
    //**************************************************Turn symbols to colors*************************************
    public void PrintWorld()
    {
        char T = ' ';
        for (int y=1; y<=20; y++)
        {
            for (int x=1; x<=80; x++)
            {
                if (World[x][y]==' ')
                    System.out.print(" ");
                else if (World[x][y] == '@')
                    System.out.print(WhiteOnGreen+ "@"+Normal);
                else if (World[x][y] == 'O')
                    System.out.print(WhiteOnBlue+ "O"+Normal);
                else if (World[x][y] == 'W' && PlayerChoice == 'r')
                    System.out.print(Cyan+"W"+Normal);
                else if (World[x][y] == 'W' && PlayerChoice == 'g')
                    System.out.print(Red+"W"+Normal);
                else if (World[x][y] == 'W' && PlayerChoice == 'h')
                    System.out.print(Yellow+"W"+Normal);
                else if (World[x][y] == 'W' && PlayerChoice == 's')
                    System.out.print(Green+"W"+Normal);
                else if (World[x][y] == 'P')
                    System.out.print(Cyan+ "P"+Normal);
                else if (World[x][y] == 'T')
                    System.out.print(Green+ "T"+Normal);
                else if (World[x][y] == 'S')
                    System.out.print(Red+ "S"+Normal);
                else if (World[x][y] == '+')
                    System.out.print(Purple+ "+"+Normal);
                else if (World[x][y] == '#')
                    System.out.print(Purple+ "#"+Normal);
                else if (World[x][y] == '$')
                    System.out.print(Purple+ "$"+Normal);
                else if (World[x][y] == 'G')
                    System.out.print(Green+ "G"+Normal);
                else if (World[x][y] == 'D')
                    System.out.print(Cyan+ "D"+Normal);
                else if (World[x][y] == 'E')
                    System.out.print(Red+ "E"+Normal);
                else
                    System.out.print(Normal+World[x][y]);
            }
            System.out.println();
        }
    }
}
