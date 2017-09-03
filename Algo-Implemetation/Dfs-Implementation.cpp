// This is an implementation of dfs using adjacency list.
// For further info please refer to this link https://www.hackerearth.com/practice/algorithms/graphs/graph-representation/tutorial/ 
#include <bits/stdc++.h>
using namespace std;
int visited[1000]= {0};
std::vector<int> v[1000];
void dfs(int x) {
	visited[x] = 1;
	cout<<x<<" ";
	for(int i = 0; i < v[x].size(); ++i) {
		if(visited[v[x][i]] == 0) {
			dfs(v[x][i]);                 
		}
	}

}
int main(){
	int N,E;
	int x,y;
	cin>>N>>E;
    for(int i = 0; i < E; ++i) {
    	cin>>x>>y;
    	v[x].push_back(y);
    	v[y].push_back(x);
    }
    //You can remove the comment to specify the starting node
    /*cout<<"Enter the node you wish to start with"<<endl;
    int head;
    cin>>head;*/
    dfs(x);    // dfs(head); 
return 0;
}

/*
INPUT
7
6
1 2
2 3
3 5
3 6
2 4
4 7
OUTPUT
4 2 1 3 5 6 7
*/