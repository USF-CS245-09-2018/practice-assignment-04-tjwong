public class SelectionSort implements SortingAlgorithm {

    double[] arr = new double[];


    public double[] selectionSort(double[] arr){
        double[] tempArr = new double[arr.length];

        int count = 0;
        double min;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }




    }

    @Override
    public void sort(int[] a) {

    }

}
