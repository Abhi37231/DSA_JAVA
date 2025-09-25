public class FirstOccurence {
    public static int fO(int arr[],int key ,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;

        }
        return fO(arr,key ,i+1);
    }
    public static int lO(int arr[],int key ,int i){
        if(i == arr.length){return -1;
        }
        int isFound = lO(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,5};
        int key = 5;
        int i = 0;
        System.out.println(lO(arr,key, i));
    }
}
