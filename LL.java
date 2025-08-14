class LL{
Node head;

class Node{
    String data;
    Node next;

    //consturctor
    Node(String data)
{
this.data = data;
this.next = null;

}
}
//add - first 
public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
head =newNode;
return;
    }
    newNode.next = head;
    head = newNode;
}

//add - last
public void addLast(String data){
    Node newNode = new Node(data);
    if(head == null){
head =newNode;
return;
    }
    Node currNode = head;
    while(currNode.next != null){
        currNode = currNode.next;
    }
    currNode.next = newNode;
    
}
//print
public void printList(){
    if(head == null){
        System.out.println("List is Empty");
        return;
    }
    Node currNode = head;
    while(currNode != null){
        System.out.print(currNode.data + "-->");
        currNode = currNode.next;
    }
   System.out.println("NULL");
}

//delete First
public void deleteFirst(){
    if(head == null){
        System.out.println("THE LIST IS EMPTY");
        return;
    }
    head = head.next;
}

//delete last
public void deleteLast(){
    if(head == null){
        System.out.println("THE LISTT IS EMPTY");
        return;
    }

    if(head.next == null){
        head = null;
        return;    }
    Node secondLast = head;
    Node lastNode = head.next;
    while(lastNode.next != null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }
    secondLast.next = null;
}

 public static void main(String [] args){
LL list = new LL();
list.addFirst("is");
list.addFirst("This");
list.addLast("my");
list.addLast("Code");
list.printList();
list.deleteFirst();
list.printList();
    }
}