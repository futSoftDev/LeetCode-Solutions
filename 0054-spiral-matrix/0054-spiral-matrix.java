class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int x=0;
        int y=0;
        int dx=1;
        int dy=0;
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<row*col; i++){
            res.add(matrix[y][x]);
            matrix[y][x]=-101;
            if(!((x+dx>=0 && x+dx<col) && (y+dy>=0 && y+dy<row)) || matrix[y+dy][x+dx]==-101){
                int temp=dx;
                dx=-dy;
                dy=temp;
            }
            x+=dx;
            y+=dy;
        }
        return res;
    }
}