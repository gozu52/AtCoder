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

int main(){
    cin>>s;int n = s.size();
    if(s[0]<'A'||s[0]>'Z'){cout<<"No"<<endl;return 0;}
    if(n!=8){cout<<"No"<<endl;return 0;}
    for(int i=1;i<=6;i++)if(!(s[i]-'0'>=0&&s[i]-'0'<=9)){cout<<"No"<<endl;return 0;}
    string stmp;
    for(int i=1;i<=6;i++)stmp.push_back(s[i]);
    int num = atoi(stmp.c_str());
    if(num<100000 || num>999999){cout<<"No"<<endl;return 0;}
    if(n>7){
        if(s[7]<'A'||s[7]>'Z'){cout<<"No"<<endl;return 0;}
    }
    cout<<"Yes"<<endl;
    return 0;
}