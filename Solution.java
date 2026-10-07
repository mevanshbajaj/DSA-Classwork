public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode ta = headA;
        ListNode tb = headB;
        while(ta!=null){
            ta = ta.next;
            lenA++;
        }
        while(tb!=null){
            tb = tb.next;
            lenB++;
        }
        ta = headA;
        tb = headB;
        if(lenA > lenB){
            for(int i=0;i<lenA-lenB;i++){
                ta = ta.next;
            }
        }
            else{ //lenB>=lenA
             for(int i=0;i<lenB-lenA;i++){
                tb = tb.next;
            } 
            }
            while(ta != tb){
                ta = ta.next;
                tb = tb.next;
            }
            
        return ta;
    }
}