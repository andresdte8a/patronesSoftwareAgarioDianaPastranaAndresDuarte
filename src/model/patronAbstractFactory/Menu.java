package model.patronAbstractFactory;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.ImageObserver;
import java.beans.Visibility;
import javax.swing.JViewport;
import model.Client;
import model.patronFacade.Foods;
import model.GameStates;
import model.Players;
import model.patronFacade.Poisons;
import model.patronProxy.Proxy;
import model.patronProxy.Server;


public class Menu implements MouseListener, VisualAspects{
    
    
	private Rectangle playButton = new Rectangle(DisplayGame.WIDTH/2-50,DisplayGame.HEIGHT/2,100,50);
	private Rectangle quitButton = new Rectangle(DisplayGame.WIDTH/2-50, DisplayGame.HEIGHT/2+100, 100, 50);
	private boolean enabled = true;
	private VisualAspects displayGame;
	private Point pointPlayer1;
	public String[] args;
        Proxy proxy = new Proxy();
	public Menu(DisplayGame displayGame) {
		this.displayGame = displayGame;
	}
	
	public void setArgs(String[] A){
		args = A;
	}

	public void render(Graphics2D g2){
		Font font= new Font("Helvetica", Font.BOLD | Font.ITALIC,50);
                Toolkit t = Toolkit.getDefaultToolkit();
                AffineTransform at = g2.getTransform();
                at.translate(20, 20);
                Image imagen = t.getImage ("src/imagenes/zombie1.jpg");               
		g2.setFont(font);
		g2.setColor(Color.YELLOW);
                g2.drawImage(imagen, at, (DisplayGame) displayGame);
		g2.setColor(Color.ORANGE);
		g2.drawString("Informatica 1", DisplayGame.WIDTH/2-170, 280);
		g2.setColor(Color.RED);
		g2.drawString("Jugar", playButton.x, playButton.y+50);
		g2.drawString("Salir", quitButton.x, quitButton.y+50);	
	}
	public void setPoint(Point pointPlayer1){
		this.pointPlayer1=pointPlayer1;
	}
	public void setDisplayGame(DisplayGame dg){
		displayGame=dg;
	}
	public void player1Won(Graphics2D g2){
		g2.setColor(Color.GREEN);
		Font font= new Font("TimesRoman", Font.BOLD,50);
		g2.setFont(font);
		g2.drawString("Ganaste", pointPlayer1.x-100, pointPlayer1.y);
	}
	public void player2Won(Graphics2D g2){
		g2.setColor(Color.RED);
		Font font= new Font("calibri", Font.BOLD,50);
		g2.setFont(font);
		g2.drawString("Perdiste", pointPlayer1.x-100, pointPlayer1.y);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e ) {
            Proxy p = new Proxy();
		// TODO Auto-generated method stub
		if(enabled){
			int mx=e.getX();
			int my=e.getY();
			if(mx>=370&&mx<=470){
				if(my>=340&&my<=390){
					if(args.length == 0){
                                           
			           // Server server = new Server(displayGame);
			            Thread thread = new Thread(p.doAction());
			            thread.start();
					}
					else{
			            Client client = new Client(args[0] , (DisplayGame) displayGame);
			            System.out.println(args[0]);
			            Thread thread = new Thread(client);
			            thread.start();
					}	
					DisplayGame.state= GameStates.GAME;
					enabled=false;
				}
			}
			if(mx>=370&&mx<=470){
				if (my>=440&&my<490) {
					System.exit(1);
				}
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

    @Override
    public void setvPort(JViewport vPort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintComponent(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void whoWon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void didBallIntersect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printInfoBall(Graphics2D g2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Players getPlayer1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPlayer1(Players player1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Players getPlayer2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPlayer2(Players player2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Foods getFood() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFood(Foods food) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Poisons getPoison() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPoison(Poisons poison) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
