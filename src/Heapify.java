public class Heapify {
    


    
   public boolean isHeap(WordFreq[] heap, int index) {

    int left = 2 * index + 1;
    int right = 2 * index + 2;

    // Check left child
    if (left < heap.length && heap[index].frequency < heap[left].frequency) {
        return false;
    }

    // Check right child
    if (right < heap.length && heap[index].frequency < heap[right].frequency) {
        return false;
    }

    return true; 
    
    }


    //Standard bottom up heap construction method
    public static void buildMaxHeap(WordFreq[] input){

        int n = input.length;
        int leafNode = (input.length/2) -1; //start heapifying from the last internal node --> the root

        for(int i = leafNode ; i>=0 ; i--){
           maxHeapify(input, n, i);
        }
    }


}
