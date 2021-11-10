package Chapter20.Stack;

import java.util.ArrayList;

public class Stacking<T>{
    private final ArrayList<T> elements;

    public Stacking() {
        this(10);
    }
    public Stacking(int capacity){
        int initCapacity = capacity>0?capacity:10;
        elements = new ArrayList<T>(initCapacity);
    }
    public void push(T pushValue){
        elements.add(pushValue);
    }
    public T pop(){
        if(elements.isEmpty()){
            throw new EmptyException("Stacking is empty, cannot pop");
        }
        return elements.remove(elements.size()-1);
    }
}
