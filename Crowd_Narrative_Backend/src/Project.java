/**
 * 
 * @author Michael
 *  Generic project that will be crowd sourced 
 */
 interface Project {
	
	 /*
	  * returns current state of the summary, will usually be predefined 
	  */
	 Object getSummary(); 
	 
	 /*
	  * The id of the given string 
	  */
	 String getID();
	 
	 
	 /*
	  *   Checks if the given content created feels or looks like something else that's been done earlier or before
	  *   Basically if it's repetitive 
	  */
	 
	 double Redunancy(Object userContent, String userID, String contentID);
	 
	 
	 
	 Object priorContext(User userID, String currentLocation);
 
	 
 }
