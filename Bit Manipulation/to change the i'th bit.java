class Main {
    public static void main(String[] args) {
        int n = 2;
        int i = 0;
        String s = Integer.toBinaryString(n);
        String[] arr = s.split("");
        if (i < arr.length) {
            if (arr[i].equals("0")) { 
                arr[i] = "1";
            } else {
                arr[i] = "0";
            }
        }
        String s1 = String.join("", arr);
        int n1 = Integer.parseInt(s1, 2);
        System.out.println(n1);
    }
}
