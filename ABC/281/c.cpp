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
ll a[200000],b,sum;

int main(){
    ll n,t;cin>>n>>t;
    for(int i=1;i<=n;i++){
        cin>>b;
        sum += b;
        a[i] = sum;
    }
    t%=sum;
    for(int i=0;i<n;i++){
        if(a[i]<=t && t<=a[i+1]){
            cout<<i+1<<" "<<t-a[i]<<endl;
            return 0;
        }
    }
    return 0;
}