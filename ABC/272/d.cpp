#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

const int dx[4] = {-1,1,-1,1};
const int dy[4] = {-1,1,1,-1};

int main() {
    int n, m;cin>>n>>m;
    int mp[n][n];
    queue<pair<int,int>> que;
    memset(mp,0x3f,sizeof(mp));
    mp[0][0] = 0;
    que.push(make_pair(0,0));
    while(!que.empty()){
        int x = que.front().first, y = que.front().second;
        que.pop();
        for(int i=0;i*i<=m;i++){
            int rmn = m-i*i;
            int j = sqrt(rmn);
            if(j*j!=rmn)continue;
            for(int k=0;k<4;k++){
                int nx = x+i*dx[k], ny = y+j*dy[k];
                if(nx>=0&&nx<n && ny>=0&&ny<n && mp[nx][ny]>mp[x][y]+1){
                    mp[nx][ny] = mp[x][y]+1;
                    que.push(make_pair(nx,ny));
                }
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(mp[i][j]>1e9)mp[i][j]=-1;
            cout<<mp[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}