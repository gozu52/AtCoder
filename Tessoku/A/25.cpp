#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int h,w;
char g[50][50];
ll d[50][50];

int main() {
    cin>>h>>w;
    for(int i=0;i<h;i++)cin>>g[i];
    d[0][0] = 1;
    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            if(j==0&&i==0)continue;
            else if(i==0){
                if(g[i][j]!='#')d[i][j] = d[i][j-1];
            }else if(j==0){
                if(g[i][j]!='#')d[i][j] = d[i-1][j];
            }else {
                if(g[i][j]!='#')d[i][j] = d[i-1][j]+d[i][j-1];
            }
        }
    }
    cout<<d[h-1][w-1]<<endl;
}
