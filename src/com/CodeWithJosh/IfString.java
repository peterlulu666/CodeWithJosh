class IfString {
    public static void main(String[] args) {
        int income = 120_000;
        String className = income > 100_00 ? "First" : "Economy";
        System.out.println(className);
        
    }
}