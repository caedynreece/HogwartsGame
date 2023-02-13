//****************************************PLAYER CLASS- Player Movements, Power Ups, Forbidden Forest, World Intialization with Player**************************
class Player extends GameOptions
{
    int HP, Attack, Armor;
    String Name;

    Player (char theAvatar, String theName)
    {
        Avatar = theAvatar;
        Name = theName;
        Xpos = 2;
        Ypos = 2;
        HP = 125;
        Armor = 10;
        Attack = 15;

//***************initalize the world into spaces**************
        for (int x=1; x<=80; x++)
        {
            for (int y=1; y<=20; y++)
                World[x][y] = ' ';
        }

//***************place player into world*****************
        World[Xpos][Ypos] = Avatar;

//*************Outline World*********************************
        for (int x=1; x<=80; x++)
        {
            World[x][1] = '^'; //top row
            World[x][20] = '_'; //bottom row
        }
        for (int y=1; y<=20; y++)
        {
            World[1][y] = '|'; //first column
            World[80][y] = '|'; //last column
        }

//*************************************Power Ups*************************************************************
        for (int i=0; i <=2; i++)
            World[(int)(Math.random()*76)+3][(int)(Math.random()*16)+3] = '+';
        for (int i=0; i<=4; i++)
            World[(int)(Math.random()*76)+3][(int)(Math.random()*16)+3] = '#';
        for (int i=0; i <=2; i++)
            World[(int)(Math.random()*76)+3][(int)(Math.random()*16)+3] = '$';

//***************************************Forbidden Forest*****************************************************
        int a = (int)(Math.random()*70)+4;
        int b = (int)(Math.random()*15)+2;

        if (World[a][b] == ' ')
        {
            World[a][b] = '@';
            World[a][b+1] = '@';
            World[a][b+2] = '@';
            World[a][b+3] = '@';
            World[a+1][b] = '@';
            World[a+1][b+1] = '@';
            World[a+1][b+2] = '@';
            World[a+1][b+3] = '@';
            World[a+2][b] = '@';
            World[a+2][b+1] = '@';
            World[a+2][b+2] = '@';
            World[a+2][b+3] = '@';
            World[a+3][b] = '@';
            World[a+3][b+1] = '@';
            World[a+3][b+2] = '@';
            World[a+3][b+3] = '@';
            World[a+4][b] = '@';
            World[a+4][b+1] = '@';
            World[a+4][b+2] = '@';
            World[a+4][b+3] = '@';
        }
//********************************The Black Lake****************************************
        int c = (int)(Math.random()*60)+5;
        int d = (int)(Math.random()*10)+3;

        if (World[c][d] == ' ')
        {
            World[c][d+1] = 'O';
            World[c][d+2] = 'O';
            World[c][d+3] = 'O';
            World[c+1][d] = 'O';
            World[c+1][d+1] = 'O';
            World[c+1][d+2] = 'O';
            World[c+1][d+3] = 'O';
            World[c+2][d] = 'O';
            World[c+2][d+1] = 'O';
            World[c+2][d+2] = 'O';
            World[c+2][d+3] = 'O';
            World[c+3][d] = 'O';
            World[c+3][d+1] = 'O';
            World[c+3][d+2] = 'O';
            World[c+3][d+3] = 'O';
            World[c+4][d] = 'O';
            World[c+4][d+1] = 'O';
            World[c+4][d+2] = 'O';
        }
    }

    //***********************Player Movements Plus Item Pick Up********************************
    public void MoveRight()
    {
        if (World[Xpos+1][Ypos] == ' ' || World[Xpos+1][Ypos] == '+' || World[Xpos+1][Ypos] == '#' || World[Xpos+1][Ypos] == '$')
        {
            if (World[Xpos+1][Ypos] == '+') //Attack + 15
            {
                Attack += 15;
            }
            if (World[Xpos+1][Ypos] == '#') //HP + 20
            {
                HP += 20;
            }
            if (World[Xpos+1][Ypos] == '$') //Armor + 5
            {
                Armor += 5;
            }
            World[Xpos][Ypos] = ' ';
            Xpos++;
            World[Xpos][Ypos] = Avatar;
        }
    }
    public void MoveLeft()
    {
        if (World[Xpos-1][Ypos] == ' ' || World[Xpos-1][Ypos] == '+' || World[Xpos-1][Ypos] == '#' || World[Xpos-1][Ypos] == '$')
        {
            if (World[Xpos-1][Ypos] == '+') //Attack + 15
            {
                Attack += 15;
            }
            if (World[Xpos-1][Ypos] == '#') //HP + 20
            {
                HP += 20;
            }
            if (World[Xpos-1][Ypos] == '$') //Armor + 5
            {
                Armor += 5;
            }
            World[Xpos][Ypos] = ' ';
            Xpos--;
            World[Xpos][Ypos] = Avatar;
        }
    }
    public void MoveUp()
    {
        if (World[Xpos][Ypos -1] == ' ' || World[Xpos][Ypos-1] == '+' || World[Xpos][Ypos-1] == '#' || World[Xpos][Ypos-1] == '$')
        {
            if (World[Xpos][Ypos-1] == '+') //Attack + 15
            {
                Attack += 15;
            }
            if (World[Xpos][Ypos-1] == '#')// HP + 20
            {
                HP += 20;
            }
            if (World[Xpos][Ypos-1] == '$')// Armor + 5
            {
                Armor += 5;
            }
            World[Xpos][Ypos] = ' ';
            Ypos--;
            World[Xpos][Ypos] = Avatar;
        }
    }

    public void MoveDown()
    {
        if (World[Xpos][Ypos+1] == ' ' || World[Xpos][Ypos+1] == '+' || World[Xpos][Ypos+1] == '#' || World[Xpos][Ypos+1] == '$')
        {
            if (World[Xpos][Ypos+1] == '+') //Attack + 15
            {
                Attack += 15;
            }
            if (World[Xpos][Ypos+1] == '#') //HP + 20
            {
                HP += 20;
            }
            if (World[Xpos][Ypos+1] == '$') //Armor + 5
            {
                Armor += 5;
            }
            World[Xpos][Ypos] = ' ';
            Ypos++;
            World[Xpos][Ypos] = Avatar;
        }
    }
}