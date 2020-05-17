package stack;

public class MainStack {


        public static void main(String[] args) {


                LinkedListStack linkedListStack =new LinkedListStack();
                linkedListStack.push(new Employee("yehia","salah",100));
                linkedListStack.push(new Employee("mohamed","salah",100));
                linkedListStack.push(new Employee("fatma","salah",100));

              //  linkedListStack.printStack();
                linkedListStack.pop();
                linkedListStack.pop();
                linkedListStack.printStack();

        }
}

