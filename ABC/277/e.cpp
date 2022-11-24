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

int n,m,k,u,v,a,s;
vector<P> g[400400];
int d[400400];

int main(){
    cin>>n>>m>>k;
    for(int i=0;i<m;i++){
        cin>>u>>v>>a;
        if(a==1){g[u].push_back(make_pair(v,1));g[v].push_back(make_pair(u,1));}
        else {g[n+u].push_back(make_pair(n+v,1));g[n+v].push_back(make_pair(n+u,1));}
    }
    for(int i=0;i<k;i++){
        cin>>s;
        g[s].push_back(make_pair(n+s,0));
        g[n+s].push_back(make_pair(s,0));
    }        
    deque<int> dq;
    dq.push_back(1);
    for(int i=1;i<=2*n;i++)d[i] = INF;
    d[1] = 0;
    while(dq.size()){
        int v = dq.front();dq.pop_front();
        for(int i=0;i<g[v].size();i++){
            int u = g[v][i].first, c =g[v][i].second;
            if(d[u]>d[v]+c){
                d[u] = d[v]+c;
                if(c==0)dq.push_front(u);
                else dq.push_back(u);
            }
        }
    }
    int ans = min(d[n],d[2*n]);
    cout<<(ans==INF?-1:ans)<<endl;
    return 0;
}