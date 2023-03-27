package View;

import Game.Coordinates;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

    /**
    This Class is responsible for the view of the tictactoe game
     **/

    private final JFrame frame = new JFrame();
    private final JPanel titlePanel = new JPanel();
    private final JPanel buttonPanel = new JPanel();
    private final JLabel infoField = new JLabel();
    private final JButton[] buttons = new JButton[9];
    private final JPanel centerPanel = new JPanel(new GridBagLayout());

    private boolean moveMade = true;
    private Coordinates coordinates;
    //TODO: list of buttons already clicked inorder that they do not change color

    public TicTacToe(){
        //frame setup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(68, 84, 105));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //info field setup
        infoField.setBackground(new Color(41, 51, 64));
        infoField.setForeground(new Color(243, 243, 243));
        infoField.setFont(new Font("Verdana",Font.PLAIN, 60));
        infoField.setHorizontalAlignment(JLabel.CENTER);
        infoField.setText("Tic-Tac-Toe");
        infoField.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0,0,800,100);
        titlePanel.add(infoField);

        //buttons setup
        buttonPanel.setLayout(new GridLayout(3,3));
        buttonPanel.setPreferredSize(new Dimension(300, 300));
        // Add buttons to the buttonPanel
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Verdana",Font.PLAIN, 60));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        centerPanel.setBackground(new Color(68, 84, 105));
        centerPanel.add(buttonPanel);

        //add text/buttons to frame
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!moveMade) {
            for (int i = 0; i < 9; i++) {
                if (e.getSource() == buttons[i]) {
                    coordinates = new Coordinates(i);
                    buttons[i].setText("o");
                    buttons[i].setEnabled(false);
                    buttons[i].setBackground(new Color(194, 214, 233));
                    moveMade = true;
                }
            }
        }
    }

    public Coordinates getInput(){
        moveMade = false;
        while(!moveMade){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return coordinates;
    }

    public void setText(String s){infoField.setText(s);}



    //these methods are needed in order to color the fields which led to victory green
    public void xWins(char[] winningFields){}
    public void oWins(char[] winningFields){}
}
