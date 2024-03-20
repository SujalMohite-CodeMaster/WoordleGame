import java.util.ArrayList;

public class wordle_logic {
    static ArrayList<String> answer = new ArrayList<>();
    static int wordsize;

    wordle_logic() {
        answer.add("f");
        answer.add("a");
        answer.add("r");
        answer.add("m");

        wordsize = answer.size();
    }

    static boolean matchExactLetter(int i) {
        if (wordle_frame.tf.get(i).getText().equals(answer.get(i))) {
            return true;
        }
        return false;
    }

    static boolean containsLetter(int i) {
        if (answer.contains(wordle_frame.tf.get(i).getText())) {
            return true;
        }
        return false;
    }
}







