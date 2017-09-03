//Read about Bi-partitie graph for more info.
// http://www.spoj.com/problems/BUGLIFE/
#include <bits/stdc++.h>
using namespace std;
int colour[2005]; 
std::vector<int> v[2005];
bool bfs(int x){
	std::queue <int> Q;
	colour[x] = 1;     
	Q.push(x);
	while(!Q.empty()) {
		int i = Q.front();
		//cout<<Q.front()<<" "<<colour[i]<<endl;
		Q.pop();
		for (std::vector<int>::iterator itr = v[i].begin(); itr != v[i].end(); ++itr) {
			if(colour[*itr] == -1) {
				colour[*itr] = 1 - colour[i];
				Q.push(*itr);
			}
			if(colour[i] == colour[*itr]) {
				//cout<<i<<*itr<<"*"<<endl;
				return false;
			}
		}
	}
	return true;
}

bool bfs_util(int vertices) {
	for (int i = 1; i <= vertices; ++i) {
		if (colour[i] == -1) {
			if (bfs(i) == false)
				return false;
		}
	}

	return true;
}

int main(){
	int t;
	cin>>t;
	for (int i = 1; i <= t; ++i) {
		std::fill(colour,colour+2005,-1);
		int edges,vertices;
		int v1,v2;
		//cout<<"Enter the number of vertices and edges"<<endl;
		cin>>vertices>>edges;
		//cout<<"Enter the edges"<<endl;
		for (int i = 1; i <= edges; ++i) {
			cin>>v1;
			cin>>v2;
			v[v1].push_back(v2);
			v[v2].push_back(v1);
		}
		cout<<"Scenario #"<<i<<":"<<"\n";
		if(bfs_util(vertices) == false)
			cout<<"Suspicious bugs found!"<<endl;
		else
			cout<<"No suspicious bugs found!"<<endl;

		for (int i = 0; i < 2005; ++i) {
			v[i].clear();
		}
	}

return 0;
}