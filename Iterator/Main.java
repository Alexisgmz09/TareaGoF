/*
 * Salvador Alexis Gómez González A01339639
 * David Alexis Zárate Trujillo 	A01332978
 */
public class Main{
	public static void main(String[] args) {
		IIterator si= new StudentsContainer().createIterator();
		while(si.hasNext()){
			System.out.println(si.next());
		}
	}
}
/*
 * Podemos ver como la clase IIterator es un iterador ya que nos permite acceder a
 * los valores internos de nuestra coleeción, en este caso el arreglo dentro de la 
 * clase StudentsContainer. Este iterador nos permite no preocuparnos por la 
 * estructura en la que este guardada la coleccion en este caso un arreglo perpo pudo
 * haber sido una lista o un vector, permitiendonos así acceder ordenadamente y de
 * manera genérica a los estudiantes. 
 */