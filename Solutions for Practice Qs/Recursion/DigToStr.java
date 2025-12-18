
public class DigToStr {
    static String digits[]={
        "Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"
    };
    public static void printDig(int number){
        if(number == 0){
            return;
        }
        int lastDig = number%10;
        printDig(number/10);
        System.out.print(digits[lastDig]+" ");
    }
    public static void main(String[] args) {
        printDig(1230);
        System.out.println();
    }
    
}
