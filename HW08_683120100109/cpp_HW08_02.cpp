#include <iostream>
#include <vector>
using namespace std;

class Stack {
protected:
    vector<string> data;
public:
    void push(string item) {
        data.push_back(item);
    }

    string pop() {
        string top = data.back();
        data.pop_back();
        return top;
    }

    string peek() {
        return data.back();
    }

    int size() {
        return data.size();
    }

    bool empty() {
        return data.empty();
    }
};

class List : public Stack {
public:
    void insertFront(string item) {
        data.insert(data.begin(), item);
    }

    void insertBack(string item) {
        push(item);
    }

    string front() {
        return data.front();
    }

    string back() {
        return peek();
    }
};


int main()
{
    List myList;

    myList.insertBack("Jack");
    myList.insertBack("John");
    myList.insertFront("Jane");

    cout << "Size = " << myList.size() << endl;
    cout << "Front = " << myList.front() << endl;
    cout << "Back = " << myList.back() << endl;

    return 0;
}
