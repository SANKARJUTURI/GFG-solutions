/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution 
{
    public int getCount(Node root, int k) 
    {
        int res=0;
        int l=1;
        int t=0;
        Queue<Node>Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty())
        {
            int s=Q.size();
            for(int i=0;i<s;i++)
            {
                Node node=Q.poll();
                if(node.left==null && node.right==null)
                {
                    if(l+t<=k)
                    {
                        res++;
                        t+=l;
                    }
                    else return res;
                }
                if(node.left!=null)Q.offer(node.left);
                if(node.right!=null)Q.offer(node.right);
            }
            l++;
        }
        return res;
    }
}