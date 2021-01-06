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
  }
}
