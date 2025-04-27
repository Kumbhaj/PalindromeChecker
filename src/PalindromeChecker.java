import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeChecker extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel resultLabel;

    public PalindromeChecker() {
        setTitle("Palindrome Checker");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));

        inputField = new JTextField();
        panel.add(new JLabel("Enter word or phrase:"));
        panel.add(inputField);

        JButton checkButton = new JButton("Check Palindrome");
        checkButton.addActionListener(this);
        panel.add(checkButton);

        resultLabel = new JLabel("Result: ");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(panel, BorderLayout.CENTER);
        add(resultLabel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        String cleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (cleanedInput.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid word or phrase.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean isPalindrome = true;
        for (int i = 0; i < cleanedInput.length() / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(cleanedInput.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        resultLabel.setText(isPalindrome ? "Result: It's a Palindrome!" : "Result: Not a Palindrome.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PalindromeChecker checker = new PalindromeChecker();
            checker.setVisible(true);
        });
    }
}
