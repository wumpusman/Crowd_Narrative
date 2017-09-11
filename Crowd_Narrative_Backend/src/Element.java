/**
 * 
 * @author Michael
 * A current element which is nebulous, but typically contains a string with other info like ranking and an d
 */
public interface Element {

	public String getID();
	
	/*
	 * Get a 'score' of this particular element, if user ID passed, gets potentail context of how 'good' it is 
	 * relative to that particular user 
	 */
	public Object getRanking(String userID);
	
	/*
	 * Returns the value of this element
	 */
	public Object getValue();
	
	void setValueDefault(Object val);
	
	void setID(String ID);
	
}

