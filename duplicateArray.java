public class duplicateArray {
    public static void main(String[] args) {
        // this is the duplicate array
        int arr[]={1,2,4,6,3,2,5,2,1,3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
    
}
