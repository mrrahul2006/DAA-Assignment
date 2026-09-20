class Median_two_Sorted_array {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length,y=nums2.length;
        int arr[]= new int[x+y];
        for(int i=0;i<x;i++){
            arr[i]=nums1[i];
        } 
        for(int i=0;i<y;i++){
            arr[i+x]=nums2[i];
        } 
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            return arr[n/2];
        }

    }
}