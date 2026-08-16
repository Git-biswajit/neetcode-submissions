class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] prerequisite:prerequisites){
            int cour = prerequisite[0];
            int pre = prerequisite[1];
            graph.get(pre).add(cour);
        }
        int[] state = new int[numCourses];
        for(int course=0;course<numCourses;course++){
            if(hasCycle(graph,state,course)){
                return false;
            }
        }
        return true;
        
    }
    public boolean hasCycle(List<List<Integer>> graph,int[] state, int course){
        if(state[course]==1){
            return true;
        }
        if(state[course]==2){
            return false;
        }
        state[course]=1;
        for(int prerequisite:graph.get(course)){
            if(hasCycle(graph,state,prerequisite)){
                return true;
            }
        }
        state[course] = 2;
        return false;
    }
}
