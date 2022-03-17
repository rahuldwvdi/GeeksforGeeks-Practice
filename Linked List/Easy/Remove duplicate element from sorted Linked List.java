//https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1#

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        if(head==null) return head;
	      Node currentnode = head;
	      while(currentnode.next!=null){
	          if(currentnode.data == currentnode.next.data){
	              currentnode.next = currentnode.next.next;
	          }
	          else{
	              currentnode = currentnode.next;
	          }
	      }
	      return head;
    }
}
