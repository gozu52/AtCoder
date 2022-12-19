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
int n,m,a[1000];

ll reppow(ll x,ll n, ll MOD){
    ll res = 1;
    while(n>0){
        if(n&1)res = res*x%MOD;
        x = x*x%MOD;
        n>>=1;
    }
    return res;
}
struct dsu {
  public:
    dsu() : _n(0) {}
    explicit dsu(int n) : _n(n), parent_or_size(n, -1) {}

    int merge(int a, int b) {
        assert(0 <= a && a < _n);
        assert(0 <= b && b < _n);
        int x = leader(a), y = leader(b);
        if (x == y) return x;
        if (-parent_or_size[x] < -parent_or_size[y]) std::swap(x, y);
        parent_or_size[x] += parent_or_size[y];
        parent_or_size[y] = x;
        return x;
    }

    bool same(int a, int b) {
        assert(0 <= a && a < _n);
        assert(0 <= b && b < _n);
        return leader(a) == leader(b);
    }

    int leader(int a) {
        assert(0 <= a && a < _n);
        if (parent_or_size[a] < 0) return a;
        return parent_or_size[a] = leader(parent_or_size[a]);
    }

    int size(int a) {
        assert(0 <= a && a < _n);
        return -parent_or_size[leader(a)];
    }

    std::vector<std::vector<int>> groups() {
        std::vector<int> leader_buf(_n), group_size(_n);
        for (int i = 0; i < _n; i++) {
            leader_buf[i] = leader(i);
            group_size[leader_buf[i]]++;
        }
        std::vector<std::vector<int>> result(_n);
        for (int i = 0; i < _n; i++) {
            result[i].reserve(group_size[i]);
        }
        for (int i = 0; i < _n; i++) {
            result[leader_buf[i]].push_back(i);
        }
        result.erase(
            std::remove_if(result.begin(), result.end(),
                           [&](const std::vector<int>& v) { return v.empty(); }),
            result.end());
        return result;
    }

  private:
    int _n;
    // root node: -1 * component size
    // otherwise: parent
    std::vector<int> parent_or_size;
};

int main(){
    cin>>n>>m;for(int i=0;i<n;i++)cin>>a[i];
    vector<tuple<int,int,int>>e;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            e.push_back(make_tuple((reppow(a[i],a[j],m) + reppow(a[j],a[i],m))%m,i,j));
        }
    }
    sort(all(e),greater<tuple<int,int,int>>());
    dsu uf(n);
    ll ans = 0;
    for(int i=0;i<n*(n-1)/2;i++){
        int c = get<0>(e[i]);
        int u = get<1>(e[i]);
        int v = get<2>(e[i]);
        if(!uf.same(u,v)){
            uf.merge(u,v);
            ans += c;
        }
    }
    cout<<ans<<endl;
    return 0;
}