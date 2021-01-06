public class MyLinkedList{
  private int size;
  private Node start, end;

  public MyLinkedList(){
    size = 0;
  }

  public int size(){
    return size;
  }

  private Node getNodeAtIndex(int index){
    Node current = start;

    for (int i = 0; i < index + 1; i++){
      if (i == index){
        return current;
      }

      current = current.getNext();
    }

    return current;
  }

  public boolean add(String value){
    Node newNode = new Node(value);

    if (size() == 0){
      start = newNode;
      end = newNode;
    }
    else{
      newNode.setPrev(end);
      end.setNext(newNode);
      end = newNode;
    }

    size = size + 1;

    return true;
  }

  public String get(int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index not valid: " + index);
    }

    return getNodeAtIndex(index).getData();
  }


}
