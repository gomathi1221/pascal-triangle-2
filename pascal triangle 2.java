class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        int n=rowIndex;
        int i=0;
   
    for(i=0;i<=n;i++){
        List<Integer> w=new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0||j==i){
                w.add(1);
            }
            else{
            List<Integer> prev=list.get(i-1);
            w.add(prev.get(j)+prev.get(j-1));
            }
        }
        list.add(w);
    }
 
    List<Integer> l=list.get(list.size()-1);
       return l;
    
   
   
    }
}