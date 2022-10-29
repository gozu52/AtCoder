#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,m,a,b;
vector<int> g[200010];

int main() {
    cin>>n>>m;
    for(int i=0;i<m;i++){
        cin>>a>>b;
        g[a].push_back(b);
        g[b].push_back(a);
    }
    for(int i=1;i<=n;i++){
        cout<<i<<": {";
        for(int j=0;j<g[i].size();j++){
            if(j>=1)cout<<", ";
            cout<<g[i][j];
        }
        cout<<"}"<<endl;
    }
}