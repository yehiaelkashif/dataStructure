package stack;

import java.util.EmptyStackException;

public class StackArray {

      Employee stack[];
      int top=0;


      public  StackArray(int capacity){
          stack=new  Employee [capacity];
      }

      public  void  push(Employee employee){
              if (top==stack.length){
                 // resize array
                  Employee []newArray= new Employee[2*stack.length];
                   System.arraycopy(stack,0,newArray,0,stack.length);
                   stack=newArray;
              }
              stack[top++]=employee; }

      public Employee pop(){
          if (isEmpity()){ throw new EmptyStackException(); }
             Employee employee  = stack[--top];
          stack [top]=null;
          return employee;
      }
      public  Boolean isEmpity(){ return  top==0; }

  public    int   stackSize(){

           return  top;
  }

   public  void  printStacck(){

          for (int i=top-1;  i>=0;  i--){
              System.out.println(stack[i]);
       }



   }
   public  Employee peek(){
       if (isEmpity()){ throw new EmptyStackException(); }

       return  stack[top-1];
   }

}
