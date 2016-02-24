package practice003.binaryHeap;

public class BinaryHeap {
    public int[] binaryHeap;
    int size = 0;

    public BinaryHeap(int size) {
        binaryHeap = new int[size];
    }

    public void insert(int val) {
        binaryHeap[size] = val;

        int i = size;
        int node = (i - 1) / 2;
        while (i > 0 && (binaryHeap[i] > binaryHeap[node])) {
            int temp = binaryHeap[i];
            binaryHeap[i] = binaryHeap[node];
            binaryHeap[node] = temp;

            i = node;
            node = (i - 1) / 2;
        }

        if (size < binaryHeap.length - 1) {
            size++;
        }
    }

    public int poll() {
        int result = binaryHeap[0];
        binaryHeap[0] = 0;

        int i = 0;

        while(true) {
            int parent = i;
            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if (right < binaryHeap.length && binaryHeap[parent] < binaryHeap[right]) {
                parent = right;
            }
            if (left < binaryHeap.length && binaryHeap[parent] < binaryHeap[left]) {
                parent = left;
            }
            if (parent == i) {
                break;
            }

            int temp = binaryHeap[i];
            binaryHeap[i] = binaryHeap[parent];
            binaryHeap[parent] = temp;

            i = parent;
        }

        return result;
    }
}
