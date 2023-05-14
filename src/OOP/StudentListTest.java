package OOP;

import java.util.LinkedList;

public class StudentListTest {
    public static void main(String[] args) {
        LinkedList<StudentLinkedList>List=new LinkedList<StudentLinkedList>(); //student linkedlist

        //creating student
        StudentLinkedList s1= new StudentLinkedList("Salma","BSC",456);
        StudentLinkedList s2= new StudentLinkedList("Salman","MSC",457);
        StudentLinkedList s3= new StudentLinkedList("Samiha","SSC",458);

        //adding student to the StudentLinkedList
        List.add(s1);
        List.add(s2);
        List.add(s3);

        //information display

        for (StudentLinkedList s:List) {
            System.out.println(s.id+" "+s.name+" "+s.status);

        }

    }
}
