/*Solution for PT07Y - Is it a tree .*/
//http://www.spoj.com/problems/PT07Y/
#include <bits/stdc++.h>
using namespace std;
#define MAX 20010
#define NODES 10010

int graph[MAX][2],arr[10010];

int find_set(int val)
{
    if(arr[val]==-1)
        return val;
    return find_set(arr[val]);
}

int main()
{
    int N,M,x,y;
    bool flag = true;
    scanf("%d%d",&N,&M);
    for(int i=0;i<M;i++)
        scanf("%d%d",&graph[i][0],&graph[i][1]);

    memset(arr,-1,sizeof(int)*NODES);

    for(int i=0;i<M;i++)
    {
        x=find_set(graph[i][0]);
        y=find_set(graph[i][1]);

        if(x==y)
        {
            flag=false;
            break;
        }
        arr[x]=y;
    }

    if(flag)
        cout<<"YES";
    else
        cout<<"NO";
    return 0;

}
/*
Input:
3 2
1 2
2 3

Output:
YES
*/
