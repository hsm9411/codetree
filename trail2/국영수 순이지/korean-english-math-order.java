import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    String n;
    int k;
    int e;
    int m;

    public Student(String n, int k, int e, int m){
        this.n = n;
        this.k = k;
        this.e = e;
        this.m = m;
    }

    @Override
    public int compareTo(Student student){
        if(this.k == student.k){
            if(this.e == student.e){
                return  - this.m + student.m;
            }
            return - this.e + student.e;
        }
        return - this.k + student.k;
    }

    public String toString(){
        return n + " " + k + " " + e + " "+ m;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            students[i] = new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }

        Arrays.sort(students);
        for(int i=0; i<n; i++){
            System.out.println(students[i]);
        }
    }
}