package stack;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {

       private LinkedList<Employee>stack;

       public   LinkedListStack(){
           stack=new LinkedList<Employee>();
       }
       public  void push(  Employee employee){

            stack.push(employee);
       }
       public Employee pop(){

           return stack.pop();
       }
       public Employee peek(){

           return  stack.peek();
       }

       public  boolean isEmpity(){

           return stack.isEmpty();
       }

       public void  printStack(){
           ListIterator<Employee>employeeListIterator=stack.listIterator();
           while (employeeListIterator.hasNext()){
                 System.out.println(employeeListIterator.next());
           }
       }
}
