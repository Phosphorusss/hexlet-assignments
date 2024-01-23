package exercise;

// BEGIN
class LabelTag implements TagInterface{
    private String string;
    private TagInterface inputTag;

    public LabelTag(String string, TagInterface inputTag) {
        this.string = string;
        this.inputTag = inputTag;
    }

    @Override
    public String render() {
        return "<label>" + string + inputTag.render() + "</label>";
    }

    /*public static void main(String[] args) {
        TagInterface t1 = new InputTag("submit", "Save");
        TagInterface t2 = new LabelTag("Press Submit", t1);

        //System.out.println(t1.render());
        System.out.println(t2.render());
    }*/
}
// END
