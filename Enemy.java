//***********************************************ENEMY CLASS- Enemy type creation, enemy movements*********************************
class Enemy extends GameOptions
{
    int HP, Attack, Armor, Range;
    String Type;
    //*************************************Create Specific Enemies*****************************************
    Enemy (String theType)
    {
        Type = theType;
        Xpos = (int)(Math.random()*76)+3;
        Ypos = (int)(Math.random()*16)+3;
        if (Type.equals("Pixie"))
        {
            HP = 10;
            Attack = 2;
            Armor = 0;
            Range = 4;
            Avatar = 'P';
        }
        if (Type.equals("Blast Ended Skrewt"))
        {
            HP = 20;
            Attack = 5;
            Armor = 5;
            Range = 2;
            Avatar = 'S';
        }
        if (Type.equals("Troll"))
        {
            HP = 25;
            Attack = 7;
            Armor = 10;
            Range = 3;
            Avatar = 'T';
        }
        if (Type.equals("Giant"))
        {
            HP = 40;
            Attack = 10;
            Armor = 15;
            Range = 5;
            Avatar = 'G';
        }
        if (Type.equals("Dementor"))
        {
            HP = 75;
            Attack = 15;
            Armor = 10;
            Range = 8;
            Avatar = 'D';
        }
        if (Type.equals("Death Eater"))
        {
            HP = 125;
            Attack = 15;
            Armor = 15;
            Range = 7;
            Avatar = 'E';
        }
        if (World[Xpos][Ypos] == ' ')
            World[Xpos][Ypos] = Avatar;
    }
    //**********************************************Enemy Movements*******************************
    public void MoveRight()
    {
        if (World[Xpos+1][Ypos] == ' ')
        {
            World[Xpos][Ypos] = ' ';
            Xpos++;
            World[Xpos][Ypos] = Avatar;
        }
    }
    public void MoveLeft()
    {
        if (World[Xpos-1][Ypos] == ' ')
        {
            World[Xpos][Ypos] = ' ';
            Xpos--;
            World[Xpos][Ypos] = Avatar;
        }
    }
    public void MoveUp()
    {
        if (World[Xpos][Ypos -1] == ' ')
        {
            World[Xpos][Ypos] = ' ';
            Ypos--;
            World[Xpos][Ypos] = Avatar;
        }
    }
    public void MoveDown()
    {
        if (World[Xpos][Ypos+1] == ' ')
        {
            World[Xpos][Ypos] = ' ';
            Ypos++;
            World[Xpos][Ypos] = Avatar;
        }
    }
}