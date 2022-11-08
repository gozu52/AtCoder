#include <bits/stdc++.h>
#define ll = long long
using namespace std;

int h,w,sx,sy;
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};
string s[2000000];
int vis[2000000];

void dfs(int x,int y,int n){
    vis[x*w+y]=1;
    for(int i=0;i<4;i++){
        int nx = x+dx[i], ny = y+dy[i];
        if(nx<0||ny<0||nx>=h||ny>=w)continue;
        if(s[nx][ny]=='S'&&n>2){
            cout<<"Yes"<<endl;
            exit(0);
        }
        if(vis[nx*w+ny]||s[nx][ny]!='.')continue;
        dfs(nx,ny,n+1);
    }
}

int main(){
    cin>>h>>w;
    for(int i=0;i<h;i++)cin>>s[i];
    for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
            if(s[i][j]=='S'){
                sx = i;sy = j;
            }
        }
    }
    dfs(sx,sy,0);
    cout<<"No"<<endl;
    return 0;
}