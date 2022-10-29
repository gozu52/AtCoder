#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
int a[100100],b[100100],dp[100100];

int main() {
    cin>>n;
    for(int i=2;i<=n;i++)cin>>a[i];
    for(int i=3;i<=n;i++)cin>>b[i];
    dp[2]=a[2];
    for(int i=3;i<=n;i++){
        dp[i] = min(dp[i-2]+b[i],dp[i-1]+a[i]);
    }
    cout<<dp[n]<<endl;
}