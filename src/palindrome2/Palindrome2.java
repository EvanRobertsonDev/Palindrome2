/*
 * Evan Robertson
 * February 24 2020
 * Palindrome2.java
 * This program revesres a word to see if it is the same and does thsi for an 
 * entire sentence
 */

package palindrome2;

import javax.swing.JOptionPane;

/**
 *
 * @author evrob0095
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int palindromeCount = 0;
        //Get input
        String palindrome = JOptionPane.showInputDialog("Enter a sentence to check");
        //Split input into arrays
        String[] arr = palindrome.split(" ");
        char[] arr2 = new char[palindrome.length()];
        String originalWord = "";
        String newWord = "";
        
        //check each word for a palindrome
        for (int i = 0; i < arr.length; i++) {
            originalWord = arr[i];
            arr2 = originalWord.toCharArray();
            for (int j = 0; j < originalWord.length(); j++) {
                newWord = arr2[j] + newWord;
            }
            if (originalWord.equals(newWord)) {
                palindromeCount++;
            }
            newWord = "";
        }
        JOptionPane.showMessageDialog(null, "Your sentence has " + palindromeCount
                + " palindromes!");
    } 
}
