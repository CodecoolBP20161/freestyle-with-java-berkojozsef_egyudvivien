package Escape;

import java.awt.*;

public class Character {
     protected int x;
     protected int y;
    protected int centerX;
    protected int centerY;
    protected int width;
    protected int height;
     protected Image image;

    public void Character(int x, int y, Image img){
        this.image = img;
        this.x = x;
        this.y = y;
        this.width = this.image.getWidth(null) + 20;
        this.height = this.image.getHeight(null) + 100;
        this.centerX = this.x + this.width / 2;
        this.centerY = this.y + this.height / 2;


    }
    protected void move(){
        System.out.println("Nem jó a move.");
    }
    // Getters and setters
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getCenterX(){
        return this.centerX;
    }
    public void setCenterX(int x){
        this.centerX = x;
    }
    public int getCenterY(){
        return this.centerY;
    }
    public void setCenterY(int y){
        this.centerY = y;
    }



    }
    class Player extends Character {

        public Player(int x, int y, Image img){
            super.Character(x, y, img);
        }
        @Override
        public void move(){
            int mouseX = MouseInfo.getPointerInfo().getLocation().x;
            int mouseY = MouseInfo.getPointerInfo().getLocation().y;
            if (mouseX > this.centerX){
                this.x += 1;
                this.centerX += 1;
            }
            else if (mouseX < this.centerX){
                this.x -= 1;
                this.centerX -= 1;

            }

            if (mouseY > this.centerY){
                this.y += 1;
                this.centerY += 1;
            }
            else if (mouseY < this.centerY){
                this.y -= 1;
                this.centerY -= 1;
            }
        }

    class Enemy extends Character{

        public Enemy(int x, int y, Image img){
            super.Character(x, y, img);
        }

        @Override
        public void move(){

        }
    }
}
