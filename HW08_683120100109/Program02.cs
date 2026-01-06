using System.Collections.Generic;

namespace cs_HW08_02
{
    internal class Program
    {
        static void Main(string[] args)
        {
            MyList list = new MyList();

            list.InsertBack("Jack");
            list.InsertBack("John");
            list.InsertBack("Joe");
            list.InsertBack("Jane");
            list.InsertBack("Jim");

            Console.WriteLine("Size = " + list.Size());
            Console.WriteLine("Front = " + list.Front());
            Console.WriteLine("Back = " + list.Back());

            list.RemoveBack();
            Console.WriteLine("Back after remove = " + list.Back());
        }

        class Stack
        {
            protected List<string> data = new List<string>();
            public void Push(string item)
            {
                data.Add(item);
            }
            public string Pop()
            {
                string top = data[^1];
                data.RemoveAt(data.Count - 1);
                return top;
            }

            public string Peek()
            {
                return data[^1];
            }
            public int Size()
            {
                return data.Count;
            }
            public bool Empty()
            {
                return data.Count == 0;
            }
        }

        class MyList : Stack
        {
            public void InsertFront(string item)
            {
                data.Insert(0, item);
            }
            public void InsertBack(string item)
            {
                Push(item);
            }
            public string RemoveBack()
            {
                return Pop();
            }
            public string Front()
            {
                return data[0];
            }
            public string Back()
            {
                return Peek();
            }
        }
    }
}
