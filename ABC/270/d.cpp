#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
    int n,k;cin>>n>>k;
    int a[n];
    for(int i=0;i<k;i++)cin>>a[i];
    int dp[10010] = {};
    for(int i=0;i<=n;i++)for(int j=0;j<k;j++){
        if(a[j]>i)break;
        dp[i] = max(dp[i],i-dp[i-a[j]]);
    }
    cout<<dp[n]<<endl;
    // for(int i=0;i<=n;i++)cout<<dp[i]<<" ";
    // cout<<endl;
    return 0;
}