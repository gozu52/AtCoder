#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll dp[2001][2001];
int n,m;

int main(){
    cin>>n>>m;
    vector<ll> a(n);
    for(int i=0;i<n;i++)cin>>a[i];
    dp[0][0] = 0;
    dp[0][1] = -1e18;
    for(int i=1;i<=n;i++)for(int j=0;j<=n;j++){
        if(j==0)dp[i][0] = 0;
        else if(j>i)dp[i][j] = -1e18;
        else dp[i][j] = max(dp[i-1][j],dp[i-1][j-1]+a[i-1]*j);
    }
    cout<<dp[n][m]<<endl;
}