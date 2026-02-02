class Voting {
    String vote(int age){
        String eligibility = "";
        if(age >= 18){
            eligibility = "You are eligible to vote";
        }
        else if(age > 0 && age < 18){
            eligibility = "You are not eligible to vote";
        }
        else{
            eligibility = "give the correct age";
        }
        return eligibility;
    }
    public static void main(String[] args) {
        Voting obj = new Voting();
        System.out.println(obj.vote(30));
    }
}
