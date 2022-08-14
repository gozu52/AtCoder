#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int n, m, e, q;
int qx[500001];
int qy[500001];
int query[500001];
int num_arr[500001];
int ans[500001];

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


void solve(){
   dsu uf(n+1);
    for(int i=0;i<e;i++){
        if(num_arr[i]==-1){
            uf.merge(qx[i],qy[i]);
        }
    }
    ans[q-1] = uf.size(n)-1;
    for(int i=q-1;i>=0;i--){
        int u = qx[query[i]], v = qy[query[i]];
        uf.merge(u,v);
        ans[i-1] = uf.size(n)-1; 
    }
    for(int i=0;i<q;i++)cout<<ans[i]<<endl;
}

int main(){
    cin>>n>>m>>e;
    for(int i=0;i<e;i++){
        int u, v;
        cin>>u>>v;
        u--;v--;
        qx[i] = min(u,n);
        qy[i] = min(v,n);
    }
    cin>>q;
    for(int i=0;i<e;i++)num_arr[i]=-1;
    for(int i=0;i<q;i++){
        cin>>query[i];
        query[i]--;
        num_arr[query[i]]=0;
    }
    solve();
}