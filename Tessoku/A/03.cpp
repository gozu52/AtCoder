#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,k;cin>>n>>k;
    int p[n],q[n];
    for(int i=0;i<n;i++)cin>>p[i];
    for(int i=0;i<n;i++)cin>>q[i];
    for(int i=0;i<n;i++)for(int j=0;j<n;j++){
        if(p[i]+q[j]==k){
            cout<<"Yes"<<endl;
            return 0;
        }
    }
    cout<<"No"<<endl;
}