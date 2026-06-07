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
    protected ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    protected ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    protected int compareTo(ListItem listItem) {
        return Integer.compare(this.value, listItem.getValue());
    }
}