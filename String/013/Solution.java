class Solution {
    public int romanToInt(String s) {  
        // Write your code here  
        // 基本字符    相应的阿拉伯数字表示为  
        // I           1  
        // V           5  
        // X           10  
        // L           50  
        // C           100  
        // D           500  
        // M           1000  
        if(s.length()==0){  
            return 0;  
        }  
        int sum = 0;  
        for(int i = 0; i < s.length()-1 ; i++){  
            if(singleRoman(s.charAt(i)) >= singleRoman(s.charAt(i+1))){  
                sum += singleRoman(s.charAt(i));  
            }else{  
                sum -= singleRoman(s.charAt(i));  
            }  
        }  
        sum+=singleRoman(s.charAt(s.length()-1));  
        return sum;  
    }  
      
    public static int singleRoman(char a){  
        switch(a){  
            case 'I' : return 1;  
            case 'V' : return 5;  
            case 'X' : return 10;  
            case 'L' : return 50;  
            case 'C' : return 100;  
            case 'D' : return 500;  
            case 'M' : return 1000;  
        }  
        return -1;  
    }  
}