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
int n,m,cnt;
set<string> st;
string s[2000],t;

int main(){
    cin>>n>>m;
    for(int i=0;i<n;i++)cin>>s[i];
    for(int i=0;i<m;i++){
        cin>>t;
        st.insert(t);
    }
    for(int i=0;i<n;i++){
        string val = s[i].substr(s[i].size()-3,3);
        if(st.count(val)>0)cnt++;
    }
    cout<<cnt<<endl;
    return 0;
}