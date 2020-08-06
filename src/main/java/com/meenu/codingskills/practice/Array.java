package com.meenu.codingskills.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* @author Meenu V. Nair
*
 * Creation time: Jun 6, 2020 9:55:44 AM
*
*/



public class Array{
	
	static class Node{
		int data;
		Node next;
		Node(int d){
	        data=d;
	        next=null;
	    }
		
	}
	public static Set<Integer> set = new HashSet<>();
	
	public static Node removeDuplicates(Node head) {
		if(head == null)
			return head;
	    Node currentNode = head;
	    set.add(currentNode.data);
	    Node prev = null;
	    while(currentNode != null && currentNode.next != null) {
	    	prev = currentNode;
	    	currentNode = currentNode.next;
	    	if(set.contains(currentNode.data)) {
	    		Node nextNonDuplicate = findNextDistinctNode(currentNode.next);
	    		prev.next = nextNonDuplicate;
	    		set.remove(currentNode.data);
	    		currentNode = nextNonDuplicate;
	    		if(nextNonDuplicate != null)
	    			set.add(nextNonDuplicate.data);
	    	}
	    	else {
	    		set.add(currentNode.data);
	    	}
	    }
	    return head;
    }

	private static Node findNextDistinctNode(Node node) {
		while(node != null && set.contains(node.data))
			node = node.next;
		return node;
	}
	
	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }

	
	/*public static void main(String args[]) throws InterruptedException {
		ArrayList<Customer> customers = new ArrayList<>();
		
		while(true) {
			Customer c = new Customer("Michael");
			if(customers.size() >= 100) {
				customers.remove(0);
			}
		}
	}*/
	
	/*public static void main(String args[]) throws InterruptedException {
		final Customer c = new Customer("John");
		System.out.println(c.getName());
		c.setName("Susan");
		System.out.println(c.getName());
		
		Runtime runtime = Runtime.getRuntime();
		long availableBytes = runtime.freeMemory();
		System.out.println("Available memory : " + availableBytes / 1024 + "k");
		
		for(int i = 0; i < 10000000; i++) {
			Customer c = new Customer("John");
			System.out.println("Object created.... entering sleep method....");
			//Thread.sleep(100);
			System.out.println("Sleep complete...");
		}
		
		availableBytes = runtime.freeMemory();
		System.out.println("Available memory : " + availableBytes / 1024 + "k");
		
	//	System.gc();
		
		runtime.freeMemory();
		System.out.println("Available memory : " + availableBytes / 1024 + "k");
	}*/
}

class Customer{
	String name;
	
	Customer(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/*public void finalize() {
		System.out.println("Garbage collection is being done .... !");
	}*/
}

/*class SampleDemo implements Runnable{
	private Thread t;
	private String threadName;
	
	public SampleDemo(String threadName) {
		this.threadName = threadName;
	}
	
	public void run() {
		while(true)
			System.out.println(threadName);
	}
	
	public void start() {
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class Array {
	public static void main(String args[]) {
		SampleDemo A = new SampleDemo("A");
		SampleDemo B = new SampleDemo("B");
		
		B.start();
		A.start();
	}
}*/
