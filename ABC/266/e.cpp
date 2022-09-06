#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;
double ans = 3.5, cnt;

int main(){
    cin>>n;
    for(int i=1;i<n;i++){
        cnt = 0;
        for(double j=1;j<7;j++)cnt += max(ans,j)/6;
        ans = cnt;
    }
    cout<<fixed<<setprecision(16)<<ans<<endl;
}