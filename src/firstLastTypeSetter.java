public class FirstLastTypeSetter extends ListTypeSetter{
    public FirstLastTypeSetter(int maxItems) {
        super(maxItems);
    }

    @Override
    protected String typeset(int index, String text) {
        if (index == 0 && super.currentSize() == 1) {
            return "(only): " + text;
        } else if (index == 0){
            return "(first): " + text;
        } else if (index == super.currentSize() - 1) {
            return "(last): " + text;
        } else {
            return super.typeset(index, text);
        }
    }
}
