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
// priority_queue<int,vector<int>,greater<int>> pq;
int n,m,cnt,ans;
string s[50];

int main(){
    cin>>n>>m;
    for(int i=0;i<n;i++)cin>>s[i];
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            cnt = 0;
            for(int k=0;k<m;k++){
                if(s[i][k]=='o'||s[j][k]=='o')cnt++;
            }
            if(cnt==m)ans++;
        }
    }
    cout<<ans<<endl;
    return 0;
}