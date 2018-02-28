/*
 * Salvador Alexis Gómez González A01339639
 * David Alexis Zárate Trujillo 	A01331978	 	
 */
public class Main{
	public static void main(String[] args) {
		Stack stack1 = new MyStack1();
		Stack stack2 = new MyStack2();
		for(int i =0; i<9;i++){
			stack1.push(i);
			stack2.push(i);
		}
		while(!stack1.isEmpty()){
			System.out.println(stack1.peek());
			stack1.pop();
		}
		while(!stack2.isEmpty()){
			System.out.println(stack2.peek());
			stack2.pop();
		}
	}
}
/*
 * Podemos observar que la interfaz Stack es el contrato que respetaran nuestros 
 * Adaptadores permitiendonos así poder operarlos indistintamente como podemos ver
 * en el ejemplo anterior. En este caso nuestros adaptadores son MyStack1 y MyStack2
 * los cuales implentan un ArrayList y un Array (arreglo hecho clase) respectivamente,
 * como stacks. Esto nos permite adaptar el comportamiento de estas dos clases al de 
 * un stack sin estas estar estar pensadas en ser stack ejemplo visible en MyStack1.
 */