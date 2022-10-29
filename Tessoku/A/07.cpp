#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll sum[100100];

int main() {
    int d,n;cin>>d>>n;
    sum[0]=0;
    for(int i=0;i<n;i++){
        int l,r;cin>>l>>r;r++;
        sum[l]++;sum[r]--;
    }
    for(int i=1;i<=d;i++)sum[i]+=sum[i-1];
    for(int i=1;i<=d;i++)cout<<sum[i]<<endl;
}