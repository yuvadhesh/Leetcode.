class Solution{
    public ListNode middleNode(ListNode head){
        List<ListNode> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null) {
            list.add(temp);
            temp=temp.next;
        }
        int mid=list.size()/2;
        return list.get(mid);
    }
}