import java.util.ArrayList;

public class NeatTester{
  public static String rAL(ArrayList<String> al){
    String result = "[";

    for (int i = al.size() - 1; i >= 0; i--){
      result = result + al.get(i);

      if (i != 0){
        result = result + ", ";
      }
    }

    return result + "]";
  }

  public static void main(String[] args){
    int testCases = 1000;
    ArrayList<String> expected = new ArrayList<String>();
    MyLinkedList diff = new MyLinkedList();

    System.out.println("Testing add()");
    System.out.println("add() head");
    expected.add("hello");
    diff.add("hello");
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("add() tail");
    expected.add("hello2");
    diff.add("hello2");
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }
    expected.add("hello3");
    diff.add("hello3");
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("Testing add(index)");
    System.out.println("add head");
    expected.add(0, "hello4");
    diff.add(0, "hello4");
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("add middle");
    expected.add(3, "hello5");
    diff.add(3, "hello5");
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("add tail");
    expected.add(expected.size() - 1, "hello6");
    diff.add(diff.size() - 1, "hello6");
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("Testing remove()");
    System.out.println("remove head");
    System.out.println(expected.remove(0).equals(diff.remove(0)));
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("remove middle");
    System.out.println(expected.remove(3).equals(diff.remove(3)));
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("remove tail");
    System.out.println(expected.remove(expected.size() - 1).equals(diff.remove(diff.size() - 1)));
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    expected = new ArrayList<String>();
    diff = new MyLinkedList();

    System.out.println("remove size 1");
    expected.add("hello");
    diff.add("hello");
    System.out.println(expected.remove(expected.size() - 1).equals(diff.remove(diff.size() - 1)));
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed())){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("Testing extend()");
    MyLinkedList diff2 = new MyLinkedList();
    ArrayList<String> expected2 = new ArrayList<String>();
    System.out.println("extend() both empty");
    diff.extend(diff2);
    expected.addAll(expected2);
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed()) || diff2.size() != 0){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("extend() 1 empty (one added to)");
    diff2.add("hello");
    expected2.add("hello");
    diff.extend(diff2);
    expected.addAll(expected2);
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed()) || diff2.size() != 0){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    diff.remove(0);
    expected.remove(0);
    expected2.remove(0);

    System.out.println("extend() 1 empty (one adding to)");
    diff.add("hello");
    expected.add("hello");
    diff.extend(diff2);
    expected.addAll(expected2);
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed()) || diff2.size() != 0){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("extend() both size 1");
    diff = new MyLinkedList();
    diff2 = new MyLinkedList();
    expected = new ArrayList<String>();
    expected2 = new ArrayList<String>();
    diff.add("hello");
    diff2.add("hello1");
    expected.add("hello");
    expected2.add("hello1");
    diff.extend(diff2);
    expected.addAll(expected2);
    expected2.remove(0);
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed()) || diff2.size() != 0){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("extend() one size 1, one being added size 2+");
    diff.remove(1);
    expected.remove(1);
    diff2.add("hello2");
    diff2.add("hello3");
    expected2.add("hello2");
    expected2.add("hello3");
    diff.extend(diff2);
    expected.addAll(expected2);
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed()) || diff2.size() != 0){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

    System.out.println();

    System.out.println("extend() one size 1, one adding size 2+");
    diff = new MyLinkedList();
    diff2 = new MyLinkedList();
    expected = new ArrayList<String>();
    expected2 = new ArrayList<String>();
    diff.add("hello");
    diff.add("hello1");
    expected.add("hello");
    expected.add("hello1");
    diff2.add("hello3");
    expected2.add("hello3");
    diff.extend(diff2);
    expected.addAll(expected2);
    if (!expected.toString().equals(diff.toString()) || !rAL(expected).equals(diff.toStringReversed()) || diff2.size() != 0){
      System.out.println("NOPE");
    }
    else{
      System.out.println("PASSED");
    }

  }
}
