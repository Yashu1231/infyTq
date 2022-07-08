import java.io.*;
import java.util.*;
	
// Java program to implement
// a Singly Linked List
public class LinkedList {
	
	Node head; 
	
	
	static class Node {
	
		int data;
		Node next;
	
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	// function to insert a node 
	public static LinkedList insert(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null) {
			list.head = new_node;
		}
		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}	
			last.next = new_node;
		}
		return list;
	}
	
	//Function to print the list
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");	
		while (currNode != null) {
			System.out.print(currNode.data + " ");	
			currNode = currNode.next;
		}
	}
//Function to dellete a node
     public static LinkedList delete(LinkedList list,int key)
    {   
        Node currNode = list.head, prev = null;

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;       
            System.out.println(key + " found and deleted");
            return list;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
           
            prev.next = currNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }
  
        // return the List
        return list;
    }
	
	public static void main(String[] args)
	{
	
		LinkedList list = new LinkedList();
	
		
		list = insert(list, 1);
		list = insert(list, 2);
		list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);

        list = delete(list, 3);
        list = delete(list, 4);
        list = delete(list, 5);

	
	
		printList(list);
	}
}
