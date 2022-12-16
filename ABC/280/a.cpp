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
int h,w,cnt;
string s[11];

int main(){
    cin>>h>>w;
    for(int i=0;i<h;i++){
        cin>>s[i];
        for(int j=0;j<w;j++)if(s[i][j]=='#')cnt++;
    }
    cout<<cnt<<endl;
    return 0;
}