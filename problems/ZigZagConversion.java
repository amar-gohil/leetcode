publica class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        
        char[] str1 = s.toCharArray(); 
        int len = s.length();  
        
        String[] arr = new String[numRows]; 
        Arrays.fill(arr, ""); 
        
        int row = 0;
        boolean down = true; 
        
        for(int i = 0; i < len ; ++i){
            arr[row] += (str1[i]); 
            if(row == numRows-1){
                down = false;
            }else if(row == 0){
                down = true;
            }
            if(down){
                row++;
            }else
            {
                row--;
            }
        }
        String temp = "";
        for (int i = 0; i < numRows; ++i)  
        { 
            temp += arr[i];
        } 
        return temp;
    }
}
