#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<int> g[200000];
bool used[200000];
int n,m,a,b;
void dfs(int num){
    used[num] = true;
    for(int e:g[num]){
        if(!used[e])dfs(e);
        used[e]=true;
    }
}

int main() {
    cin>>n>>m;
    for(int i=0;i<m;i++){
        cin>>a>>b;
        g[a].push_back(b);
        g[b].push_back(a);
    }
    dfs(1);
    for(int i=1;i<=n;i++){
        if(!used[i]){
            cout<<"The graph is not connected."<<endl;
            return 0;
        }
    }
    cout<<"The graph is connected."<<endl;

}