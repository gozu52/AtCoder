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
ll n,m,a[202000],sum;
map<ll,ll> mp;
vector<PL> vec;
ll ans,s[200200];

int main(){
    cin>>n>>m;
    for(int i=0;i<n;i++){
        cin>>a[i];
        mp[a[i]]++;
        sum += a[i];
    }
    for(int i=0;i<200200;i++)s[i] = INFL;
    for(auto e:mp)vec.push_back(e);
    ll k = vec.size();
    if(m==k){
        cout<<0<<endl;
        return 0;
    }
    ll pos;
    for(int i=0;i<k;i++){
        if(vec[(i+1)%k].first!=(vec[i].first+1)%m){
            pos = i;
            break;
        }
    }
    for(int i=0;i<k;i++){
        ll j = (pos-i+k)%k;
        s[j] = sum;
        if(vec[(j+1)%k].first==(vec[j].first+1)%m)s[j] = s[(j+1)%k];
        s[j] -= vec[j].first*vec[j].second;
    }
    ans = sum;
    for(int i=0;i<k;i++)ans = min(ans,s[i]);
    cout<<ans<<endl;
    return 0;
}