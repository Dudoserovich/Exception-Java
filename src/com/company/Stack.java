package com.company;

import java.util.ArrayList;

public class Stack<T> {
    int size;
    private int pointer;

    ArrayList<T> stack;

    public Stack() {
        stack = new ArrayList<>();
        this.size = 10;
        pointer = -1;
    }

    public Stack(int size) {
        stack = new ArrayList<>();
        this.size = size;
        pointer = -1;
    }

    public T pop() throws StackError {
        if (pointer == -1)
            throw new StackError("An empty stack cannot be popped.");
        return stack.remove(pointer--);
    }

    public void push(T el) throws StackError {
        if (pointer == size - 1)
            throw new StackError("It is impossible to add to the full stack");
        else
            stack.add(++pointer, el);
    }

    public T peek() {
        return stack.get(pointer);
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    @Override
    public String toString() {
        return "STACK\n" + "size: " + size + '\n' + stack;
    }

    public boolean search(T a) throws StackError {
        if (pointer == -1)
            throw new StackError("Can't search on empty stack");
        return stack.contains(a);
    }
}
