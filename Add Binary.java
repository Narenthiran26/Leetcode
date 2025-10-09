class Solution {
    public String addBinary(String a, String b) {
        if(a.equals("0")&&(b.equals("0"))){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder first = new StringBuilder(a);
        StringBuilder second = new StringBuilder(b);

        a=first.reverse().toString();
        b=second.reverse().toString();

        int count =0;
        int carry=0;

        for(int i=0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if(carry==0){
                    sb.insert(0,0);
                    carry=1;
                }
                else{
                    sb.insert(0,1);
                    carry=1;
                }
            }
            else if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                if(carry==0){
                    sb.insert(0,0);
                    carry=0;
                }
                else{
                    sb.insert(0,1);
                    carry=0;
                }
            }
            else{
                if(carry==0){
                    sb.insert(0,1);
                    carry=0;
                }
                else{
                    sb.insert(0,0);
                    carry=1;
                }
            }
            count++;
        }

        String remaining = null;
        if(a.length()>b.length()){
            remaining = a;
        }
        else{
            remaining=b;
        }
        for(int i=count;i<remaining.length();i++){
            if(carry==1 && remaining.charAt(i)=='1'){
                sb.insert(0,0);
                carry=1;
            }
            else if(carry==1 && remaining.charAt(i)=='0'){
                carry=0;
                sb.insert(0,1);
            }
            else{
                carry=0;
                sb.insert(0,remaining.charAt(i));
            }
        }

        if(carry==1){
            sb.insert(0,1);
        }

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
