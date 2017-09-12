

import java.util.*;



public class WrittenProject implements Project{
	protected HashMap<Integer, ArrayList<WrittenElement>> currentNarrative;
	
	
	
	
	public WrittenProject(){
		this.currentNarrative=new HashMap<Integer,ArrayList<WrittenElement>>();
		
	}
	@Override
	public WrittenElement getSummary() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	public double Redunancy(Element userContent, User userID) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public WrittenElement priorContext(User userID, String currentLocation, TaskType task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WrittenElement postContext(User userID, String currentLocation, TaskType task) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addElement(Element element, User UserID, String currentLocation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUser(User UserID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WrittenElement provideExample(User userID, String currentLocation,  TaskType exampleTask) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public WrittenElement provideInstructions(User userID, TaskType task) {
		// TODO Auto-generated method stub
		return null;
	}

}
