/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patronAbstractFactory;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JViewport;
import model.patronFacade.Foods;
import model.Players;
import model.patronFacade.Poisons;

/**
 *
 * @author programador
 */
public interface VisualAspects {
    
    // Metodos de Display 
    
    public void setvPort(JViewport vPort);
    
    public void paintComponent(Graphics g);
    
    public void whoWon();
    
    public void didBallIntersect();
    
    public void printInfoBall(Graphics2D g2);
    
    public Players getPlayer1();
    
    public void setPlayer1(Players player1);
    
    public Players getPlayer2();
    
    public void setPlayer2(Players player2);
    
    public Foods getFood();

    public void setFood(Foods food);

    public Poisons getPoison();

    public void setPoison(Poisons poison);

    // Metodos del Menu
    
    public void setArgs(String[] A);

    public void render(Graphics2D g2);

    public void setPoint(Point pointPlayer1);

    public void setDisplayGame(DisplayGame dg);

    public void player1Won(Graphics2D g2);

    public void player2Won(Graphics2D g2);

}
