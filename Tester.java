public class Tester{
  public static void main(String[] args){
    Node A = new Node("1");
    Node B = new Node("2");
    Node C = new Node("3");
    System.out.println(A.getData());
    System.out.println(B.getData());
    System.out.println(C.getData());
    System.out.println(A.getData());
    A.setNext(B);
    System.out.println(A.getNext().getData());
    B.setPrev(A);
    A.setData("Hello");
    System.out.println(B.getPrev().getData());

    System.out.println();

    MyLinkedList A1 = new MyLinkedList();
    System.out.println(A1.size());
    A1.add("Yup");
    System.out.println(A1.size());
    A1.add("2");
    A1.add("3");
    A1.add("4");
    A1.add("5");
    System.out.println(A1.get(0));
    System.out.println(A1.get(2));
    System.out.println(A1.size());
    System.out.println(A1.get(4));
    A1.add(0, "FirstYup");
    System.out.println(A1.get(0));
    System.out.println(A1.get(1));
    A1.add(A1.size(), "LastYup");
    System.out.println(A1.get(6));
    A1.add(1, "SecondYup");
    System.out.println(A1.get(1));

    System.out.println();

    MyLinkedList A2 = new MyLinkedList();
    A2.add("1");
    A2.add("3");
    A2.add("3");
    A2.add("4");
    A2.add("5");
    System.out.println(A2.set(1, "2"));
    System.out.println(A2.set(0, "5"));
    System.out.println(A2.set(4, "1"));
    System.out.println(A2.get(1));
    System.out.println(A2.get(0));
    System.out.println(A2.get(4));
    System.out.println(A2.toString());

    System.out.println();

    MyLinkedList A3 = new MyLinkedList();
    for (int i = 0; i < 100; i++){
      A3.add(i + "");
    }
    System.out.println(A3);
    System.out.println(A3.toStringReversed());

    System.out.println();

    MyLinkedList A11 = new MyLinkedList();
    //System.out.println(A11.get(0));

    MyLinkedList A12 = new MyLinkedList();
    A12.add("1");
    A12.add("2");
    System.out.println(A12);
    System.out.println(A12.remove(1));
    System.out.println(A12);
    A12.add("2");
    System.out.println(A12);
    A12.add("3");
    System.out.println(A12);
    System.out.println(A12.remove(1));
    System.out.println(A12);
    System.out.println(A12.remove(0));
    System.out.println(A12);
    System.out.println(A12.remove(0));
    System.out.println(A12);

    System.out.println();

    MyLinkedList A13 = new MyLinkedList();
    MyLinkedList A14 = new MyLinkedList();
    A13.extend(A14);
    System.out.println(A13);

    MyLinkedList a = new MyLinkedList();
    MyLinkedList b = new MyLinkedList();
    for(int i = 0; i < 10; i++){
      if(i < 5){
        a.add(i+"");
      }else{
        b.add(i+"");
      }
    }
    System.out.println();
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());

    a.extend(b);
    System.out.println("A:"+a+a.size());
    System.out.println("B:"+b+b.size());
    System.out.println("A reversed:"+a.toStringReversed()+a.size());
    System.out.println("B reversed:"+b.toStringReversed()+b.size());

    System.out.println();

    MyLinkedList m = new MyLinkedList();
    m.add(0, "hello");
  }
}
