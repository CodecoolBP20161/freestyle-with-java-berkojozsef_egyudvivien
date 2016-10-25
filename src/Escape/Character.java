package Escape;

import java.awt.*;

public class Character {
     private int x;
     private int y;
     private int dx;
     private int dy;
    private Image image;

    public  void Character(int x, int y, Image img){
        this.x = x;
        this.y = y;
        this.dx = 0;
        this.dy = 0;
        this.image = img;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getDx(){
        return this.dx;
    }
    public int getDy(){
        return this.dy;
    }

    }
    class Player extends Character {

        public void move(){



        }

    class Enemy extends Character{

        public void move(){

        }
    }
}
