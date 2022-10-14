public class RomanToInteger {

    //Function to convert roman to integer
    public static int convert(String ss) {
        int n=0;
        for(int i=0;i<ss.length();i++) {
            if(ss.charAt(i)=='I'&& ss.charAt(i+1)=='V')
            {    
                n=n+4;
                i++;
            }
            else if(ss.charAt(i)=='I'&& ss.charAt(i+1)=='X')
            {    
                n=n+9;
                i++;
            }
            else if(ss.charAt(i)=='X'&& ss.charAt(i+1)=='L')
            {    
                n=n+40;
                i++;
            }
            else if(ss.charAt(i)=='X'&& ss.charAt(i+1)=='C')
            {    
                n=n+90;
                i++;
            }
            else if(ss.charAt(i)=='C'&& ss.charAt(i+1)=='D')
            {    
                n=n+400;
                i++;
            }
            else if(ss.charAt(i)=='C'&& ss.charAt(i+1)=='M')
            {    
                n=n+900;
                i++;
            }
            else if(ss.charAt(i)=='I')
                n=n+1;
            else if(ss.charAt(i)=='V')    
                n=n+5;
            else if(ss.charAt(i)=='X')    
                n=n+10;
            else if(ss.charAt(i)=='L')    
                n=n+50;
            else if(ss.charAt(i)=='C')    
                n=n+100;
            else if(ss.charAt(i)=='D')    
                n=n+500;
            else if(ss.charAt(i)=='M')    
                n=n+1000;   
        }
        return n;
    }
    public static void main(String[] args) {
        String ss="IX"+" ";
        System.out.println(convert(ss));
    }
}
