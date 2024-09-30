// * Definition for singly-linked list.
package com.leetcode;


public class LinkedListSum {
      int val;
      LinkedListSum next;
      LinkedListSum() {}
      LinkedListSum(int val) { this.val = val; }
      LinkedListSum(int val, LinkedListSum next) { this.val = val; this.next = next; }
      
      @Override
	public String toString() {
		return "LinkedListSum [val=" + val + ", next=" + next + "]";
	}
	public static void main(String[] args) {
          // Create the first linked list: 2 -> 4 -> 3 (represents the number 342)
          LinkedListSum l1 = new LinkedListSum(2);
          l1.next = new LinkedListSum(4);
          l1.next.next = new LinkedListSum(3);

          // Create the second linked list: 5 -> 6 -> 4 (represents the number 465)
          LinkedListSum l2 = new LinkedListSum(5);
          l2.next = new LinkedListSum(6);
          l2.next.next = new LinkedListSum(4);

          // Create a solution object
          Solution solution = new Solution();
          LinkedListSum result = solution.addTwoNumbers(l1, l2);

          // Print the result linked list
          printLinkedList(result); // Expected output: 7 -> 0 -> 8 (represents the number 807)
      }

      private static void printLinkedList(LinkedListSum node) {
          while (node != null) {
              System.out.print(node.val);
              if (node.next != null) {
                  System.out.print(" -> ");
              }
              node = node.next;
          }
          System.out.println();
      }
  }

class Solution {
    public LinkedListSum addTwoNumbers(LinkedListSum l1, LinkedListSum l2) {
        LinkedListSum headNode=new LinkedListSum(0);
        System.out.println(headNode.toString());
        LinkedListSum tail=headNode;
System.out.println(tail);
        int carry=0;
        while(l1!=null || l2!=null || carry !=0)
        {
            int first=(l1!=null)? l1.val:0;
            int second=(l2!=null)?l2.val:0;
            int sum=first+second+carry;
            int digitop=sum%10;
            carry=sum/10;

            LinkedListSum resultNode=new LinkedListSum(digitop);
            
            tail.next=resultNode;
            tail=tail.next;
            System.out.println(tail);
            System.out.println(tail.next);
            System.out.println(headNode);
            System.out.println(resultNode);
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        LinkedListSum result=headNode.next;
        headNode.next=null;
        return result;
    }
}



