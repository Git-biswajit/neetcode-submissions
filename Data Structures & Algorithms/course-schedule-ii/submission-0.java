class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] prerequisite:prerequisites){
            int cour = prerequisite[0];
            int pre = prerequisite[1];
            graph.get(pre).add(cour);
        }
        List<Integer> result = new ArrayList<>();
        int[] states = new int[numCourses];
        for(int course =0;course<numCourses;course++){
            if(hasCycle(graph,course,states,result)){
                return new int[0];
            }
        }
        Collections.reverse(result);
        int n = result.size();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
         res[i] = result.get(i);
        }
        return res;        
    }
    public boolean hasCycle(List<List<Integer>> graph, int course,int[] states,List<Integer> result){
        if(states[course]==1){
            return true;
        }
        if(states[course]==2){
            return false;
        }
        states[course]=1;
        for(int prerequisite: graph.get(course)){
            if(hasCycle(graph,prerequisite,states,result)){
                return true;
            }
        }
        states[course]=2;
        result.add(course);
        return false;
    }
}
