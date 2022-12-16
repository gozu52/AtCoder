#include <bits/stdc++.h>
#define rep(i, n) for (int i = 0; i < (int)(n); i++)
#define all(x) (x).begin(),(x).end()

using namespace std;
using ll = long long;
using ld = long double;
using P = pair<int,int>;
using PL = pair<ll,ll>;
const int INF = 1e9;
const ll INFL = 1e18;
const int dx[4] = {1,0,-1,0};
const int dy[4] = {0,1,0,-1};
// cout<<fixed<<setprecision(10);
// priority_queue<int,vector<int>,greater<int>> pq;
int N,K,D;

int main(){
    cin>>N>>K>>D;
    vector<int> a(N);
    for(int i=0;i<N;i++)cin>>a[i];
    vector<vector<vector<ll>>> dp(N+1,vector<vector<ll>>(K+1,vector<ll>(D,-1)));
    dp[0][0][0] = 0;
    for(int i=0;i<N;i++){
        for(int j=0;j<=K;j++){
            for(int k=0;k<D;k++){
                //cout<<i<<" "<<j<<" "<<k<<endl;
                if(dp[i][j][k]==-1)continue;
                dp[i+1][j][k] = max(dp[i][j][k],dp[i+1][j][k]);
				if(j!=K){
					dp[i+1][j+1][(k+a[i])%D] = max(dp[i+1][j+1][(k+a[i])%D],dp[i][j][k] + a[i]);
				}                
            }
        }
    }
    cout<<dp[N][K][0]<<endl;
    return 0;
}