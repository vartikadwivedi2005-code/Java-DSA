class Sorting1 {
    public static void main(String[] args){
        int c1=0;
        int c2=0;
        int c3=0;
        int [] nums = null;
        for(int i : nums){  
            if(i==0){
                c1++;
            }
            else if(i==1){
                c2++;
            }
            else{
                c3++;
            }
        }
        int idx=0;
        for(int i=0;i<c1;i++){
           nums[idx]=0;
           idx++;
        }
        for(int i=0;i<c2;i++){
             nums[idx]=1;
             idx++;
        }
        for(int i=0;i<c3;i++){
             nums[idx]=2;
             idx++;
        }
    }
}