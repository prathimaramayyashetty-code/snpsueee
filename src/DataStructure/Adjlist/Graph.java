package DataStructure.Adjlist;
import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>>Adjlist;
    Graph(int n){
        Adjlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            Adjlist.add(new ArrayList<>());
        }
    }
    void addEdge(int u,int v){
        Adjlist.get(u).add(v);
        Adjlist.get(v).add(u);
    }
    void printAdjlist(){
        for(int i=0;i<Adjlist.size();i++){
            System.out.println(i + " ->");
            for(int j:Adjlist.get(i)){
                System.out.print(j+ ", ");

            }
            System.out.println();
        }
    }
}
class DriverCode{
    public static void main(String[] args) {
        Graph g=new Graph(6);
        g.addEdge(0,5);
        g.addEdge(5,4);
        g.addEdge(0,4);
        g.addEdge(0,1);
        g.addEdge(4,1);
        g.addEdge(4,3);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(3,2);
        g.printAdjlist();

    }
}
