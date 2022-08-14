#include <bits/stdc++.h>
using namespace std;

int n, l, r;
int a[200001];
const long long INF = 1000000000000001;

void solve(){
    vector<vector<long long>> dp(3, vector<long long>(n+1,INF));
    dp[0][0] = 0;//L管理
    dp[1][0] = 0;//a[i]管理
    dp[2][0] = 0;//R管理
    for(int i=0;i<n;i++){
        dp[0][i+1]=dp[0][i]+l;
        dp[1][i+1]=dp[1][i]+a[i];
        dp[2][i+1]=dp[2][i]+r;
        dp[1][i+1]=min(dp[0][i+1],dp[1][i+1]);
        dp[2][i+1]=min(dp[1][i+1],dp[2][i+1]);
    }
    cout << dp[2][n] <<endl;
}

int main(){
    cin >> n>>l>>r;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    solve();
}