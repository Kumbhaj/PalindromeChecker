Palindrome Checker:
This is a simple Java Swing application that checks whether a given word or phrase is a palindrome — meaning it reads the same backward as forward — ignoring spaces, punctuation, and case sensitivity.

Project Overview:
The Palindrome Checker provides an easy-to-use graphical interface where users can input any text and instantly find out if it's a palindrome.

Built using:

Java
Java Swing (for GUI)
AWT Event Handling

Features:

User-friendly graphical interface.
Input validation with error messaging.
Ignores non-alphanumeric characters and case differences.
Real-time palindrome checking with instant results.

How It Works:

The user enters a word or phrase into the text field.
On clicking the "Check Palindrome" button:
Non-alphanumeric characters are removed.
The cleaned string is checked to see if it reads the same forward and backward.
The result is displayed at the bottom of the window.

Requirements:

Java JDK 8 or higher

Code Highlights:

Swing Components: JFrame, JPanel, JLabel, JTextField, JButton
Event Handling: ActionListener
String Handling: Regular Expressions for cleaning input (replaceAll) and manual character-by-character comparison.

Key Learnings:

Java GUI development with Swing.
Event-driven programming.
String manipulation and validation.
Exception handling with user-friendly dialogs (JOptionPane).
