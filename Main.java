package snakegame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame =new JFrame("Snake Game");
        snake game=new snake();
        frame.add(game);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
