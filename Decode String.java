class Solution {
    public String decodeString(String s) {
       Stack<Integer> numst=new Stack<>();
       Stack<StringBuilder> sbst =new Stack<>();
       StringBuilder sbresult=new StringBuilder();
       int n=0;
       for(char c:s.toCharArray()){
        if(Character.isDigit(c)){
            n=n*10+(c-'0');
        }
        else if(c=='['){
            numst.push(n);
            n=0;
            sbst.push(sbresult);
            sbresult = new StringBuilder();
        }
        else if(c==']'){
            int k=numst.pop();
            StringBuilder temp=sbresult;
            sbresult=sbst.pop();
            while(k!=0){
                sbresult.append(temp);
                k--;
            }
        }
        else{
            sbresult.append(c);
        }
       }
       return sbresult.toString();
    }
}
