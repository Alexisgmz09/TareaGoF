public class MyStack2 implements Stack{
	Array list;
	public MyStack2(){
		list = new Array();
	}
	public void push(int x){
		list.insert(x);	
	}
	public void pop(){
		list.removeLast();
	}
	public int peek(){
		return list.getLast();
	}
	public boolean isEmpty(){
		return list.empty();
	}
}