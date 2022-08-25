#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int, int> P;
const int mod = 998244353;

int n, m, a, b, c, d, e, f;
int xtmp[100001];
int ytmp[100001];
set<P>st;
ll ans;

void solve(){
    vector<vector<vector<ll>>> dp(n+1,vector<vector<ll>>(n+1,vector<ll>(n+1,0)));
    dp[0][0][0] = 1;
    for(int i=0;i<n;i++){
        for(int j=0;i+j<n;j++){
            for(int k=0;i+j+k<n;k++){
                ll x = a*i+c*j+e*k;
                ll y = b*i+d*j+f*k;
                if(st.count(make_pair(x+a,y+b))==0){
                    dp[i+1][j][k] += dp[i][j][k];
                    dp[i+1][j][k] %= mod;
                }
                if(st.count(make_pair(x+c,y+d))==0){
                    dp[i][j+1][k] += dp[i][j][k];
                    dp[i][j+1][k] %= mod;
                }
                if(st.count(make_pair(x+e,y+f))==0){
                    dp[i][j][k+1] += dp[i][j][k];
                    dp[i][j][k+1] %= mod;
                }
            }
        }
    }
    ans = 0;
    for(int i=0;i<=n;i++){
        for(int j=0;i+j<=n;j++){
            ans += dp[i][j][n-i-j];
        }
    }
    ans %= mod;
    cout<<ans<<endl;
}

int main(){
    cin>>n>>m>>a>>b>>c>>d>>e>>f;
    for(int i=0;i<m;i++){
        cin>>xtmp[i]>>ytmp[i];
        st.insert({xtmp[i],ytmp[i]});
    }
    solve();
}