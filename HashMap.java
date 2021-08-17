//Hashmap allows only one null key and multiple null values-statement
//Yes,its allows multiple null keys and goes to bucket 0 ,if already objects occur in bucket 0,then it will act as linked list that point to next node-my statement
//HashMap is non synchronized
//It is implementation of map interface

/*Important Features of HashMap
To access a value one must know its key. HashMap is known as HashMap because it uses a technique called Hashing. Hashing is a technique of converting a large String to small String that represents the same String. A shorter value helps in indexing and faster searches. HashSet also uses HashMap internally.
Few important features of HashMap are: 

HashMap is a part of java.util package.
HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
HashMap allows null key also but only once and multiple null values.
This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time. It is roughly similar to HashTable but is unsynchronized.
As it is told that HashMap is unsynchronized i.e. multiple threads can access it simultaneously. */

import java.util.HashMap;
public class MyClass {
    public static void main(String args[]) {
        
      HashMap<String,Integer> studentDet = new HashMap<>();
      studentDet.put("Ravina",1001);
      studentDet.put("Ravina",1002);
      studentDet.put("Vikram",1002);
      studentDet.put(null,null);
   

    System.out.println("Details: " +  studentDet.get("Ravina"));
    }
}