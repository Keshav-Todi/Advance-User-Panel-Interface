public class Octal_Decimal
{  
//Declaring method  
public static String Decimal(int octal)
{    
    //Declaring variable to store decimal number  
    int decimal = 0;    
    //Declaring variable to use in power  
    int n = 0; 
    String dec="";
    //writing logic   
    while(true){    
      if(octal == 0){    
        break;    
      } else {    
          int temp = octal%10;    
          decimal += temp*Math.pow(8, n);    
          octal = octal/10;    
          n++;    
       }    
    }    
    dec=Integer.toString(decimal);
    return dec;    
}
}    