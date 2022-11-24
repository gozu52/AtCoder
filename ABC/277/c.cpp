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

int n,a[200020],b[200020],ans=1;
map<int,vector<int>> mp;
map<int,bool> used;

void dfs(int x){
    ans = max(ans,x);
    if(used[x])return ;
    used[x] = true;
    for(int e: mp[x]){
        if(used[e])continue;
        dfs(e);
    }
}

int main(){
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>a[i]>>b[i];
        mp[a[i]].push_back(b[i]);
        mp[b[i]].push_back(a[i]);
        used[a[i]] = false;
        used[b[i]] = false;
    }
    dfs(1);
    cout<<ans<<endl;
    return 0;
}