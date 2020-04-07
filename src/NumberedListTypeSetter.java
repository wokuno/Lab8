/*  
    Meghana Woodruff    wood143
    William Okuno       Okuno006
    lab 8
*/

public class NumberedListTypeSetter extends ListTypeSetter {

    public NumberedListTypeSetter(int maxItems) {
        super(maxItems);
    }

    @Override
    protected String typeset(int index, String text) {
        return Integer.toString(index + 1) + ". " + text;
    }
}
