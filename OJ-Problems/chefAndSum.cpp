// https://www.codechef.com/SEPT17/problems/CHEFSUM
#include <bits/stdc++.h>
using namespace std;
int main(){
    int t,n;
    long long int arr[100004];
    long long int totalSum[100005];
    cin>>t;
    while (t--){
        long long int t_sum = 0;	
    	cin>>n;
    	for (int i = 0; i < n; ++i) {
    		cin>>arr[i];
            t_sum = arr[i] + t_sum;
    	}
        long long int ssum = t_sum;
        long long int psum = 0;
    	for (int i = 0; i < n; ++i) {
            if (i == 0)
                psum = arr[i];
            else
    		  psum = psum + arr[i];
            
            totalSum[i] = ssum + psum;
    		ssum = t_sum - psum;
    	}
        cout<<std::distance(totalSum, min_element(totalSum, totalSum + n)) + 1;
        std::cout<<endl;
    }
return 0;
}