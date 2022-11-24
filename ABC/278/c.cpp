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
map<int,set<int>> mp;
int n,q,t,a,b;

int main(){
    cin>>n>>q;
    while(q-->0){
        cin>>t>>a>>b;
        if(t==1){
            mp[a].insert(b);
        }else if(t==2){
            mp[a].erase(b);
        }else if(t==3){
            cout<<(mp[a].count(b)>=1&&mp[b].count(a)>=1?"Yes":"No")<<endl;
        }
    }
    return 0;
}