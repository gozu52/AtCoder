#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int dp[2500][2500],slen,tlen;
string s,t;

int main() {
    cin>>s>>t;
    slen = s.size();tlen = t.size();
    dp[0][0] = 0;
    for(int i=0;i<=slen;i++){
        for(int j=0;j<=tlen;j++){
            if(i>0&&j>0&&s[i-1]==t[j-1]){
                dp[i][j] = max({dp[i-1][j],dp[i-1][j-1]+1,dp[i][j-1]});
            }else if(i>0&&j>0){
                dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
            }else if(i>0){
                dp[i][j] = dp[i-1][j];
            }else if(j>0){
                dp[i][j] = dp[i][j-1];
            }
        }
    }
    cout<<dp[slen][tlen]<<endl;
}