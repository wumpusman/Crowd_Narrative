
/**
 * 
 * @author Michael
 * Defines a general users and their general features
 */
abstract class User {
	private Object [] Scores; //A list of various metrics for how 'good this user is doing overall
	
	private String Id; // A unique user ID
	
	public User (){
		
	}
	
	/* @param projectID returns score info for a particular user for a particular project
	 * Queries DB to get a given user's current scores for a given project
	 */
	public Object [] getScores(String projectID){
		return null;
	}
	
	/*
	 * Get any related users - this would need to query alt segment which handles ml analysis, or something more routine potententially
	 */
	public void getRelatedUsers() {}
	
	/*
	 *  returns a set of ID's linking what projects the user has worked on
	 */
	public String [] getProjects(){
		return null;
		
	}
	
	/*
	 * returns the current project we are working on 
	 */
	public String getCurrentProject(){
		return "";
	}
	
	
}
