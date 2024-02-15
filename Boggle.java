
Public class Boggle{
    private ArrayList<Character> board = new ArrayList<Character>();

    public String findWord(int a, int b, int lengthC, int lengthI){
        if(lengthC == lengthI){
            return ",";
        }
        if(b < 4){
            return board[a][b] + findWord(a, b+1, lengthC + 1);
        }
        else if(b == 4){
            return ",";
        }
        if(a < 4){
            return board[a][b] + findWord(a + 1, b, lengthC + 1);
        }
        else if(a == 4){
            return ",";
        }
        if(a < 4 && b < 4){
            return board[a][b] + findWord(a +1, b+1, lengthC + 1);
        }
        
    }

    public void findWord(int a, int b){
        ArrayList<String> words = new ArrayList<String>(); 
        if()
    }

    public void recWordSrch(String word){
        if(word.length() == 3){
            checkWord(word);
        }
        else{
            checkWord(word)
            recWordSrch(word.substring(1));
        }
    }



}