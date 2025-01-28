class Main {
    public static void main(String[] args) {
        int number=4;
        if((number & (number - 1)) == 0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}
