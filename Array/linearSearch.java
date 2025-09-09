
public class linearSearch {
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length; i++){
            if(num[i]== key){
                return i;

            }

        }return -1;

    }
    public static void main(String[] args) {
        int num[] = {1,4,6,5,8,4};
        int key= 4;

        int index = linearSearch(num, key);


        if(index == -1){
            System.out.println("Not found");

        }
        else{
            System.out.println("Key found at index: "+index);
        }

    }
}
