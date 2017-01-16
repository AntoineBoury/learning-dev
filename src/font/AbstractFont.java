package font;

public abstract class AbstractFont {
	
	protected byte lineheight;
	
	protected CaracterInterface[] caracter;
	
	protected abstract void initLineHeigth();
		
	protected abstract CaracterInterface createCaracter(char caracter);
	
	protected  AbstractFont()
	{
		
		this.initLineHeigth();
		this.caracter = new CaracterInterface[255];
	}

	public byte getLineHeight()
	{
		return this.lineheight;
	
	}
	
	public CaracterInterface getCaracter(char caracter)
	{
		if (null == this.caracter[caracter]) {
			this.caracter[caracter] = this.createCaracter(caracter);
			
		}
			return this.caracter[caracter];
	}






}
