package ascii;

import ascii.big.FontBig;
import ascii.big.FontBigInterface;
import font.CaracterInterface;

public class Ascii
{
    char foo;
    
    public static void main(String[] args)
    {
        FontBigInterface font = new FontBig();
        
      //  CaracterInterface caracter                   =   font.getCaracter ('A');  //
        
        CaracterInterface[] caractereCollection      =   new CaracterInterface[2];  //  nombre de valeurs (donc pas compter 0 ici)        
        caractereCollection[0]                       =   font.getCaracter('A');
        caractereCollection[1]                       =   font.getCaracter('B');
        
        
        
        for (int i = 0; i < font.getLineHeight(); i++) 
        {
          
            for (int j = 0; j < caractereCollection.length; j++)
            {   char [][] definition  = caractereCollection[j].toAscii();
                
                for (int k = 0; k < definition[i].length; k++)
                {
                 System.out.print(definition[i][k]);   
                }
            }
            
            System.out.println("");
        }
        
        
                
            
          
    }
    
   
}
