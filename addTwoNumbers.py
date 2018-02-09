# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """

        ListNode c1 = l1
        ListNode c2 = l2
        ListNode sentinel = new ListNode(0)
        ListNode d = sentinel
        sum = 0
        while c1 != null || c2 != null
            sum /= 10
            if c1 != null
                sum += c1.val
                c1 = c1.next

            if c2 != null
                sum += c2.val
                c2 = c2.next
            d.next = new ListNode(sum % 10)
            d = d.next
        if sum / 10 == 1
            d.next = new ListNode(1)
        return sentinel.next
