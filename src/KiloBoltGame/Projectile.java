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
public class Projectile {

    private int x, y, speedX;
    private boolean visible;

    public Projectile(int startX, int startY) {
        x = startX;
        y = startY;
        speedX = 7;
        visible = true;
    }
    public void update(){
        x+= speedX;
        if(x>800){
            visible = false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public boolean isVisible() {
        return visible;
    }
    

}
