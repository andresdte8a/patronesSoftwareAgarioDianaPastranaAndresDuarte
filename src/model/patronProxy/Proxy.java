/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patronProxy;

import java.awt.event.MouseEvent;
import java.net.Socket;
import model.patronAbstractFactory.DisplayGame;
import model.patronAbstractFactory.VisualAspects;

/**
 *
 * @author programador
 */
public class Proxy implements Subject{
    
    private VisualAspects displayGame;
    
    public Proxy() {
    }

    public Server doAction() {
        Server server = new Server((DisplayGame)displayGame); 
        return server;
    }

    @Override
    public void hostGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendFoods(Socket socket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void post(Socket socket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendPoisons(Socket socket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void get(Socket socket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    

}
