class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {
        // code here
        if(Q == 1){
            A.add(Query.get(0), Query.get(1));
            return A;
        }
        else if(Q == 2){
            int target = Query.get(0);
            int index = -1;
            for (int i=A.size()-1; i>=0; i--) {
                if (A.get(i).equals(target)) {
                    index = i;
                    break;
                }
            }
            ArrayList<Integer> result = new ArrayList<>();
            result.add(index);
            return result;
        }
        else{
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }
    }
}