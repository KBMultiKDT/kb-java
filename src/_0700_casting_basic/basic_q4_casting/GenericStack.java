package _0700_casting_basic.basic_q4_casting;

import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String getList() {
        String list = "";
        for (int i = 0; i < stack.size(); i++) {
            list += stack.get(i).toString() + " ";
        }
        return list;
    }
}
