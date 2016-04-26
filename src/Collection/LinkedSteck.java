package Collection;

/**
 * Created by привет on 13.04.2016.
 */
public class LinkedSteck<T> {
    private static class Node<U>{
        U item;
        Node<U>next;
        public Node() {
            item= null;
            next= null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item==null && next==null;
        }
    }
private Node<T> top =new Node<>();
    public void push(T item){
        top = new Node<T>(item,top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end())
            top=top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedSteck<String> lss = new LinkedSteck<>();
        LinkedSteck<String> lss1 = new LinkedSteck<>();
        String f = "v";

            lss.push(f);
            lss1.push(f);

            String s1;
            while ((s1=lss.pop()) != null){
                System.out.println(s1);
            }

        }

}
