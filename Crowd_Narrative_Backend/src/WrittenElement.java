
public class WrittenElement implements Element {
	
	private String content;
	
	private TaskType associatedTask;
	public WrittenElement() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getID() {

		return null;
	}

	@Override
	public Object getRanking(String userID) {

		return null;
	}

	@Override
	public String getValue() {
	
		return null;
	}

	@Override
	public void setID(String ID) {

		
	}
	
	public void setValue(String val) {
		content= val.toString(); 
		this.content=content;
	}
	
	
	@Override
	public void setValueDefault(Object val) {
		// TODO Auto-generated method stub
		this.content=val.toString();
	}


}
