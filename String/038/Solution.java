class Solution{

    public String countAndSay(int n){
        if (n <= 0) {
            return "";
        }
        String result = "1";//第一行
        while(--n > 0){
            int times = 1;
            StringBuilder sb = new StringBuilder();
            char[] chars = result.toCharArray();
            int len = chars.length;
            for(int i = 1; i< len; i++){
                if(chars[i-1] == chars[i]){
                    times++;//计数器+1
                } else {
                    sb.append(times).append(chars[i-1]);//数出之前出现的数出现的次数
                    times = 1;//出现次数恢复初始值
                }
            }
            result = sb.append(times).append(chars[len - 1]).toString();//最后一行的
        }
        return result;
    }

}