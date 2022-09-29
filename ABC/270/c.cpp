#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<int> g[200010];
bool f[200010];
deque<int> deq;
bool stop;

void dfs(int pos, int next){
    if(!stop)deq.push_back(pos);
    if(pos==next)stop = true;
    f[pos] = true;
    int s = g[pos].size();
    for(int i=0;i<s;i++)if(!f[g[pos][i]])dfs(g[pos][i],next);
    if(!stop)deq.pop_back();
    return;
}

int main(){
    int n,x,y,u,v;
    cin>>n>>x>>y;
    for(int i=0;i<n-1;i++){
        cin>>u>>v;
        g[u].push_back(v);
        g[v].push_back(u);
    }
    for(int i=1;i<=n;i++)f[i] = false;
    stop = false;
    dfs(x,y);
    while(!deq.empty()){
        cout<<deq.front();
        deq.pop_front();
        (deq.empty()?cout<<endl:cout<<" ");
    }
    return 0;
}