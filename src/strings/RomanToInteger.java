package strings;

public class RomanToInteger {
    public int romanToInt(String s) {
        int num=0;
        for (int i = 0; i <s.length() ; i++) {
            char ch =s.charAt(i);
            if(ch =='I'){
                if(i!=s.length()-1 && s.charAt(i+1)=='V'){
                    num+=4;
                    i=i+1;
                }
                else if(i!=s.length()-1 && s.charAt(i+1)=='X'){
                    num+=9;
                    i=i+1;
                }
                else
                    num+=1;
            }
            else if(ch =='V'){
                num+=5;
            }
            else if(ch =='X'){
                if(i!=s.length()-1 && s.charAt(i+1)=='C'){
                    num+=90;
                    i=i+1;
                }
                else if(i!=s.length()-1 && s.charAt(i+1)=='L'){
                    num+=40;
                    i=i+1;
                }
                else {
                    num += 10;
                }
            }
            else if(ch =='L'){
                num+=50;
            }
            else if(ch =='C'){
                if(i!=s.length()-1 && s.charAt(i+1)=='M'){
                    num+=900;
                    i=i+1;
                }
                else if(i!=s.length()-1 && s.charAt(i+1)=='D'){
                    num+=400;
                    i=i+1;
                }
                else {
                    num += 100;
                }
            }
            else if(ch =='D'){
                num+=500;
            }
            else if(ch =='M')
                num+=1000;
        }
        return num;
    }
}
