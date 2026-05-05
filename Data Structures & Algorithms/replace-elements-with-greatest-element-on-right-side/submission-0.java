class Solution {
    public int[] replaceElements(int[] arr) {

        int currentMax = -1;

        int [] arr2 = new int [arr.length];

        for(int i = arr.length-1; i>=0; i--){
            arr2[i] = currentMax;
            if(arr[i] > currentMax){
                currentMax = arr[i];
            }
        }
        return arr2;
    }
}