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
int h,w;

int main(){
    cin>>h>>w;
    vector<string> s(h),t(h),sd(w),td(w);
    for(auto &nx : s){cin >> nx;}
    for(auto &nx : t){cin >> nx;}
    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            sd[j].push_back(s[i][j]);
            td[j].push_back(t[i][j]);
        }
    }
    sort(all(sd));sort(all(td));
    cout<<(sd==td?"Yes":"No")<<endl;
    return 0;
}