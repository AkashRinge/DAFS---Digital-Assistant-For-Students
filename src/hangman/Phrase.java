package hangman;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
 
public class Phrase {
 
    private int randomInt;
 
    private List<String>  phrases;
 
    private Random          random;
 
    private String          phrase;
 
    public Phrase() {
        random = new Random();
        this.randomInt = -1;
 
        this.phrases = new ArrayList<String>();
        this.phrases.add("Rajesh sir IT faculty");
        this.phrases.add("Tribikram sir IT faculty");
        this.phrases.add("Our SE project is working");
        this.phrases.add("Please give us full marks");
        this.phrases.add("Please give us full marks");
        this.phrases.add("Please give us full marks");
    }
 
    public String getPhrase() {
        int nextInt = randomInt;
        while (nextInt == randomInt) {
            nextInt = random.nextInt(phrases.size());
        }
        this.randomInt = nextInt;
 
        this.phrase = phrases.get(randomInt);
        return phrase;
    }
 
    public String getHiddenPhrase() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < phrase.length(); i++) {
            String s = phrase.substring(i, i + 1);
            if (s.equals(" ") || s.equals(",")) {
                builder.append(s);
            } else {
                builder.append("_");
            }
        }
        return builder.toString();
    }
 
}