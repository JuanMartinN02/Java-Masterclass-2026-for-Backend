public class Node extends ListItem{


    public Node(int value) {
        super(value);
    }

    @Override
    protected ListItem next() {
        return this.rightLink;
    }

    @Override
    protected ListItem previous() {
        return this.leftLink;
    }

    @Override
    protected ListItem setNext(int value) {
        this.rightLink.setValue(value);
        return this.rightLink;
    }

    @Override
    protected ListItem setPrevious(int value) {
        this.leftLink.setValue(value);
        return this.leftLink;
    }

    @Override
    protected int compareTo(ListItem listItem) {
        return Integer.compare(this.value, listItem.getValue());
    }
}
