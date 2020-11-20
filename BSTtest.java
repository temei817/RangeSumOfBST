public class BSTtest
{
    public static void main(String[] args)
    {
        //TODO CHANGE CLASS AS NEEDED TO TEST CODE
        BST<Integer> tree = new BST<Integer>();

        int L = 1;
        int R = 5;
        for(int i=1; i < 10; i++)
        {
            tree.insert(i);

        }
        tree.print();
        tree.delete(3);
        System.out.println(tree.find(3));
        tree.print();
        System.out.println(tree.rangeSum(L, R));
    }
}
