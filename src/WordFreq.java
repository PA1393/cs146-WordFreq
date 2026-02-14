

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


     //left child = 2*index HELPER METHOD
    public int leftChild(int index){
        return 2*index;
    }

        //right child = 2*index + 1 HELPER METHOD
    public int rightChild(int index){
        return 2*index + 1;
    }

    public boolean isHeap(int index){
        if(index >= leftChild(index) && index >= rightChild(index)){
            return true;
        }
        return false;
    }


    //Standard bottom up heap construction method
    public  WordFeq[] buildMaxHeap(WordFreq[] input){

        for(int i = input.length-1; i>=0 ; i--){
            if(!(isHeap(input[i].frequency))){
                //swap index with greater child
            }
        }


        //leaf node(s) = n/2
        //node parent = index/2
    }


}
