#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,l,a[200010],ans;
char b[200010];

int main() {
    cin>>n>>l;
    for(int i=0;i<n;i++)cin>>a[i]>>b[i];
    for(int i=0;i<n;i++){
        ans = (b[i]=='E'?max(ans,l-a[i]):max(ans,a[i]));
    }
    cout<<ans<<endl;
}