public class BubbleSort implements SortingAlgorithm {



    public void swap(int first, int second, double[] arr){
        int tempNum = first;

        arr[first] = arr[second];
        arr[second] = tempNum;

    }


    public void bubbleSort(double[] arr){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < arr.length - 1 - i; i++){
                if(arr[i] > arr[i+1]){
                    swap(i; i+1; arr);
                    swapped = true;
                }
            }
        }
    }





}
