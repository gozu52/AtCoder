#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n;cin>>n;
    int a[n];for(int i=0;i<n;i++)cin>>a[i];
    int q[n+10]={}, p[n+10]={};
    p[0]=0;q[0]=0;p[1]=a[0];q[n]=a[n-1];
    for(int i=0;i<n;i++)p[i+1] = max(a[i],p[i]);
    for(int i=n;i>0;i--)q[i] = max(a[i-1],q[i+1]);
    int d;cin>>d;
    for(int i=0;i<d;i++){
        int l,r;cin>>l>>r;
        cout<<max(p[l-1],q[r+1])<<endl;
    }
}