public class App {
    public static void main(String[] args) throws Exception {

        student student1 = new student("Isa", "2026", 3.9, 27);
        student student2 = new student("Lex", "2026", 3.5, 74);
        student student3 = new student("Lauretta", "2026", 4.0, 92);
        student student4 = new student("Patrick", "2025", 4.0, 39);
        student student5 = new student("Nick", "2025", 3.0, 1);

        student1.isHonorStudent();
        student2.isHonorStudent();
        student3.isHonorStudent();
        student4.isHonorStudent();
        student5.isHonorStudent();

        student1.freeLunch();      
        student2.freeLunch();      
        student3.freeLunch();      
        student4.freeLunch();      
        student5.freeLunch();      
    }
}
