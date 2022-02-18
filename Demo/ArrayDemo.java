public class ArrayDemo {

  /*
   * Arrays are 0-indexed
   * The capcity/length is a number of items, not a highest index
   * The highest index of an array is (length - 1)
   * 
   */
  public static void main(String[] args) {
    System.out.println("-----Array Deletions");
    int[] numArray = InitArray();

    printArray(numArray);

    /*
     * --------Insert Element At The Beginning Of Array------
     * To insert an element at the start of the Array, we will need to shift all
     * other elements in the Array to the right by one index to create space for new
     * element.
     * This is very costly operation since each of the existing elements has to be
     * shifted one step to the right.
     * 
     * The ned to shift everything implies that this is not a constant time
     * operation.
     * The time take for insertion at the beginning of an array will be proportional
     * to the lenght of the Array.
     * This is a linear time complexity - O(n) where n is the length of the array.
     */
    InsertElementAtTheBeginning(numArray);

    /*
     * Inserting Anywhere in the Array
     * Shift all the elements to the right before inserting the new element
     */

    numArray = InitArray();

    InsertingAtIndex(numArray);

  }

  private static int[] InitArray() {
    int numArray[] = new int[5];
    System.out.println("Capacity of array is " + numArray.length);

    for (int i = 0; i < numArray.length; i++) {
      numArray[i] = i + 1;
    }
    return numArray;
  }

  private static void InsertingAtIndex(int[] numArray) {
    // Insert 200 at index 2

    for (int i = numArray.length - 1; i > 2; i--) {
      numArray[i] = numArray[i - 1];
    }

    numArray[2] = 200;

    System.out.println("After inserting 200 at index 2");
    printArray(numArray);

  }

  private static void InsertElementAtTheBeginning(int[] numArray) {

    // Insert element 10 at the beginning of the array;

    for (int i = numArray.length - 1; i > 0; i--) {
      numArray[i] = numArray[i - 1];
    }
    numArray[0] = 10;
    System.out.println("After moving index: ");
    printArray(numArray);

  }

  private static void printArray(int[] numArray) {

    // This will iterated all the items in array
    // array start index is 0
    // array end index is length - 1
    for (int i = 0; i < numArray.length; i++) {
      System.out.println("Index " + i + " contains " + numArray[i]);
    }

  }

}