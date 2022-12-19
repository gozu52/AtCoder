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
ll n,m;
vector<int> g[300000];
int flag[300000];

P dfs(int v,int p, int c){
    P ret = P(0,0);
    flag[v] = c;
    if(c==1)ret.first++;
    else ret.second++;

    for(auto e:g[v]){
        // when you are already looking at it || already have a color in mind       
        if(e==p||flag[e]==-c)continue;
        // when it is not a bipartite graph (when adjacent nodes are painted in the same color)
        if(flag[e]==c)return P(-1,-1);
        P res = dfs(e,v,-c);
        //c part sets the color that should paint that node, so if it is different, it is not a bipartite graph
        if(res.first==-1)return P(-1,-1);
        // manage how many nodes are painted in each color
        ret.first += res.first;
        ret.second += res.second;
    }
    return ret;
}

int main(){
    cin>>n>>m;
    int u,v;
    for(int i=0;i<m;i++){
        cin>>u>>v;
        g[v].push_back(u);
        g[u].push_back(v);
    }
    ll ans = n*(n-1)/2-m;
    for(int i=1;i<=n;i++){
        cout<<i<<endl;
        if(!flag[i]){
            P res = dfs(i,-1,1);
            if(res.first==-1){
                cout<<0<<endl;
                return 0;
            }
            ans -= res.first*(res.first-1)/2;
            ans -= res.second*(res.second-1)/2;
        }
    }
    cout<<ans<<endl;
    return 0;
}
