package agario;

import java.awt.Component;
import model.patronAbstractFactory.DisplayGame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.ScrollPaneConstants;
import model.patronAbstractFactory.VisualAspects;


public class Agario {

	public static boolean gamemode;
	public static void main(String[] args) {
		
		JFrame frame= new JFrame("AGARIO INFORMATICA 1");
		JScrollPane pane= new JScrollPane();
		JViewport vport= new JViewport();
		VisualAspects panel= new DisplayGame();
		
		panel.setArgs(args);
		vport.add((JPanel) panel);
		frame.setVisible(true);
		pane.setViewport(vport);
		vport.add((JPanel)panel);
		frame.add(pane);
		frame.setSize(DisplayGame.WIDTH, DisplayGame.HEIGHT);
		panel.setvPort(vport);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
