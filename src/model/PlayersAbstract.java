/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author dianapastrana, andresdte
 */
public interface PlayersAbstract {

    public void drawPlayers(Graphics2D g2);

    public void increaseSize();

    public void decreaseSize();

    public void moveRight();

    public Ellipse2D.Double getPlayer();

    public double getX();

    public double getY();

    public void setPlayer(Ellipse2D.Double player);

    public double getVelocity();

    public void setVelocity(double velocity);
}
