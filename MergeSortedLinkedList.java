package EndModuleExam;

public class MergeSortedLinkedList {

    public static Node merge(Node head1, Node head2)
        {
            Node ptr1 = head1;
            Node ptr2 = head2;
            Node dummyNode = new Node();
            Node ptr3 = dummyNode;

            while(ptr1 != null && ptr2 != null)
                {
                    if(ptr1.data < ptr2.data)
                        {
                            ptr3.next = ptr1;
                            ptr1 = ptr1.next;

                        }
                    else
                        {
                            ptr3.next = ptr2;
                            ptr2 = ptr2.next;
                        }
                    ptr3 = ptr3.next;
                }


            while (ptr1 != null)
                {
                    ptr3.next = ptr1;
                    ptr1 = ptr1.next;
                    ptr3 = ptr3.next;
                }
            while (ptr2 != null)
            {
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
                ptr3 = ptr3.next;
            }

            return dummyNode.next;

        }


    public static void main(String[] args) {
        Node head1=new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);

        Node head2=new Node(7);
        head2.next=new Node(15);
        head2.next.next=new Node(25);

        Node  ress = merge(head1,head2);


    }

}


