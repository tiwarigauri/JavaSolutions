public class gradeEncryptingDecyrpting {
    public static void main(String[] args) {
        System.out.println("Please enter your grade");
        char originalGrade = 'B';
        // Encrypting the grade
        char modifiedGrade = (char) (originalGrade + 8);
        System.out.println("Your grade is : " +modifiedGrade);
        System.out.println("Your original grade is : " +originalGrade);
    }
}
