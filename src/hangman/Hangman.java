package hangman;
import javax.swing.SwingUtilities;
 
import hangman.HangmanModel;
import hangman.HangmanFrame;
 
public class Hangman implements Runnable {
 
    @Override
    public void run() {
        new HangmanFrame(new HangmanModel());
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Hangman());
    }
 
}