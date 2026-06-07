public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root) {
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
            } else if (comparison > 0 && curr.rightLink == null) {
                curr.setNext(item);
                return true;
            }else if (comparison < 0 && curr.leftLink == null) {
                curr.setPrevious(item);
                return true;
            }else if (comparison < 0){
                curr = curr.previous();
            } else{
                curr = curr.next();
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse() {
        perfomTraverse(root);
    }

    private void perfomTraverse(ListItem item){
        if (item != null){
            perfomTraverse(item.previous());
            System.out.print(item.value + " --> ");
            perfomTraverse(item.next());
        }
    }
}
