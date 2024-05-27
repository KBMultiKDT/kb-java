package _0627_inherit_basic.basic_q4_inherit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGame extends JFrame implements ActionListener {
    private JTextField guessField;
    private JButton guessButton;
    private JLabel messageLabel;
    private int numberToGuess;
    private int numberOfTries;

    public NumberGuessingGame() {
        setTitle("Number Guessing Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel promptLabel = new JLabel("Enter your guess (1-100):");
        guessField = new JTextField();
        guessButton = new JButton("Guess");
        guessButton.addActionListener(this);
        messageLabel = new JLabel("You have 10 attempts to guess the number!");

        panel.add(promptLabel);
        panel.add(guessField);
        panel.add(new JLabel(""));
        panel.add(guessButton);
        panel.add(new JLabel(""));
        panel.add(messageLabel);

        add(panel);

        initializeGame();
    }

    private void initializeGame() {
        Random random = new Random();
        numberToGuess = random.nextInt(100) + 1;
        numberOfTries = 10;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == guessButton) {
            try {
                int guess = Integer.parseInt(guessField.getText());
                numberOfTries--;
                if (guess == numberToGuess) {
                    messageLabel.setText("Correct! You guessed the number.");
                    guessButton.setEnabled(false);
                } else if (numberOfTries == 0) {
                    messageLabel.setText("Game over! The number was " + numberToGuess);
                    guessButton.setEnabled(false);
                } else if (guess < numberToGuess) {
                    messageLabel.setText("Too low! Attempts left: " + numberOfTries);
                } else {
                    messageLabel.setText("Too high! Attempts left: " + numberOfTries);
                }
            } catch (NumberFormatException ex) {
                messageLabel.setText("Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NumberGuessingGame game = new NumberGuessingGame();
            game.setVisible(true);
        });
    }
}
