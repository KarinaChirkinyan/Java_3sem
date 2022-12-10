package pract_8;

import java.util.ArrayList;

public class UnfairWaitList<E> extends WaitList<E> {
    ArrayList<E> removed;

    @Override
    public void add(E element){
        if (!removed.contains(element)){
            components.add(element);
        }
        else{
            System.out.println("Элемент не может быть добавлен");
        }
    }

    public UnfairWaitList() {
        super();
        this.removed = new ArrayList<E>();
    }

    public void remove (E element){
        if (this.components.peek() == element){
            return;
        }
        this.removed.add(element);
        components.remove(element);
    }

    public void moveToBack(E element){
        int prevSize = components.size();
        remove(element);
        if(components.size() < prevSize){
            components.add(element);
        }

    }
}
