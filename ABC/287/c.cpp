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
int n,m,u,v,pos;
vector<int> g[300000];
bool used[300000];

void dfs(int x){
    used[x] = true;
    if(g[x].size()<=2)for(auto e: g[x]){
        if(!used[e])dfs(e);
    }
}

int main(){
    cin>>n>>m;
    for(int i=0;i<m;i++){
        cin>>u>>v;
        g[u].push_back(v);
        g[v].push_back(u);
    }
    for(int i=1;i<=n;i++){
        if(g[i].size()==1){
            pos = i;
            break;
        }
    }
    dfs(pos);
    for(int i=1;i<=n;i++){
        if(!used[i]){
            cout<<"No"<<endl;
            return 0;
        }
    }
    cout<<"Yes"<<endl;
    return 0;
}