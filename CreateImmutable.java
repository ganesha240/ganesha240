public final class CreateImmutable {

	private int i;
		
	public CreateImmutable(int i) {
		this.i=i;
	}
	
	public CreateImmutable modify(int i)
	{
		if(this.i==i)
		{
			return this;	
		}	
		else {
			return new CreateImmutable(i);
		}
	}
	
	public static void main(String[] args) {
		CreateImmutable c1=new CreateImmutable(10);
		CreateImmutable c2=c1.modify(100);
		CreateImmutable c3=c1.modify(10);
		
		System.err.println(c1==c2);
		System.out.println(c1==c3);
	}
}//class
