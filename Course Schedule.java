class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] prerequisite:prerequisites){
            adjList.get(prerequisite[1]).add(prerequisite[0]);
        }

        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0 && hasCycle(i,visited,adjList)){
                return false;
            }
        }
        return true;
    }
    static boolean hasCycle(int node,int[] visited,List<List<Integer>> adjList){
        visited[node]=1;
        for(int n:adjList.get(node)){
            if(visited[n]==0){
                if(hasCycle(n,visited,adjList)){
                return true;
                }
            }
            if(visited[n]==1){
                return true;
            }
        }
        visited[node]=2;
        return false;
    }
}
