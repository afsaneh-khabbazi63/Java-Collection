
// This is the 21F Assignment 3 file named MyAnimalList.java

// Insert your solution code into this file as instructed in the information document. Hints have been provided.
// Insert your javadoc style comments to clearly and thoroughly explain your work.
// Ensure that you retain the names of all methods specifically mentioned in the instructions.
// Note that there are code inbetween the print statements (see assignment information).

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
/**
 * This is the 21F Assignment 3 file named MyAnimalList.java
 * Insert your solution code into this file as instructed in the information document. Hints have been provided. 
 *  Ensure that you retain the names of all methods specifically mentioned in the instructions.
 * Note that there are code inbetween the print statements (see assignment information).
 * @author afsaneh khabbazibasmenj
 *
 */
public class MyAnimalList {
	
	
	
	
	/**
	 * 
	 * @param args Command line arguments are not used by this program.
	 */

    public static void main(String[] args) {
    	
    	
    	System.out.println("21F CST8284");	
    	System.out.println("SAMPLE OUTPUT FILE FOR ASSIGNMENT 3");	
    	System.out.println();	
/**
 * add animals to list1
 */
      
        String[] animals = {"dog", "cat", "lion", "eagle", "monkey", "elephant"};

 /**
  * create LinkedLsit list1 
  */
        LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(animals));
/**
 *  add animals2 to list2
 */
        
        String[] animals2 = {"cow", "dolphin", "zebra", "dog", "goat", "snake"};


/**
 * create linklist list2
 */
        LinkedList<String> list2 = new LinkedList<String>(Arrays.asList(animals2));

 /**
  * Add the elements in list2 to list1 using the addAll method.
  */
        list1.addAll(list2);

   /**
    *  using printList() method to print out the updated content of list1 and then ensure the release of list2 resource.
    */
        printList(list1);
        list2.clear();
    

        System.out.printf("%nDisplaying names of animals in uppercase letters...%n");
    /**
     *   print out convert all the elements in list1 to uppercase by using convertToUppercase method
     */
        list1 = convertToUppercase(list1);
        printList(list1);

        System.out.printf("%nDeleting animals 4 to 6...%n");
    /**
     *  print out the updated output. by using deletSublist method
     */
        list1 = deleteSublist(list1);

        System.out.printf("%nHere is the current list of animals...%n");
        printList(list1);

    /**
     * Print list1 in reverse order using the printReversedList method.
     */
        System.out.printf("%nReversed List:...%n");
        list1 = printReversedList(list1);
/**
 * print sort the list to ensure that the contents are in alphabetical order.by using sort method
 */
        System.out.printf("%nSorted animals in alphabetical order...%n");
        list1 = sort(list1);
        printList(list1);
/**
 * using the printNonDuplicates method to eliminate all duplicated elements and then print out the final content of the list
 */
        System.out.printf("%nRemoving duplicate animals...%n");
        printNonDuplicates(list1);


    }
/**
 * sort mehtod to  sort the list to ensure that the contents are in alphabetical order
 * @param linkedList it is the list of arrays
 * @return linkedList
 */
    public static LinkedList<String> sort(LinkedList<String> linkedList){
        Collections.sort(linkedList);
        return linkedList;
    }

    

   /**
    * 
    * obtain sublist and use clear method to delete sublist items
    * @param linkedList it is the list of arrays
    * @return linkedList
    */
    public static LinkedList<String> deleteSublist(LinkedList<String> linkedList){
        linkedList.subList(4,7).clear();
        printList(linkedList);
        return linkedList;
    }


    /**
     *  Create a method named printList() and use it to print out the updated content of list1 and 
      *then ensure the release of list2 resource
     * @param linkedList it is the list of arrays
     */
    public static void printList(LinkedList<String> linkedList)
    {
        /*System.out.println("List is:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }*/
        System.out.println("List is:");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.printf("%s ",listIterator.next());
        }
        System.out.printf("%n%n");
    }

    /**
     * print the list in reverse order
     *  printReversedList method.
     * @param linkedList it is the list of arrays
     * @return linkList
     */
    public static LinkedList<String> printReversedList(LinkedList<String> linkedList){
        Collections.reverse(linkedList);
        printList(linkedList);
        return linkedList;
    }

    /**
     * locate String objects and convert to uppercase
     * Using a suitable method, convert all the elements in list1 to uppercase
     * @param linkedList it is the list of arrays                      
     * @return linkedList
     */
    public static LinkedList<String> convertToUppercase(LinkedList<String> linkedList){
        for (int i = 0; i < linkedList.size(); i++) {
            String u = linkedList.get(i).toUpperCase();
            linkedList.remove(i);
            linkedList.add(i,u);
        }
        return linkedList;
    }

     /**
      * locate String objects and eliminate duplicates
      *  use the printNonDuplicates method to eliminate all duplicated elements    
      * @param linkedList it is the list of arrays
      */
    public static void printNonDuplicates(LinkedList<String> linkedList){
        /*for (int i = 0; i < linkedList.size(); i++){
            String u = linkedList.get(i);
            for (int j = i+1; j < linkedList.size(); j++){
                if(u.equals(linkedList.get(j))){
                    linkedList.remove(j);
                }
            }
        }*/
        Set<String> set = new HashSet<String>(linkedList);
        System.out.print("Non-duplicates are: ");
        for (String s : set) {
            System.out.printf("%s ",s);
        }
    }

}

