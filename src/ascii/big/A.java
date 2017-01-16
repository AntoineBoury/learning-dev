package ascii.big;

import ascii.AbstractCaracter;
import font.CaracterInterface;

public class A extends AbstractCaracter implements CaracterInterface
{
    
    public A (FontBig font)                                      //Constructeur: initialiser les valeurs des attributs déclarés
    {
      char [][] A =         //Affecter des valeurs à définition. La méthode LineHeight appartient à font
      {
          { font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef() },
          { font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolSd(), font.getSymbolSg(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef() },
          { font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolSd(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolSg(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef() },
          { font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolSd(), font.getSymbolDef(), font.getSymbolSd(), font.getSymbolSg(), font.getSymbolDef(), font.getSymbolSg(), font.getSymbolDef(), font.getSymbolDef() },      
          { font.getSymbolDef(), font.getSymbolDef(), font.getSymbolSd(), font.getSymbolDef(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolDef(), font.getSymbolSg(), font.getSymbolDef() },
          { font.getSymbolDef(), font.getSymbolSd(), font.getSymbolTir(), font.getSymbolSd(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolSg(), font.getSymbolTir(), font.getSymbolSg() }
         
      };
      
      this.definition = A;
    }
    
    
    public String toString()
    {
        return ""; 
    }
    
    
    
}
