
public class SamsonStoryDemo extends WrittenProject{
	
	public WrittenElement getSummary(){
		
			WrittenElement temp=new WrittenElement();
			
			
			temp.setValue("Story is about a man raised to protect his people, granted with super strength. He is eventually betrayed, but "
					+ "uses his strength to harm the enemy of his people before he dies.");
			return temp;
	}
	
	public String getSummaryAsString(){
		
		return this.getSummary().getValue();
	}
	
	
	public WrittenElement getInstructions(){
		WrittenElement temp=new WrittenElement();
		
		
		temp.setValue("Story is about a man raised to protect his people, granted with super strength. He is eventually betrayed, but "
				+ "uses his strength to harm the enemy of his people before he dies.");
		return temp;
}
	}

