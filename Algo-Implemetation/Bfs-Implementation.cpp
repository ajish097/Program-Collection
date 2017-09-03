// This is an implementation of bfs using adjacency list and Queue data structure.
//https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/tutorial/
#include <bits/stdc++.h>
using namespace std;
bool visited[1000]; 
std::vector<int> v[1000];
void bfs(int x){
	std::queue <int> Q;
	visited[x] = true;     
	Q.push(x);
	while(!Q.empty()) {
		int i = Q.front();
		cout<<Q.front()<<" ";
		Q.pop();
		for (std::vector<int>::iterator itr = v[i].begin(); itr != v[i].end(); ++itr) {
			if(!visited[*itr]) {
				Q.push(*itr);
				visited[*itr] = true;
			}
		}
	}
}
int main(){
	std::fill(visited,visited+1000,false);
	int n;
	int v1,v2;
	cout<<"Enter the number of elements"<<endl;
	cin>>n;
	cout<<"Enter the edges"<<endl;
	for (int i = 0; i < n; ++i) {
		cin>>v1;
		cin>>v2;
		v[v1].push_back(v2);
		v[v2].push_back(v1);
	}
	int head;
	cout<<"Enter the starting node";
	cin>>head;
	bfs(head);
return 0;
}

/*
INPUT
Enter the number of elements
9
Enter the edges
0 5
5 7
0 6
5 6
6 8
5 8
7 8
7 2
8 2
Enter the starting node 0
OUTPUT
0 5 6 7 8 2
*/