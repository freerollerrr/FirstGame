/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KiloBoltGame;

/**
 *
 * @author Kenne
 */
public class Background {
    private int bgX, bgY, speedX;
    public Background(int x, int y){
        bgX=x;
        bgY=y;
        speedX=0;
    }
    
    public void update(){
        bgX+=speedX;
        if(bgX<=-2160){
            bgX += 4320;
        }
    }

    public int getBgX() {
        return bgX;
    }

    public int getBgY() {
        return bgY;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setBgX(int bgX) {
        this.bgX = bgX;
    }

    public void setBgY(int bgY) {
        this.bgY = bgY;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }
    
    
}
