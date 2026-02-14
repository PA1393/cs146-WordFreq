

    /* You are given a list of commonly used customer‑survey phrases, 
    each paired with the number of times it appeared in recent feedback. */
public class WordFreq {

    String word; //phrase
    int frequency; //number of times phrase appeared: frequency determines priority (higher frequency --> higher priority)

    public WordFreq(String word, int frequency){
        this.word = word;
        this.frequency = frequency;
    }


    @Override
    public String toString(){
        return word + " (" + frequency + ")";
    }


}
