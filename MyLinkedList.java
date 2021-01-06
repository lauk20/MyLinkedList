public class MyLinkedList{
  private int size;
  private Node start, end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String value){
    Node newNode = new Node(value);

    if (size() == 0){
      start = newNode;
    }
    else{
      newNode.setPrev(end);
      end = newNode;
    }

    size = size + 1;

    return true;
  }

}
