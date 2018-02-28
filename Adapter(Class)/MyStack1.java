import java.util.ArrayList;
public class MyStack1 implements Stack{
	ArrayList<Integer> list;
	public MyStack1(){
		list = new ArrayList<Integer>();
	}
	public void push(int x){
		list.add(x);
	}
	public void pop(){
		list.remove(list.size()-1);
	}
	public int peek(){
		return list.get(list.size()-1);
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
}