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
// priority_queue<int,vector<int>,greater<int>> pq;
double a,b,ans = 1e18;

double g(double x,double y, ll z){
    return y*z + x/(sqrt(z+1));
}

int main(){
    double a,b;
    cin>>a>>b;
    int cnt = 1000000;
    ll low = 0, high = 1e16;
    while(cnt-->0){
        ll c1 = (low*2+high)/3;
        ll c2 = (low+high*2)/3;
        if(g(a,b,c1)>g(a,b,c2))low = c1;
        else high = c2;
    }
    cout<<fixed<<setprecision(10);
    cout<<min(g(a,b,low),g(a,b,low+1))<<endl;
    return 0;
}