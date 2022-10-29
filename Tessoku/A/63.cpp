#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,m,a,b;
vector<int> g[200000];
int d[200000];
bool used[200000];
deque<int> dq;

int main() {
    cin>>n>>m;
    for(int i=0;i<m;i++){
        cin>>a>>b;
        g[a].push_back(b);
        g[b].push_back(a);
    }
    for(int i=1;i<=n;i++)d[i]=-1;
    d[1]=0;
    dq.push_back(1);
    while(!dq.empty()){
        int pos = dq.front();dq.pop_front();
        used[pos] = true;
        for(int e: g[pos]){
            if(used[e])continue;
            d[e] = (d[e]==-1?d[pos]+1:min(d[pos]+1,d[e]));
            dq.push_back(e);
        }
    }
    for(int i=1;i<=n;i++){
        cout<<d[i]<<endl;
    }
}