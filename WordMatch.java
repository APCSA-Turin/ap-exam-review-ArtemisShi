public class WordMatch {

    private String secret;

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public WordMatch(String word) {
        secret = word;
    }

    public int scoreGuess(String guess) {
int count =0;
String place= secret;

for(int i=0;i<place.length();i++){
if(i+guess.length()<=place.length()&&secret.substring(i,i+guess.length()).equals(guess)){
count++;


}
}

int square= guess.length()*guess.length();
return  count *square;       

    }

    public String findBetterGuess(String guess1, String guess2) {
int g1=scoreGuess(guess1);
int g2=scoreGuess(guess2);

if(g1>g2){
return guess1;
}
else{
if(g2>g1){
return guess2;
}
else{
if(guess1.compareTo(guess2)>0){
return guess1;
}
else{
return guess2;
}
}
}
    }
}
