public class BinaryStrings {
    
    public static void main(String[] args) {
       String s = "hello world";
       int length = 0;

       for(int i=s.length()-1;i>=0;i--){

        if(s.charAt(i)!=' '){
            length++;
        }
        else{
            break;
        }
        
       }
       System.out.println(length);
       
}
}
