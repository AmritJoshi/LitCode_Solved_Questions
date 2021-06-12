import java.util.*;
class Graph{
    private LinkedList<Integer> adj[];
    public Graph(int v){
        adj=new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i]= new LinkedList<>();
        }
    }

    public void addedge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public int bfs(int source,int destination){
        boolean vis[]=new boolean[adj.length];
        int parent[]= new int[adj.length];
        Queue<Integer> q=new LinkedList<>();

        q.add(source);

        parent[source]=-1;
        vis[source]=true;

        while(!q.isEmpty()){
            int cur=q.poll();
            if(cur==destination)
                break;
            
            for(int neighbour : adj[cur]){
                if(!vis[neighbour]){
                    q.add(neighbour);
                    parent[neighbour]=cur;

                }
            }
        }
        int cur=destination;
        int distance=0;
        while (parent[cur]!=-1){
            System.out.print(cur+"->");
            cur=parent[cur];
            distance++;
        }
        return distance;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of vertices and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Graph graph=new Graph(v);
        for(int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();

            graph.addedge(source,destination);
        }
        System.out.println("enter source and destination");
        int source=sc.nextInt();
        int destination=sc.nextInt();
        int d= graph.bfs(source, destination);
        System.out.println("total nodes between source and destination"+d);
        sc.close();
    }
}