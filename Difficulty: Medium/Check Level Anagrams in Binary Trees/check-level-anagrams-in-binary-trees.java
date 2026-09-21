/* Structure of binary tree Node
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution 
{
    public boolean areAnagrams(Node root1, Node root2) 
    {
        Queue<Node>Q1=new LinkedList<>();
        Queue<Node>Q2=new LinkedList<>();
        Q1.offer(root1);
        Q2.offer(root2);
        while(!(Q1.isEmpty() && Q2.isEmpty()))
        {
            int s1=Q1.size();
            int s2=Q2.size();
            if(s1!=s2)return false;
            Map<Integer,Integer>M=new HashMap<>();
            for(int i=0;i<s1;i++)
            {
                Node node=Q1.poll();
                M.put(node.data,M.getOrDefault(node.data,0)+1);
                if(node.left!=null)Q1.offer(node.left);
                if(node.right!=null)Q1.offer(node.right);
            }
            for(int i=0;i<s2;i++)
            {
                Node node=Q2.poll();
                if(!M.containsKey(node.data))return false;
                int f=M.get(node.data);
                if(f>1)M.put(node.data,f-1);
                else M.remove(node.data);
                if(node.left!=null)Q2.offer(node.left);
                if(node.right!=null)Q2.offer(node.right);
            }
        }
        return Q1.isEmpty() && Q2.isEmpty();
    }
}
