package Assets;
public abstract class Asset {
	
	protected String name;
	protected long value;
			
	public long getValue(){
		
		return this.value;
		
	}
	
	public String getName(){
		
		return this.name;
		
	}
	
	public abstract String toString();
}