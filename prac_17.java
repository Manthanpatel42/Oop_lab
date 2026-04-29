interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) return "First Division";
        else return "Other Division";
    }

    public static void main(String[] args) {
        Result r = new Result();

        System.out.println(r.isPassed(50));
        System.out.println(r.getDivision(70));
    }
}