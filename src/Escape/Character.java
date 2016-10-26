package Escape;
import java.awt.*;

class Character {
    int x;
    int y;
    int centerX;
    int centerY;
    int width;
    int height;
    Image image;

     void Character(int x, int y, Image img){
        this.image = img;
        this.x = x;
        this.y = y;
        this.width = this.image.getWidth(null);
        this.height = this.image.getHeight(null);
        this.centerX = this.x + this.width / 2;
        this.centerY = this.y + this.height / 2;


    }
    protected void move(){
        System.out.println("Nem jó a move.");
    }
    // Getters and setters
        int getX(){
        return this.x;
        }
        void setX(int x){
        this.x = x;
        }

        int getY(){
        return this.y;
        }
        void setY(int y){
        this.y = y;
        }

        int getCenterX(){
        return this.centerX;
        }
        void setCenterX(int x){
        this.centerX = x;
        }

        int getCenterY(){
        return this.centerY;
        }
        void setCenterY(int y){
        this.centerY = y;
        }



    }
    class Player extends Character {

        public Player(int x, int y, Image img){
            super.Character(x, y, img);
        }

        @Override
        public void move(){
            // Getting the required values
            GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            int screenWidth = gd.getDisplayMode().getWidth();
            int screenHeight = gd.getDisplayMode().getHeight();
            int mouseX = MouseInfo.getPointerInfo().getLocation().x;
            int mouseY = MouseInfo.getPointerInfo().getLocation().y;

            // Inspecting mouse position and character position
            if (mouseX > this.centerX && this.x < screenWidth - this.height){
                this.x += 1;
                this.centerX += 1;
            }
            else if (mouseX < this.centerX && this.x > 0){
                this.x -= 1;
                this.centerX -= 1;
            }

            if (mouseY > this.centerY && this.y < screenHeight - this.height){
                this.y += 1;
                this.centerY += 1;
            }

            else if (mouseY < this.centerY && this.y > 0){
                this.y -= 1;
                this.centerY -= 1;
            }
        }

        // We didn't have time to fully implement this class
    class Enemy extends Character{

        public Enemy(int x, int y, Image img){
            super.Character(x, y, img);
        }

        @Override
        public void move(){

        }
    }
}
