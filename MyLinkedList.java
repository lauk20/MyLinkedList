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

    return null;
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

  public void add(int index, String value){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index not valid: " + index);
    }

    Node currentNodeAtIndex = getNodeAtIndex(index);
    Node added = new Node(value);

    if (currentNodeAtIndex == null){
      added.setPrev(getNodeAtIndex(size() - 1));
      if (size() != 0){
        getNodeAtIndex(size() - 1).setNext(added);
      }
    }
    else{
      added.setPrev(currentNodeAtIndex.getPrev());
      added.setNext(currentNodeAtIndex);
      currentNodeAtIndex.setPrev(added);
    }

    if (index == 0){
      start = added;
    }
    else{
      if (index != size()){
        added.getPrev().setNext(added);
      }
    }

    if (index == size()){// || (index == 0 && size() == 0)){
      end = added;
    }

    size = size + 1;
  }

  public String get(int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index not valid: " + index);
    }

    return getNodeAtIndex(index).getData();
  }

  public String set(int index, String value){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index not valid: " + index);
    }

    String old = getNodeAtIndex(index).getData();
    getNodeAtIndex(index).setData(value);

    return old;
  }

  public String toString(){
    String result = "[";
    Node current = start;

    for (int i = 0; i < size(); i++){
      result = result + current.getData();
      current = current.getNext();

      if (current != null){
        result = result + ", ";
      }
    }

    result = result + "]";

    return result;
  }

  public String toStringReversed(){
    String result = "[";
    Node current = end;

    for (int i = 0; i < size(); i++){
      result = result + current.getData();
      current = current.getPrev();

      if (current != null){
        result = result + ", ";
      }
    }

    result = result + "]";

    return result;
  }

  public String remove(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }

    Node destroy = getNodeAtIndex(index);
    Node dPrev = destroy.getPrev();
    Node dNext = destroy.getNext();

    if (dPrev != null){
      dPrev.setNext(dNext);
    }
    else{
      start = dNext;
    }

    if (dNext != null){
      dNext.setPrev(dPrev);
    }
    else{
      end = dPrev;
    }

    size = size - 1;

    return destroy.getData();
  }

  public void extend(MyLinkedList other){
    Node last = end;

    if (last != null){
      if (other.size() > 0){
        Node otherFirst = other.getNodeAtIndex(0);

        last.setNext(otherFirst);
        otherFirst.setPrev(last);

        end = other.getNodeAtIndex(other.size() - 1);
      }
    }
    else{
      start = other.getNodeAtIndex(0);
      end = other.getNodeAtIndex(other.size() - 1);

      System.out.println(end);
    }

    size = size + other.size();
    other.size = 0;
    other.start = null;
    other.end = null;
  }
}
