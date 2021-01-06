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
  }
}
