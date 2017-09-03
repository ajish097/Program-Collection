/*This program uses hashing concept to store the occurence of a number*/
//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/memorise-me/
#include <bits/stdc++.h>
using namespace std;
int main(){
    int t,x;
    int arr[100005];
    cin>>t;
    std::fill(arr,arr+t,0);
    for (int i = 0; i < t; ++i) {
        cin>>x;
        arr[x]++;
    } 
    int n;
    cin>>n;
    for (int i = 0; i < n; ++i) {
        int y;
        cin>>y;
        if(arr[y]>0) 
            cout<<arr[y]<<"\n";
        else
            cout<<"NOT PRESENT\n";
    }
return 0;
}

/*
SAMPLE INPUT 
6
1 1 1 2 2 0
6
1
2
1
0
3
4
SAMPLE OUTPUT 
3
2
3
1
NOT PRESENT
NOT PRESENT
*/