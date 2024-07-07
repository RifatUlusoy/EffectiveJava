package com.example.garbageCollection;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    public Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;


    /*protected void finalize() throws Throwable {
       try{
           System.out.println("Garbage Collected");
       }catch (Throwable e){
           throw e;
       }finally {
           System.out.println("asdasd");
           super.finalize();
       }
    }*/
    public void finalize(){
        System.out.println("Garbage Collected");
    }
    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e){
        ensureCapacity();
        elements[size++]=e;
    }
    public Object pop(){
        if(size==0)
            throw new EmptyStackException();

        return elements[--size];
    }
    public Object popWell(){
        if(size==0){
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }


    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

}
