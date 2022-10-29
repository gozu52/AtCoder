#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

char a,c;
int n,score;

int main() {
    cin>>n>>c;
    for(int i=0;i<n;i++){
        cin>>a;
        if(a=='W')score += 0;
        if(a=='B')score += 1;
        if(a=='R')score += 2;
    }
    score %=3;
    cout<<(score==0&&c=='W'||score==1&&c=='B'||score==2&&c=='R'?"Yes":"No")<<endl;
}