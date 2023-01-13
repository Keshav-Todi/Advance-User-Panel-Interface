public class Octal
{    
    //creating method for conversion so that we can use it many times  
    public static String Oct(int decimal)
    {    
        int rem; //declaring variable to store remainder  
        String octal=""; //declareing variable to store octal  
        //declaring array of octal numbers  
        char octalchars[]={'0','1','2','3','4','5','6','7'};  
        //writing logic of decimal to octal conversion   
        while(decimal>0)  
        {  
            rem=decimal%8;   
            octal=octalchars[rem]+octal;   
            decimal=decimal/8;  
        }  
        return octal;  
    }    
}