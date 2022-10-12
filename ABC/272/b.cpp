#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<int> g[200010];
bool p[200][200];

int main() {
    int n,m;cin>>n>>m; 
    for(int i=0;i<m;i++){
        int k;cin>>k;
        for(int j=0;j<k;j++){
            int x;cin>>x;
            g[i].push_back(x);
        }
        for(int j=0;j<g[i].size()-1;j++){
            for(int k=j+1;k<g[i].size();k++){
                p[g[i][j]][g[i][k]] = true;
            }
        }
    }
    bool f = true;
    for(int i=1;i<n;i++){
        for(int j=i+1;j<=n;j++)f &= p[i][j];
    }
    cout<<(f?"Yes":"No")<<endl;
}