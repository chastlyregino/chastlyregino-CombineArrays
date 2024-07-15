
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int arr1Length = arr1.length; // for reusability
        int arr2Length = arr2.length; // for reusability
        int combinedArraysLength = arr1Length + arr2Length; // to instantiate the new array's length

        int[] combinedArrays = new int[combinedArraysLength]; // without instantitation of length, for loop will not work

        for (int i = 0; i < arr1Length; i++) {
            combinedArrays[i] = arr1[i];
        }

        for (int i = 0; i < arr2Length; i++) {
            combinedArrays[arr1Length + i] = arr2[i];
        }

        return combinedArrays;
    }
}
