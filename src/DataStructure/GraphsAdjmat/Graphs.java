package DataStructure.GraphsAdjmat;

public class Graphs {
    int[][] adjMat;
    int V;
    Graphs(int vertices){
        this.V=vertices;
        adjMat=new int[V][V];
    }
    void addEdge(int u,int v){
        adjMat[u][v]=1;
        adjMat[v][u]=1;
    }
    void printAdjmat(){
        System.out.println("Adjacency Matrix");
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class DriverCode{
    public static void main(String[] args) {
        Graphs g=new Graphs(6);
        g.addEdge(0,5);
        g.addEdge(5,4);
        g.addEdge(0,4);
        g.addEdge(0,1);
        g.addEdge(4,1);
        g.addEdge(4,3);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(3,2);
        g.printAdjmat();
    }
}

