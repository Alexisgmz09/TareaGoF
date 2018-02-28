
public class StudentsContainer implements IContainer{
	private String students[] = {"Alexis","David","Daniela","Allan","Cesar"};
	public IIterator createIterator(){
		return new StudentIterator();
	}
	private class StudentIterator implements IIterator{
		private int pos;
		public StudentIterator(){
			pos=0;
		}
		public boolean hasNext(){
			return pos<students.length;
		}
		public Object next(){
			if(hasNext()){
				return students[pos++];
			}else{
				return null;
			}
		}
	}
}
