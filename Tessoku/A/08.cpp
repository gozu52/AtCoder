#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int mp[2000][2000];
ll sum[2000][2000];

int main() {
    int h,w;cin>>h>>w;
    for(int i=1;i<=h;i++)for(int j=1;j<=w;j++)cin>>mp[i][j];
    for(int i=0;i<=h;i++){
        for(int j=0;j<=w;j++){
            mp[i][j+1] += mp[i][j];
        }
    }
    for(int i=0;i<=h;i++){
        for(int j=0;j<=w;j++){
            mp[i+1][j] += mp[i][j];
        }
    }
    int q;cin>>q;
    for(int i=0;i<q;i++){
        ll ans = 0;
        int a,b,c,d;cin>>a>>b>>c>>d;a--;b--;
        cout<<mp[c][d]+mp[a][b]-mp[c][b]-mp[a][d]<<endl;
    }
}