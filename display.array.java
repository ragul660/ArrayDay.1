public class Main {
  public static void main(String[] args) {
    int marks[] = {5, 10, 15, 20};
    System.out.println("Number of marks: " + marks.length);
    displayMarks(marks);
  }

  public static void displayMarks(int[] marks) {
    for (int mark : marks) {
      System.out.println(mark);
    }
  }
}