#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> nPair;
std::priority_queue<pair<int,nPair>,std::vector<pair<int,nPair> >,std::greater<pair<int,nPair> > > p;
int parent[10005],Rank[10005];
int Find(int node) {
    if(parent[node] != node)
        return Find(parent[node]);

    return node;
}

int Union(int x,int y) {
    int xroot = Find(x);  //returns parent of x
    int yroot = Find(y);

    if(xroot == yroot)   //edge not selected
        return 0;

    if(Rank[xroot] < Rank[yroot])
        parent[xroot] = yroot;
    else if(Rank[xroot] > Rank[yroot])
        parent[yroot] = xroot;
    else {
        parent[xroot] = yroot;
        Rank[yroot]++;
    }
    return p.top().first;   // return the weight
}
int main(){
    int t;
    cin>>t;
    while(t--) { 
        int price,n,edges,min_cost = 0;
        cin>>price>>n>>edges;
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
            Rank[i] = 0;
        }
        for (int i = 0; i < edges; ++i) {
            int u,v,wt;
            cin>>u>>v>>wt;
        	p.push(make_pair(wt,make_pair(u,v)));
        }
        for (int i = 0; i < edges; ++i) {
            int u = p.top().second.first;
            int v = p.top().second.second;
            min_cost += Union(u,v);
        	p.pop();
        }
        cout<<min_cost*price;
    }
return 0;
}
