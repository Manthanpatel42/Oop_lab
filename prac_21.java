class VotingApp {
    void checkEligibility(int age) {
        if (age < 18) throw new IllegalArgumentException("Age must be 18 or above to vote");
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        VotingApp v = new VotingApp();

        try {
            v.checkEligibility(16);
            v.checkEligibility(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}