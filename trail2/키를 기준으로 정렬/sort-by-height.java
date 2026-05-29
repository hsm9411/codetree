import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person> {
    String n;
    int h;
    int w;

    public Person(String n, int h, int w){
        this.n = n;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Person p){
        return this.h - p.h;
    }

    public String toString(){
        return n + " " + h + " " + w;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for(int i=0; i<n; i++){
            persons[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(persons);

        for(int i=0; i<n; i++){
            System.out.println(persons[i]);
        }
    }
}