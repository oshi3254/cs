class Stack:
    def __init__(self):
        self.data = []

    def push(self, item):
        self.data.append(item)

    def pop(self):
        return self.data.pop()

    def peek(self):
        return self.data[-1]

    def size(self):
        return len(self.data)

    def empty(self):
        return len(self.data) == 0

class List(Stack):
    def insertFront(self, item):
        self.data.insert(0, item)

    def insertBack(self, item):
        self.push(item)

    def insert(self, index, item):
        self.data.insert(index, item)

    def remove(self, index):
        return self.data.pop(index)

    def removeBack(self):
        return self.pop()

    def front(self):
        return self.data[0]

    def back(self):
        return self.data[-1]
################################################
st = List()
st.insertBack("Jack")
st.insertBack("John")
st.insertBack("Joe")
st.insertBack("Jane")
st.insertBack("Jim")

print(st.size())      
print(st.front())     
print(st.back())     
st.remove(3)         
print(st.back()) 
