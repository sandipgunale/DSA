class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        para("", 0, 0, n, list);
        return list;
    }

    public static void para(String ans, int o, int c, int n,  List<String> list){
        if(o == c && c == n){
            list.add(ans);
            return;
        }
        if(o > n || c > n){
            return;
        }
        para(ans+"(", o+1, c, n, list);
        if(o > c){
            para(ans +")", o, c+1, n, list);
        }
    }
}