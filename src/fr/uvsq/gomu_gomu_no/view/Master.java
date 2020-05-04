package fr.uvsq.gomu_gomu_no.view;

import javax.swing.JFrame;

public class Master extends JFrame {


    /**
     * The height of the frame
     */
    final int HEIGHT = 500;

    /**
     * The width of the frame
     */
    final int WIDTH = 1200;

    /**
     * The title of the frame
     */
    final static String TITLE = "Gomu gomu no";

    public Master() {
        super(TITLE);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        add(new Senpai());
        setVisible(true);
    }

}
