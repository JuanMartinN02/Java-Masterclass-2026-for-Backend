public class MyLinkedList implements NodeList {

    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem curr = this.root;
        while (curr != null) {
            int comparison = curr.compareTo(item);

            if (comparison == 0) {
                return false;
            } else if (comparison > 0) {
                item.setNext(curr);
                item.setPrevious(curr.previous());
                if (curr.previous() != null) {
                    curr.previous().setNext(item);
                } else {
                    this.root = item;
                }
                curr.setPrevious(item);
                return true;
            }

            if (curr.next() == null) {
                curr.setNext(item);
                item.setPrevious(curr);
                return true;
            }
            curr = curr.next();
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse() {
        if (root == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println();
        ListItem curr = root;
        while (curr != null) {
            System.out.print(curr.getValue() + " --> ");
            curr = curr.next();
        }
    }

}