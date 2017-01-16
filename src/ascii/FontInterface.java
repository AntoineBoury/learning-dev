package ascii;

//import font.FontInterface;;     on doit faire la manip en dessous pour que ca marche //

public interface FontInterface extends font.FontInterface				//on doit faire extends, car FontInterface(ascii) est lié à FontInterface(font) or ils ont le même nom , donc pour eclipse il y a un bug
{
	
	public char getSymbolDefault();
	
		
}
