/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    /**
    The line that switches to the new head (C) is:
    newHead = reverseList(head.next);
    This line does not change head itself. 
    head is still node A in the outermost call.
    What changes is that the returned value (newHead) 
    is passed back up from the deepest recursive call — 
    and it always stays pointing to node C.

    walk: newHead = reverseList(head.next);
    -> Imagine we're in this stack:
    reverseList(A) calls
        reverseList(B) calls
        reverseList(C) returns C
    reverseList(B) sets newHead = C
reverseList(A) sets newHead = C

-> So in reverseList(A), head = A, but newHead = C 
because it was returned from the deeper recursive call.

So you’re right:

head is still A

But we’re returning the newHead, and that’s the key: the return value carries C all the way up.

That’s why this line: return newHead; <- is what ensures that C becomes the final returned head.

    */
    public ListNode reverseList(ListNode head) {
        //Think of recursion like passing a message upward. 
        //At the bottom of the call stack, you “discover” node C, 
        //and every function above just keeps passing it 
        //upward without changing it.
        if(head == null){
            return null;
        }

        ListNode newHead = head;
        if(head.next != null){
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;
        
    }
}
