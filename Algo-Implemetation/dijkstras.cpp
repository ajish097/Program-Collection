#include <iostream>
#include <limits.h>
#include <queue>
#include <vector>
using namespace std;
typedef pair<int,int> nPair;
std::vector<nPair> adj[10000];
int dist[10000];

void shortestPath(int src) {
	std::priority_queue<nPair> pq;
	std::fill(dist,dist+10000,INT_MAX);   //INT_MAX is a macro which return max value of integer
	pq.push(make_pair(0,src));
	dist[src] = 0;
	while (!pq.empty()) {
		int u = pq.top().second;
		pq.pop();
		for (auto itr = adj[u].begin(); itr != adj[u].end(); ++itr) {
			int v = itr->first;
			int weight = itr->second ;
			if (dist[v] > dist[u] + weight) {
				dist[v] =  dist[u] + weight;
				pq.push(make_pair(dist[v],v));
			}
		}
	}
}

int main(){
    int n,e;
    //cout<<"Enter the number of nodes and edges"<<endl;
    cin>>n>>e;
    //cout<<"Enter the edges and weights"<<endl;
    for (int i = 0; i < e; ++i) {
    	int u,v,wt;
    	cin>>u>>v>>wt;
    	adj[u].push_back(make_pair(v,wt));
    	adj[v].push_back(make_pair(u,wt));
    }
    shortestPath(0);
    for (int i = 0 ; i < n; ++i) {
    	cout<<i<<" "<<dist[i]<<endl;
    }
return 0;
}
/*
Enter the number of nodes and edges
8
14
Enter the edges and weights
0 1 4
0 7 8
3 5 14
1 7 11
1 2 8
7 6 1
7 8 7
2 8 2
8 6 6
2 5 4
6 5 2
2 3 7
3 4 9
5 4 10
OUTPUT
0 19
1 15
2 7
3 0
4 9
5 11
6 13
7 14
8 9
*/