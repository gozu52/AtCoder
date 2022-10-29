#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

bool dp[1000010];

int main() {
    int n,a,b;cin>>n>>a>>b;
    for(int i=0;i<=n;i++){
        if(i>=a&&!dp[i-a])dp[i]=true;
        if(i>=b&&!dp[i-b])dp[i]=true;
    }
    cout<<(dp[n]?"First":"Second")<<endl;
}