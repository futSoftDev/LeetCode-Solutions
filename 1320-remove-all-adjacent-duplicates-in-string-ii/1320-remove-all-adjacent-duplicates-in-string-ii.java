class Solution {
    class Pair{
        char ch;
        int count;
        Pair(char ch, int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Deque<Pair>q=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(!q.isEmpty()&& q.peek().ch==c){
                q.peek().count++;
                if(q.peek().count==k){
                    q.pop();
                }
            }else{
                q.push(new Pair(c,1));
            }
        }
        StringBuilder res=new StringBuilder();
        while(!q.isEmpty()){
            Pair p=q.removeLast();
            for(int i=0; i<p.count; i++){
                res.append(p.ch);
            }
        }
        return res.toString();
    }
}
