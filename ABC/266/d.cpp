#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n;
const long long INF = -1e18;
ll ans = 0;
ll sum[100001][5];
ll dp[100001][5];

int main(){
	cin>>n;
	for(int i=0;i<n;i++){
        int t,x,a;
        cin>>t>>x>>a;
		sum[t][x] = a;
	}
	for(int i=0;i<100001;i++)for(int j=0;j<5;j++)dp[i][j] = INF;
	dp[0][0] = 0;
	for(int i=0;i<100000;i++)for(int j=0;j<5;j++){
		for(int k=j-1;k<=j+1;k++){
            if(0<=k&&k<5)dp[i+1][k] = max(dp[i+1][k],dp[i][j]+sum[i+1][k]);
        }
	}
	for(int i=0;i<5;i++)ans = max(ans,dp[100000][i]);
	cout<<ans<<endl;
}
