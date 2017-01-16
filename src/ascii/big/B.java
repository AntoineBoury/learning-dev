package ascii.big;

import ascii.AbstractCaracter;
import font.CaracterInterface;

public class B extends AbstractCaracter implements CaracterInterface
{
    
    public B (FontBig font)                                      //Constructeur: initialiser les valeurs des attributs déclarés
    {
      char [][] B =         //Affecter des valeurs à définition. La méthode LineHeight appartient à font
      {
          { font.getSymbolTir(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolDef() },
          { font.getSymbolTd(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolTir(), font.getSymbolDef(), font.getSymbolSg(), font.getSymbolDef() },
          { font.getSymbolTd(), font.getSymbolDef(), font.getSymbolTd(), font.getSymbolTir(), font.getSymbolPar(), font.getSymbolDef(), font.getSymbolTd() },
          { font.getSymbolTd(), font.getSymbolDef(), font.getSymbolDef(), font.getSymbolTir(), font.getSymbolDef(), font.getSymbolInf(), font.getSymbolDef() },       
          { font.getSymbolTd(), font.getSymbolDef(), font.getSymbolTd(), font.getSymbolTir(), font.getSymbolPar(), font.getSymbolDef(), font.getSymbolTd() },
          { font.getSymbolTd(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolTir(), font.getSymbolSd(), font.getSymbolDef() }
      };
      
      this.definition = B;
    }
    
    
    public String toString()
    {
        return ""; 
    }
    
    
    
}