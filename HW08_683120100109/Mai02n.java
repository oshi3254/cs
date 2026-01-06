import java.util.ArrayList;

class Stack {
    protected ArrayList<String> data = new ArrayList<>();

    public void push(String item) {
        data.add(item);
    }

    public String pop() {
        return data.remove(data.size() - 1);
    }

    public String peek() {
        return data.get(data.size() - 1);
    }

    public int size() {
        return data.size();
    }

    public boolean empty() {
        return data.isEmpty();
    }
}

class MyList extends Stack {

    public void insertFront(String item) {
        data.add(0, item);
    }

    public void insertBack(String item) {
        push(item);
    }

    public String removeBack() {
        return pop();
    }

    public String front() {
        return data.get(0);
    }

    public String back() {
        return peek();
    }
}

public class Main {
    public static void main(String[] args) {
        MyList lst = new MyList();

        lst.insertBack("Jack");
        lst.insertBack("John");
        lst.insertBack("Joe");
        lst.insertBack("Jane");
        lst.insertBack("Jim");

        System.out.println("Size = " + lst.size());
        System.out.println("Front = " + lst.front());
        System.out.println("Back = " + lst.back());
    }
}
