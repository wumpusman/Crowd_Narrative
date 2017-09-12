
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
	
	
	public WrittenElement provideInstructions(){
		WrittenElement temp=new WrittenElement();
		
		
		temp.setValue("You'll be shown a segment of text from a story. We want you to rewrite or modify it, adding more detail and drama."
				+ "You will be shown an example along the lines of what we had in mind. In addition you'll be asked to write a brief recap of "
				+ "what you have converted");
		return temp;
}
	
	public WrittenElement provideExample(){
		WrittenElement temp=new WrittenElement();
		
		String originalText="";
		temp.setValue("ORIGINAL: Now we are to learn of three judges who ruled Israel in turn. Their names were Ibzan, Elon, "
				+ "and Abdon. None of these were men of war, and in their days the land was quiet. But the people of "
				+ "Israel again began to worship idols; and as a punishment God allowed them once more to pass under "
				+ "the power of their enemies. "
				+ ""
				+ "\nConverted incorporating the above advice: "
				+ ""
				+ "There were three men who ruled Israel. They had the names of Ibzan, Elon, and Abdon.  Need was replaced by want. Plush grass, and  fatter herding animals were provided to every male.  Unfortunately, peace would not last. The people grew fat, and complacent, and they lacked appreciation for God. For this trangression they were punished to serve the Philistines.  ");

		return temp;
	}
	
	}

