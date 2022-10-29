#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int snow[2000][2000];

int main() {
    int h,w,n;cin>>h>>w>>n;
    for(int i=0;i<n;i++){
        int a,b,c,d;cin>>a>>b>>c>>d;
        a--;b--;
        snow[a][b]++;snow[c][d]++;
        snow[a][d]--;snow[c][b]--;
    }
    for(int i=0;i<h;i++)for(int j=0;j<w;j++)snow[i][j+1]+=snow[i][j];
    for(int i=0;i<h;i++)for(int j=0;j<w;j++)snow[i+1][j]+=snow[i][j];
    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            cout<<snow[i][j]<<" ";
        }
        cout<<endl;
    }
}