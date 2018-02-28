
public class Array{
	private int[] arr;
	private int pos;
	public Array(){
		arr = new int[9];
		pos = -1;
	}
	public void insert(int x){
		arr[++pos]=x;
	}
	public void removeLast(){
		pos--;
	}
	public int getLast(){
		return arr[pos];
	}
	public boolean empty(){
		return pos==-1;
	}
}