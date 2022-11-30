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
string s;
ll cnt;

int main(){
    cin>>s;
    for(int i=0;i<s.size();i++){
        if(s[i]=='v')cnt++;
        if(s[i]=='w')cnt+=2;
    }
    cout<<cnt<<endl;
    return 0;
}