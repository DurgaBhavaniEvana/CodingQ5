class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
    int l1=0,l2=0,ans=0,temp1=0,temp2=0;
    for(int r=0;r<answerKey.length();r++){
        if(answerKey.charAt(r)=='T')
         temp1++;
        else
        temp2++;
    while(temp1>k){
        if(answerKey.charAt(l1)=='T')
        temp1--;
    l1++;
    }
    ans=Math.max(ans,r-l1+1);
    while(temp2>k){
        if(answerKey.charAt(l2)=='F')
        temp2--;
    l2++;
    }
    ans=Math.max(ans,r-l2+1);
    }  
    return ans;
    }
}
