package K_map;
// Java program to convert a decimal 
// number to binary number 
import java.io.*; 
  
class Binary  
{ 
    // function to convert decimal to binary 
    static String Binary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
        String s="";
        // counter for binary array 
        int i=0,d=0,l=0,j=0; 
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (j = i - 1; j >= 0; j--) 
            s=s+binaryNum[j];
            l=s.length();
            d=3-l;
            for(j=1;j<=d;j++)
            s='0'+s;
            return s;
    } 
}
 