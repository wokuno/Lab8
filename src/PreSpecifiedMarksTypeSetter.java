/*  
    Meghana Woodruff    wood143
    William Okuno       Okuno006
    lab 8
*/
public class PreSpecifiedMarksTypeSetter extends ListTypeSetter {

    private String[] labels;
    public PreSpecifiedMarksTypeSetter(String[] label) {
        super(label.length);
        labels = label;
    }

    @Override
    protected String typeset(int index, String text) {
        return labels[index]+ " " + text;
    }
}
