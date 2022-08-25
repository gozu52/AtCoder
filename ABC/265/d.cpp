#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
int a[200001];
ll p, q, r;
set<ll> st;

void solve(){
    vector<ll>sum(200001);
    sum[0] = 0;
    for(int i=0;i<n;i++){
        sum[i+1] += sum[i] + a[i];
    }
    for(int i=0;i<=n;i++)st.insert(sum[i]);
    bool flag = false;
    for(int i=0;i<=n;i++){
        if(st.count(sum[i]+p) == 1 && st.count(sum[i]+p+q) == 1 && st.count(sum[i]+p+q+r) == 1){
            flag = true;
        }
    }
    if(flag)cout<<"Yes"<<endl;
    else cout<<"No"<<endl;
}

int main(){
    cin>>n>>p>>q>>r;
    for(int i=0;i<n;i++)cin>>a[i];
    solve();
}