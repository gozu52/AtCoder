#include <bits/stdc++.h>
using namespace std;
typedef long long ll;



int main() {
    int n;cin>>n;
    int a[n];for(int i=0;i<n;i++)cin>>a[i];
    int p[400010];for(int i=0;i<400010;i++)p[i]=-1;
    int k = 2*n+1;
    p[1]=0;p[2]=1;p[3]=1;
    for(int i=1;i<n;i++){
        int pos = i+1;
        int left = pos*2, right = pos*2+1;
        p[left]=p[a[i]]+1;
        p[right]=p[a[i]]+1;
    }
    for(int i=1;i<=k;i++){
        cout<<p[i]<<endl;
    }
}