/*
Name: Harlan Chang
Class: CS20B
Assignment: Project 2
*/

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Test
{
	public static void main(String[] args)
	{
		MyLinkedList linkedList = new MyLinkedList();

		linkedList.add("Tea");
		linkedList.add("Coffee");
		linkedList.add("Coke");
		linkedList.add("Sprite");
		linkedList.add("Water");
		//creates linkedlist and adds the values into it 
		
		System.out.println("Tea in list is: " + linkedList.contains("Tea"));
		System.out.println("Frappu in list is: " + linkedList.contains("Frappu"));
		//prints out the values of whether or not certain values are in the linkedlist

		for(int i = 0; i < linkedList.size(); i++)
		//prints out the values in the linkedlist
		{
			System.out.println("Value #" + i + " is " + linkedList.get(i));
		}
		
		linkedList.remove("Coke");
		linkedList.remove("Sprite");
		//removes two values of the linkedlist

		for(int i = 0; i < linkedList.size(); i++)
		//prints out the values of the linkedlist after removed
		{
			System.out.println("Value #" + i + " is " + linkedList.get(i));
		}
	}
}