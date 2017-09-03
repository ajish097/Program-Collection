//This is solution to find the diameter of a tree.
//http://www.spoj.com/problems/PT07Z/
#include <bits/stdc++.h>
using namespace std;
bool visited[10005]; 
std::vector<int> v[10005];
int newHead;
int bfs(int x) {
    int level[10005];
    std::queue <int> Q;
    int i,longestPath;
    level[x] = 0;
    visited[x] = true;     
    Q.push(x);
    while(!Q.empty()) {
          newHead = i = Q.front();
          Q.pop();
          for (std::vector<int>::iterator itr = v[i].begin(); itr != v[i].end(); ++itr) {
              if(!visited[*itr]) {
                Q.push(*itr);
                visited[*itr] = true;
                longestPath = level[*itr] = level[i]+1;
              }
          }
    }
  return longestPath;
}
int main(){
    std::fill(visited,visited+10005,false);
    int n;
    int v1,v2;
    cin>>n;
    if(n == 0)
      cout<<0;
    for (int i = 0; i < n-1; ++i) {
        cin>>v1;
        cin>>v2;
        v[v1].push_back(v2);
        v[v2].push_back(v1);
    }
    bfs(v1);
    std::fill(visited,visited+10005,false);
    cout<<bfs(newHead);
return 0;
}

/*
INPUT
7
1 2
1 3
2 4
2 5
4 6
5 7
OUTPUT
4
*/