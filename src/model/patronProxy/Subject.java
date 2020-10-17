/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.patronProxy;

import java.awt.event.MouseEvent;
import java.net.Socket;

/**
 *
 * @author programador
 */
public interface Subject {
    
    
    public void hostGame();

    public void sendFoods(Socket socket);

    public void post(Socket socket);

    public void sendPoisons(Socket socket);
    
    public void get(Socket socket);

    public void run();
    
}