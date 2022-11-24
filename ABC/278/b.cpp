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
int h,m,a,b,c,d;

int main(){
    cin>>h>>m;
    while(true){
        a = h/10; b = h%10;
        c = m/10; d = m%10;
        int hour = a*10+c, sec = b*10+d;
        if(hour<24&&sec<60){cout<<h<<" "<<m<<endl;return 0;}
        m++;
        if(m>=60){
            m=0;
            h++;
        }
        if(h>=24){
            h=0;
        }
    }
    return 0;
}