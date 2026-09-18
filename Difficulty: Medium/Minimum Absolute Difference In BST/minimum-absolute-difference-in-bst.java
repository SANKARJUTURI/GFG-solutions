/* The Node structure is defined as
 class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution 
{
    public int absDiff(Node root) 
    {
        List<Integer>L=new ArrayList<>();
        inOrder(root,L);
        int res=Integer.MAX_VALUE;
        for(int i=1;i<L.size();i++)res=Math.min(res,L.get(i)-L.get(i-1));
        return res;
    }
    private void inOrder(Node root,List<Integer>L)
    {
        if(root.left!=null)inOrder(root.left,L);
        L.add(root.data);
        if(root.right!=null)inOrder(root.right,L);
    }
}
