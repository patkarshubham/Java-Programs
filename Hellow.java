import java.util.*;
public class Hellow{
  public static void main(String []args){
    List list = new ArrayList();
    list.add("One");
    list.add("Two");
    list.add(3);
    for(String s : list){
      System.out.print(s);
    }
  }
}