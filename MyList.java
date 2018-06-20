import java.lang.*;

public interface MyList
{
	public void add(String str); 
	//adds a new string at the list

	public boolean contains(String str); 
	//checks the given str exists in the list

	public boolean remove(String str);
	//removes the given str in the list

	public String get(int index);
	//gets the String value the given index

	public int size();
	//counts the number of strings in the list
}