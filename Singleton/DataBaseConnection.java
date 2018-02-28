public class DataBaseExecutor {
	private Session session;

	public DataBaseConnection(){
		session = Session.getInstance();
	}
	public executeQuery(String query){
		session.executeQuery(query);
	}
}