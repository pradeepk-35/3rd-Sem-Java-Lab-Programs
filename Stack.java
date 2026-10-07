package PRACTICE;

import java.util.*;
public class Stack {
	int s[]  = new int[5];
	int top = -1;
	int size = 5;
	
	void push(int x) {
		if(top == (size - 1)) {
			System.out.println("Stack overflow");
		}
		else {
			s[++top] = x;
		}
	}
	
	void pop() {
		if(top == -1)	System.out.println("stack is underflow");
		else {
			System.out.println("Popped element = "+s[top]);
			top--;
		}
	}
	void display() {
		System.out.println("stack elements are : ");
		for(int i = top; i >= 0; i--) {
			System.out.println(s[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stk = new Stack();
		for(;;) {
			System.out.println("--Stack operations--\n1. push\n2. pop\n3.display\n4. exit\nEnter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("Enter the element to push : ");
			stk.push(sc.nextInt());
			break;
			case 2 :
				stk.pop();
				break;
			case 3 :
				stk.display();
				break;
			case 4 :
				System.exit(0);
			
			default :
				System.out.println("Invalid choice");
			}
		}
	}

}
