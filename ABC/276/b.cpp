#include <bits/stdc++.h>
#define ll = long long
using namespace std;

int n,m,a,b;
vector<int> g[200000];
priority_queue<int, vector<int>, greater<int> > f[200000];

int main(){
    cin>>n>>m;
    for(int i=0;i<m;i++){
        cin>>a>>b;
        f[a].push(b);
        f[b].push(a);
    }
    for(int i=1;i<=n;i++){
        cout<<f[i].size()<<" ";
        while(!f[i].empty()){
            cout<<f[i].top()<<" ";
            f[i].pop();
        }
        cout<<endl;
    }
    return 0;
}