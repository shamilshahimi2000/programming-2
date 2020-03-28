
public class No3 {

    public static void main(String[] args) {
        
                String str="aq suka ayam";                                              //initialise str
        PrintReverse(str);                                                      //call method
    }
    public static void PrintReverse(String a){
        for(int i=a.length()-1;i>=0;i--)                                        //for loop
            System.out.print(a.charAt(i));                                      //print the string in opposite direction
    }
    
}
