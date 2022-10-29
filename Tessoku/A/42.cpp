#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll cnt, ans;
int a[500],b[500];

int main() {
    int n,k;cin>>n>>k;
    for(int i=0;i<n;i++)cin>>a[i]>>b[i];
    for(int i=1;i<=100;i++){
        for(int j=1;j<=100;j++){
            cnt = 0;
            for(int l=0;l<n;l++){
                if(i<=a[l]&&a[l]<=i+k&&j<=b[l]&&b[l]<=j+k)cnt++;
            }
            ans = max(ans,cnt);
        }
    }
    cout<<ans<<endl;
}