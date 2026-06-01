import java.util.Scanner;
import java.util.Arrays;

class Person implements Comparable<Person> {
    int h;
    int w;
    int index;

    public Person(int h, int w, int index){
        this.h = h;
        this.w = w;
        this.index = index;
    }

    public int compareTo(Person p){
        if(h==p.h)
            return p.w - w;
        return h - p.h;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] p = new Person[n];

        for(int i=0; i<n; i++){
            p[i] = new Person(sc.nextInt(), sc.nextInt(),i+1);
        }

        Arrays.sort(p);

        for(int i=0; i<n; i++){
            System.out.println(p[i].h + " " + p[i].w + " "+ p[i].index);
        }
    }
}