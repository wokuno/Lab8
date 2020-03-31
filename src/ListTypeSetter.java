/**
 * A class that stores, and typesets, a list of items.
 */
public class ListTypeSetter {
    // array for storing items
    private String[] items;
    // tracks the number of items currently stored
    private int numItems;

    /**
     * Create a new typesetter
     * @param maxItems the maximum number of items this object can store before crashing.
     */
    public ListTypeSetter(int maxItems) {
        items = new String[maxItems];
        // HINT: initially, every element of items is null (not "null", just null, it's another special value)
        // If you see null printing, the code is printing a value that hasn't been initialized.
        numItems = 0;
    }

    /**
     * @return the current number of items stored in this object.
     */
    public int currentSize() {
        //return items.length;
        // this would return the maxItems no matter how many items are in the list
        int count = 0;
        for (int i = 0; i < items.length; i++){
            if (items[i] != null){
                count++;
            }
        }
        return count; // will always return the same value
    }

    /**
     * add an item to the end of the output list
     * This function will crash if you try to go over the maximum item count
     * @param input the new item.
     */
    public void addToList(String input) {
         // numItems++;
        // This needs to happen after item is added to list (start counting at 0)

        items[numItems] = input;
        numItems++; // java starts counting at 0
    }


    /**
     * reset's the internal storage of this object making it look like new.
     */
    public void reset() {
        // clear old data out of the array
        for(int i = 0; i < items.length; i++) {
            items[i] = null;
        }
        // doesnt reset numItems which will keep counting up otherwise
        numItems = 0;
    }

    /**
     * Actually typeset one of the elements in the list. This is protected to make it easier to override.
     * @param index the "index" into the list (count starting from 0)
     * @param text the text to typeset.
     * @return a string representing one item of the list.
     */
    protected String typeset(int index, String text) {
        return " * "+text;
    }

    /**
     * Create a string representation of the list. This should have good typesetting.
     */
    public String toString() {
        // So you're probably getting a warning about += for strings used in a loop
        // So it turns out that this is a FINE way to make strings, but it's inefficient for big strings
        // (end loop is O(n^2) instead of O(n) like it should be) I'm not counting this as a bug. It works.
        // If you want to use StringBuilder to fix it, go for it. Perhaps you can build better coding habits than I have.
        String retVal = "";
        for (int i = 0; i < numItems; i ++) {
            retVal += typeset(i, items[i]);
            if (i+1 < numItems) {
                retVal += "\n";
            }
        }
        return retVal;
    }
}
