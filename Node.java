public class Node
{
	String value;
	Node next;

	public Node() //default constructor
	{
	}

	public Node(String myValue) //constructor with String 
	{
		value = myValue;
	}

	public boolean hasNext() //checks if has next node
	{
		if(next == null)
		{
			return false;
		}
		return true;
	}

	public String getValue() //returns the value of the node
	{
		return value;
	}
	
	public void setNext(Node nextNode) //gets the next node in the linkedlist
	{
		next = nextNode;
	}

	public Node getNext() //gets the next node
	{
		return next;
	}
}