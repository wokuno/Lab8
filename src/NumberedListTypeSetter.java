public class NumberedListTypeSetter extends ListTypeSetter {

    public NumberedListTypeSetter(int maxItems) {
        super(maxItems);
    }

    @Override
    protected String typeset(int index, String text) {
        return Integer.toString(index + 1) + ". " + text;
    }
}
