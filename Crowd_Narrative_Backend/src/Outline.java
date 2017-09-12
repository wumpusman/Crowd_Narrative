
public class Outline {

		public static void main (String [] args){
			SamsonStoryDemo samsonStory=new SamsonStoryDemo();
			
			WrittenUser firstUser=new WrittenUser();
			WrittenUser secondUser=new WrittenUser();
			firstUser.setID("1");
			secondUser.setID("2");
			
			samsonStory.addUser(firstUser);
			samsonStory.addUser(secondUser);
			
			
			String summary=samsonStory.getSummaryAsString();
			String instructions=samsonStory.provideInstructions().getValue();
			String example=samsonStory.provideExample().getValue();
			
			WrittenElement contextMinusOne=samsonStory.priorContext(firstUser, "1", TaskType.NARRATIVE);
			String str_contextMinusOne= "";
			if contextMinusOne != null) str_contextMinusOne=contextMinusOne.getValue();
			//Create User or Check if User exists
				//Return profile 
			
			
			//Create general Story Of story 
			
			//getContext 
				//Return summary of story
			
			//Get Current Element Context Minus One
			//Get Current Element to be worked on 
			//If One in front exists get element at Context Plus one 
			
			
			
		}
}
