public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected int value;

    public ListItem(int value) {
        this.value = value;
    }

    protected abstract ListItem next();

    protected abstract ListItem previous();

    protected abstract ListItem setNext(int value);

    protected abstract ListItem setPrevious(int value);

    protected abstract int compareTo(ListItem listItem);

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
