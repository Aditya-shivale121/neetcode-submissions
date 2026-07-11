class Solution {
    public boolean isValidSudoku(char[][] board) {

       // row
       for(int r = 0 ; r < 9 ; r++){
        HashSet<Character> set = new HashSet<>();
        for(int c = 0 ; c < 9 ; c++){
            char ch = board[r][c];
            if(board[r][c] == '.' ) continue;

            if(!set.add(ch)) return false;
        }
       } 
       // cols
       for(int c = 0 ; c < 9 ; c++){
        HashSet<Character> set = new HashSet<>();
        for(int r = 0 ; r < 9 ; r++){
            char ch = board[r][c];
            if(board[r][c] == '.' ) continue;

            if(!set.add(ch)) return false;
        }
       } 
       
       for(int r = 0 ; r < 9 ; r += 3){
        for(int c = 0 ; c < 9 ; c+=3){

             HashSet<Character> set = new HashSet<>();
             
             for(int i = 0 ; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    char ch = board[r+i][c+j];

                    if(ch == '.') continue;

                    if(!set.add(ch)) return false;
                }
             }
        }
       }

       return true;
    }
}
