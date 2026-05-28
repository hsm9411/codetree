import java.util.Scanner;

class Weather{
    String time;
    String day;
    String weather;

    public Weather(String time,String day, String weather){
        this.time = time;
        this.day = day;
        this.weather = weather;
    }

    public String toString(){
        return time + " " + day + " " + weather;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weathers = new Weather[n];
        Weather ans = null;

        for(int i=0; i<n; i++){
            weathers[i] = new Weather(sc.next(),sc.next(),sc.next());
        }

        for(int i=0; i<n; i++){
            if(weathers[i].weather.equals("Rain")){
                if(ans == null){
                    ans = weathers[i];
                }else if(ans.time.compareTo(weathers[i].time)> 0){
                        ans = weathers[i];
                }
            }
        }
        System.out.println(ans);
    }
}