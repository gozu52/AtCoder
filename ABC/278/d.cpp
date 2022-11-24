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
ll n,q,typ,x,base,pos;
vector<ll> a(300000);
stack<ll> st;

int main(){
    cin>>n;
    for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<n;i++)st.push(i);
    cin>>q;
    while(q-->0){
        cin>>typ;
        if(typ==1){
            cin>>x;
            while(!st.empty()){
                a[st.top()] = 0;
                st.pop();
            }
            base = x;
        }else if(typ==2){
            cin>>pos>>x;pos--;
            st.push(pos);
            a[pos] += x;
        }else if(typ==3){
            cin>>pos;pos--;
            cout<<base+a[pos]<<endl;
        }
    }
    return 0;
}