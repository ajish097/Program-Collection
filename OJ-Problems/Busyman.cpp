/*This is a problem which can be solved by greedy approach.Please refer to CLSR for detailed explaination.*/
//http://www.spoj.com/problems/BUSYMAN/
#include <bits/stdc++.h>
using namespace std;
struct interval{
	int s;
	int f;
};

bool comp(const interval &lhs ,const interval &rhs) {
    if (lhs.f == rhs.f) {
        return lhs.s < rhs.s;
    }
    return lhs.f < rhs.f;
}

void activity_selector(interval *inter, int n) {
    int max_activity = 1;
    int k = 0;
    for (int m = 1; m < n; ++m) {
        if (inter[m].s >= inter[k].f) {
            max_activity += 1;
            k = m;
        }
    }
    cout<<max_activity<<endl;
}

int main()
{
    int n;
    interval inter[100005];
    int t;
    cin>>t;
    while (t--) {
        scanf("%d",&n);
        for (int i = 0; i < n; i++) {
            scanf("%ld",&inter[i].s);
            scanf("%ld",&inter[i].f);
        } 
        std::sort(inter,inter+n,comp);
        activity_selector(inter, n);
    }
    return 0;
}

/*
Sample Input: (empty lines just for clarity)
3
3
3 9
2 8
6 9

4
1 7
5 8
7 8
1 8

6
7 9
0 10
4 5
8 9
4 10
5 7

Sample Output:
1
2
3
*/
