package ascii;

public abstract class AbstractFont extends font.AbstractFont			//Car ascii.AbstractFont est lié à font.AbstractFont, or ils ont le même nom donc on utilise extend
{

	protected char symbolDefault;
	
	
	protected abstract void initSymbolDefault();
	
	protected AbstractFont()
	{
		super();												//super: permet d'appeler le constructeur parent (en JAVA ce n'est pas obliger de l'utiliser)
		this.initSymbolDefault();
		
	}
	
	
	public char getSymbolDefault()
	{
		return this.symbolDefault;
	}
	
}
