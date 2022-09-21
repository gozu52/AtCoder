#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int x[1010], y[1010];
int mp[2010][2010] = {};
bool used[2010][2010] = {};
int cnt = 0;
int dx[6] = {-1,-1,0,0,1,1};
int dy[6] = {-1,0,-1,1,0,1};

void dfs(int a,int b){
    // cout<<"cnt"<<cnt<<endl;
    for(int i=0;i<6;i++){
        int nx = a+dx[i], ny = b+dy[i];
        if(nx>=0&&ny>=0 && nx<=2000&&ny<=2000 && !used[nx][ny]&& mp[nx][ny]==1){
            // cout<<nx<<" "<<ny<<endl;
            used[nx][ny] = true;cnt++;
            dfs(nx,ny);
        }
    }
}

int main(){
    int n;cin>>n;
    for(int i=0;i<2010;i++)for(int j=0;j<2010;j++)mp[i][j]=0;
    for(int i=0;i<n;i++){
        cin>>x[i]>>y[i];
        x[i]+=1000;y[i]+=1000;
        mp[x[i]][y[i]]=1;
    }
    ll ans = 0;
    for(int i=0;i<n;i++){
        cnt = 0;
        if(!used[x[i]][y[i]]){
            used[x[i]][y[i]] = true;
            cnt++;
            dfs(x[i],y[i]);
        }
        if(cnt>0)ans++;
        // cout<<ans<<endl;
    }
    cout<<ans<<endl;
}
