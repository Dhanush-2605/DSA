
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(adjList, source, destination, visited);
    }

    private boolean dfs(List<List<Integer>> adjList, int source, int destination, boolean[] visited) {
        if (source == destination) {
            return true;
        }
        visited[source] = true;
        for (int neighbor : adjList.get(source)) {
            if (!visited[neighbor]) {
                if (dfs(adjList, neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
