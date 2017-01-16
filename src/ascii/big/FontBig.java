package ascii.big;

import ascii.AbstractFont;
import font.CaracterInterface;

public class FontBig extends AbstractFont implements FontBigInterface   // extends pour les classes, implements pour les interfaces
{
    private char symbolDef;
    private char symbolSd;
    private char symbolTir;
    private char symbolSg;
    private char symbolInf;
    private char symbolTd;
    private char symbolPar;
    
    
    public FontBig()                            //constructeur permet de déclarer les "variables"
    {
       super(); 
       this.symbolDef = ' ';
       this.symbolSd = '/';
       this.symbolTir = '_';
       this.symbolSg = '\\';
       this.symbolInf = '<';
       this.symbolTd        = '|';
       this.symbolPar = ')';
    }
    
    protected  void initLineHeigth()
    {
        this.lineheight = 6;
    }
    
    protected void initSymbolDefault()
    {
       this.symbolDef= ' ';
    }
 
    protected  CaracterInterface createCaracter(char caracter)
    {   
            if ('A' == caracter)
        {
            return new A(this);
        }
            else {return new B(this); 
                 }
                                               //********Temporaire, il reste du travail à faire
    }
    
    
    public char getSymbolDef()
    {
        return this.symbolDef;
    }
    
    public char getSymbolSd()
    {
        return this.symbolSd;
    } 
    
    public char getSymbolTir()
    {
        return this.symbolTir;
    } 
    
    public char getSymbolSg()
    {
        return this.symbolSg;
    } 
    
    public char getSymbolInf()
    {
        return this.symbolInf;
    } 
    
    public char getSymbolTd()
    {
        return this.symbolTd;
    } 
    
    public char getSymbolPar()
    {
        return this.symbolPar;
    } 
    
 }
