package com.Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
class StackUsingArrayList<T> {
private ArrayList<T> list = new ArrayList<>();
// Method to push an element onto the stack
public void push(T item) {
list.add(item);
}
// Method to pop an element from the stack
public T pop() {
if (isEmpty()) {
throw new EmptyStackException();
}
int lastIndex = list.size() - 1;
T item = list.get(lastIndex);
list.remove(lastIndex);
return item;
}
// Method to check if the stack is empty
public boolean isEmpty() {
return list.isEmpty();
}
// Method to peek at the top element without removing it
public T peek() {
if (isEmpty()) {
throw new EmptyStackException();
}
return list.get(list.size() - 1);
}
// Method to get the number of elements in the stack
public int size() {
return list.size();
}
// Method to clear the stack
public void clear() {
list.clear();
}
}
public class StackExampleUsingArrayList {
public static void main(String[] args) {
StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);
System.out.println("Stack is empty: " + stack.isEmpty());
System.out.println("Top element: " + stack.peek());
while (!stack.isEmpty()) {
System.out.println("Popped: " + stack.pop());
}
System.out.println("Stack is empty after popping all elements: " + stack.isEmpty());
}
}
