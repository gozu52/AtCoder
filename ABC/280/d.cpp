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
ll k,ans;

ll primeFactorize(ll n){
    ll a,dn,x,res = 0; 
    for(ll i=2;i*i<=n;i++){
        a = 0;
        if(n%i!=0)continue;
        ll ex = 0;
        while(n%i==0){n /= i;a++;}
        dn = 0;
        while(a>0){
            dn += i;
            x=dn;
            while(x%i==0){x /= i;a--;}
        }
        res = max(res,dn);
    }
    res = max(res,n);
    return res;
}

int main(){
    cin>>k;
    ans = primeFactorize(k);
    cout<<ans<<endl;
    return 0;
}