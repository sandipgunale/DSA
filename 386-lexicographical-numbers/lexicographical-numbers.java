class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
             lexi(i, n, l);
        }
       return l;
    }

    public void lexi(int current, int n, List<Integer> l){
        
        if(current > n){
            return;
        }
        l.add(current);
        for(int j = 0; j <= 9; j++){
            lexi(current * 10 + j, n, l);
        }
    }
}