public class InsertionSort implements SortingAlgorithm{

    void insertionSort(double[] arr){
        for(int i = 1; i < arr.length - 1; i++){
            double temp = arr[i];
            int k = i - 1;
            while( k > 0 && arr[k] > temp){
                arr[k+1] = arr[k];
                --k;
            }
            arr[k+1] = temp;
        }
    }
}
