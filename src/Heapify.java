public class Heapify {
    

    // Fix heap property at index i by sifting down
    private static void maxHeapify(WordFreq[] a, int heapSize, int i) {
        while (true) {
            int left = 2 * i + 1; // left child --- 0 based indexing
            int right = 2 * i + 2; //right child --- 0 based indexing

            int largest = i; 

            // compare parent with left child
            if (left < heapSize && a[left].frequency > a[largest].frequency) {
                largest = left;
            }

            // compare current largest with right child
            if (right < heapSize && a[right].frequency > a[largest].frequency) {
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
        int lastInternal = (input.length/2) -1; //start heapifying from the last internal node --> the root

        for(int i = lastInternal ; i>=0 ; i--){
           maxHeapify(input, n, i);
        }
    }


}
