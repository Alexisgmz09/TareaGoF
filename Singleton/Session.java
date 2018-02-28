/*
 * Salvador Alexis Gómez González A01339639
 * David Alexis Zárate Trujillo 	A01332978 
 */

public class Session{
	private static Session instance;
	private Date startDate;
	private String id;
	private String url;
	private String pssword;
	private Session(){
		startDate = new Date();
		id = new UUID();
	}
	public static Session getInstance(){
		if(instance == null){
			instance = new Session();
		}
		return instance;
	}
	public Date getStartDate(){
		return this.startDate;
	}
	public String getId(){
		return this.id;
	}
	public void setURL(String url){
		this.url = url;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public ResultSet query(String query){
		//code to execute query
	}
}


/* 
 * Esta clase tiene  el comportamiento de singleton ya que cuenta con una instancia de
 * esta misma clase de forma estática, lo cual significa que será global entre todos
 * los objetos de esta clase. A través del método stático get instance se podrá obtener
 * o crear la instancia única de esta clase. La Sesion dentro de la base de datos tiene
 * que ser única para poder mantener un controls sobre los queries que se ejeutan,
 * con esto podemos asegurarnos que la conexion a la base siempre sea la misma para toda 
 * la aplicación sin importar quien la mande a llamar.
*/