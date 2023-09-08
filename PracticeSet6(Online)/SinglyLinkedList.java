public class SinglyLinkedList {        
    class Node{                                 //Represent a node of the singly linked list 
        int data;    
        Node next;         
        public Node(int data) {    
            this.data = data;    
            this.next = null;    
        }    
    }         
    public Node head = null;                    //Represent the head and tail of the singly linked list 
    public Node tail = null;   
    //......................................................................................................      
    public void addNode(int data) {             //addNode() will add a new node to the list   
        Node newNode = new Node(data);          //Create a new node           
        if(head == null) {                      //Checks if the list is empty                
            head = newNode;                     //If list is empty, both head and tail will point to new node
            tail = newNode;             
        }    
        else {                  
            tail.next = newNode;  //newNode will be added after tail such that tail's next will point to newNode     
            tail = newNode;    //newNode will become new tail of the list 
        }    
    }      
    public void display() {     //display() will display all the nodes present in the list       
        Node current = head;   //Node current will point to head      
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            System.out.print(current.data + " ");   //Prints each node by incrementing pointer  
            current = current.next;    
        }    
        System.out.println();    
    }          
    public static void main(String[] args) {          
        SinglyLinkedList ll = new SinglyLinkedList();      
        ll.addNode(1);    //Add nodes to the list  
        ll.addNode(2);    
        ll.addNode(3);    
        ll.addNode(4);    
        ll.display();    //Displays the nodes present in the list
    }    
}  