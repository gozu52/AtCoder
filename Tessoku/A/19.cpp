#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,W;
ll dp[200][200000];
int v[200],w[200];

int main() {
    cin>>n>>W;
    for(int i=1;i<=n;i++)cin>>w[i]>>v[i];
    for(int i=1;i<=n;i++){
        for(int j=0;j<=W;j++){
            if(j>=w[i]){
                dp[i][j] = max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
            }else{
                dp[i][j] = dp[i-1][j];
            }
        }
    }
    cout<<dp[n][W]<<endl;
}