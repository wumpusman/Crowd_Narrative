/**
 * 
 * @author Michael
 *  Generic project that will be crowd sourced 
 */
 interface Project {
	
	 /*
	  * returns current state of the summary, will usually be predefined 
	  */
	 public Element getSummary(); 
	 
	 /*
	  * The id of the given project 
	  */
	 String getID();
	 
	 
	 /*
	  *   Checks if the given content created feels or looks like something else that's been done earlier or before
	  *   Basically if it's repetitive 
	  */
	 
	 public double Redunancy(Element userContent, User userID);
	 
	 /*
	  * Provides instructions on how to do project as well as potentially an example, shoudl be fairly limited in size
	  * @param User if potentially you awnt to take into account information about the user 
	  */
	 public Element provideInstructions(User userID, TaskType type);
	 
	 public Element provideExample(User userID, String currentLocation,TaskType type);
	 
	 public Element priorContext(User userID, String currentLocation,TaskType type);
	 
	 public Element postContext(User userID, String currentLocation,TaskType type);
	 
	 public void addElement(Element element, User UserID,String currentLocation);
	 
	 /*
	  * adds a user or appends a user if they already exist
	  */
	 public void addUser(User UserID);
	 
	 
	 
 }
