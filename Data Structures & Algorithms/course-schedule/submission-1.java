class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] pre:prerequisites){
            list.get(pre[1]).add(pre[0]);
        }
        int[] states = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!isDfs(i,states,list)){
              return false;
            }
        }
        return true;       
                
    }
    public boolean isDfs(int course, int[] state,List<List<Integer>> list){
        if(state[course]==1){
            return false;
        }
        if(state[course]==2){
            return true;
        }
        state[course]=1;
        for(int cour: list.get(course)){
            if(!isDfs(cour,state,list)){
                return false;
            }
        }
        state[course] =2;
        return true;
    }
}
