public class Heapify {
    

   public static boolean isHeap(WordFreq[] heap, int index) {

    int left = 2 * index + 1; // left child --- 0 based indexing
    int right = 2 * index + 2; //right child --- 0 based indexing

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

    // Fix heap property at index i by sifting down
    private static void maxHeapify(WordFreq[] a, int heapSize, int i) {
        while (true) {
            int left = 2 * i + 1; // left child --- 0 based indexing
            int right = 2 * i + 2; //right child --- 0 based indexing

            int largest = i; 

            if (isHeap(a, left)) {
                largest = left;
            }

            if (isHeap(a, right)) {
                largest = right;
            }

            if (largest == i) return;  // if parent is already a heap

            // If not heap
            WordFreq temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            i = largest; 
        }

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
