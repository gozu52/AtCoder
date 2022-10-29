#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,k;cin>>n>>k;
    int a[n],b[n],c[n],d[n];
    for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<n;i++)cin>>b[i];
    for(int i=0;i<n;i++)cin>>c[i];
    for(int i=0;i<n;i++)cin>>d[i];
    ll sum[1000010],cum[1000010];
    int cnt = 0;
    for(int i=0;i<n;i++)for(int j=0;j<n;j++){
        sum[cnt] = a[i]+b[j];cnt++;
    }
    cnt=0;
    set<ll> st;
    for(int i=0;i<n;i++)for(int j=0;j<n;j++){
        cum[cnt] = c[i]+d[j];
        st.insert(cum[cnt]);
        cnt++;
    }
    for(int i=0;i<cnt;i++){
        if(st.count(k-sum[i])>0){
            cout<<"Yes"<<endl;
            return 0;
        }
    }
    cout<<"No"<<endl;
}