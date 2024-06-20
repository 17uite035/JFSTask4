package com.java.demos;

import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {
     Stack<Integer> stack=new Stack<>();

    public void push(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
        }
        else {
            int poppedElement = stack.pop();
            System.out.println("Popped " + poppedElement + " from the stack.");
        }
    }

    public void displayStack() {
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        Scanner sc=new Scanner(System.in);
 	   
 	  while (true) {
          System.out.println("1. Push");
          System.out.println("2. Pop");
          System.out.println("3. Display");
          System.out.println("4. Exit");
          System.out.print("Choose an option: ");
          int option = sc.nextInt();

          switch (option) {
              case 1:
                  System.out.print("Enter number to push: ");
                  int insert = sc.nextInt();
                  stack.push(insert);
                  break;
              case 2:
                  System.out.print("pop: ");
                  stack.pop();
                  break;
              case 3:
                  System.out.print("stack: ");
                  stack.displayStack();
                  break;
              case 4:
                  System.out.println("Exiting...");
                  return;
              default:
                  System.out.println("Invalid option. Please try again.");
          }
      }
  }

}
