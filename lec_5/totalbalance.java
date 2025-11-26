class Atm{
    private  int TotalBalance=100000;
    public void getTotalB(){
        System.out.println(TotalBalance);
    }
    public void setBalance(int amount){
        if(amount>0  && TotalBalance>=amount){
            TotalBalance-=amount;
            System.out.println(TotalBalance);
        }
    }
}

class AtmMain{
    public static void main(String[] args){
        Atm atm=new Atm();
        atm.getTotalB();
        atm.setBalance(5000);
        atm.setBalance(20000);
        atm.getTotalB();
        
    }

}