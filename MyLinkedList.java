public class MyLinkedList implements MyList
{
	public Node root;

	public void add(String str)
	//follows the existing chain of nodes and adds a new node at the end with the given str
	{
		if(root != null) //checks to make sure there is no root 
		{
			Node temp = root; //gets the root of the node to iterate through it
			while(temp.hasNext()) 
			//iterate through the linkedlist until the next one is null
			{
				temp = temp.getNext();
			}
			temp.setNext(new Node(str)); //sets the next node in the linkedlist
		}
		else
		{
			root = new Node(str); //if there is no root then create one 
		}
	}

	public boolean contains(String str)
	//checks if a node exists with the given str
	{
		Node temp = root; //gets the root of the node to iterate through it

		if(temp.getValue() == str) //checks the first node 
		{
			return true;
		}
		while(temp.hasNext()) 
		//iterates through the linkedlist
		{
			temp = temp.getNext(); 
			if(temp.getValue() == str)
			//checks if the values are equal to see if the node contains the value we are looking for
			{
				return true;
			}
		}
		return false;
	}

	public boolean remove(String str)
	//removes the ndoe with the given str if it exists. Returns true fi it was removed, false if it was not found
	{
		Node temp = root; //gets the root of the node to iterate through it
		if(temp.getValue() == str)
		//checks if the root is the value we are trying to remove
		{
			root = root.getNext();
			//if the root is the value we are trying to remove, change the root to the next value
			return true;
		}
		while(temp.hasNext())
		//iterate through the linkedlist
		{
			if(temp.getNext().getValue() == str) //checks if the next value is the one we are lookng for
			{
				temp.setNext(temp.getNext().getNext()); //skips the value that we are looking for 
				return true;
			}
			else
			{
				temp = temp.getNext(); //otherwise, go to the next node
			}
		}
		return false;
	}

	public String get(int index)
	//gets the String value fo the node at the given index
	{
		Node temp = root; //gets the root of the node to iterate through it
		for(int i = 0; i < index; i++)
		//iterate through the whole linked list unti the value we are looking for
		{
			temp = temp.getNext();
		}
		return temp.getValue(); //returns the value we are looking for
	}

	public int size()
	//gets the number of nodes
	{
		int count = 0;
		Node temp = root; //gets the root of the node to iterate through it
		while(temp.hasNext())
		//iterate through the linkedlist
		{
			count++; //counts each time we iterate through it 
			temp = temp.getNext(); //
		}

		if(count > 0)
		//checks if the value of our count is greater than one so we can add the first value,
		//in case the linked list is actually empty
		{
			count ++; //adds one to that value
		}

		return count;
	}
}