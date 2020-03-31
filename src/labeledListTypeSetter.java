public class LabeledListTypeSetter extends ListTypeSetter {
    private String label = "";
    public LabeledListTypeSetter(String string, int maxItems) {
        super(maxItems);
        label = string;
    }

    public void setLabel(String string){
        label = string;
    }

    @Override
    public String toString() {
        String temp = label + "\n";
        for (int i = 0; i < label.length(); i++){
            temp += "=";
        }
        temp += "\n";
        temp += super.toString();
        return temp;
    }
}
