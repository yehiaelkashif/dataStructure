package LinkedList;

public class EmployeeLinkedList {

    private  EmployeeNode head;
    private   int  size;


    public   void  addToFront( Employee employee){

        EmployeeNode node =new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }



      public  void  printList(){
        EmployeeNode current=head;
          System.out.print("head ->");
          while (current!=null){
              System.out.print("->");
              System.out.print(current);
              current=current.getNext();
          }
          System.out.println("null");

      }

    public  int  getSize(){ return size; }

    public  Boolean  isEmpty(){ return  head==null; }


    public  EmployeeNode removeFromFront(){
        if (isEmpty()) {
           return null; }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }


}
