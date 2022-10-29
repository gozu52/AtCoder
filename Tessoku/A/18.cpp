#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,s;
int a[100];
bool dp[100][10010];

int main() {
    cin>>n>>s;
    for(int i=0;i<n;i++)cin>>a[i];
    dp[0][0] = true;
    for(int i=1;i<=n;i++){
        for(int j=0;j<=s;j++){
            if(dp[i-1][j])dp[i][j] = true;
            if(j>=a[i-1]&&dp[i-1][j-a[i-1]])dp[i][j]=true;
        }
    }
    cout<<(dp[n][s]?"Yes":"No")<<endl;
}