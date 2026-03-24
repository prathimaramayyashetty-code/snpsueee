package DataStructure;

import DataStructure.GraphsAdjmat.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphBFS {
    int V;

    GraphBFS(int v) {
        this.V = v;
    }

    ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>>adjlist){
        boolean[] visited=new boolean[V];
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int front=q.poll();
            ans.add(front);
            for(int i: adjlist.get(front)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Vertices and Edges:");
        int v=sc.nextInt();
        int e=sc.nextInt();

        ArrayList<ArrayList<Integer>>adjlist=new ArrayList<>();
        for(int i=0;i<v;i++){
            adjlist.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            System.out.println("Enter edge"+i+" ;");
            int u=sc.nextInt();
            int vertex=sc.nextInt();
            adjlist.get(u).add(vertex);
            adjlist.get(vertex).add(u);

        }


    }


}
