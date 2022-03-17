//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        Node newhead = new Node(0);
        Node currentnode = newhead;
        
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                currentnode.next = head1;
                head1 = head1.next;
            }
            else{
                currentnode.next = head2;
                head2 = head2.next;
            }
            currentnode = currentnode.next;
        }
        if(head1 != null){
            currentnode.next = head1;
        }
        if(head2 != null){
            currentnode.next = head2;
        }
        return newhead.next;
   } 
}
