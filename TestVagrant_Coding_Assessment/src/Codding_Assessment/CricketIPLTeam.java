package Codding_Assessment;

import java.util.*;

public class CricketIPLTeam{
    String name;
    int pts;
    String[] result_of_team;
    String result_type;
    int consecutive;
    CricketIPLTeam(String name, int pts, String[] result_of_team, String result_type, int consecutive){
        this.name = name;
        this.pts = pts;
        this.result_of_team = result_of_team;
        this.result_type = result_type;
        this.consecutive = consecutive;
    }
    public int display(){
        String []results = {"loss", "win"};
        String noresult="";
        for(int i=0;i< results.length;i++)
        {
            if(!(results[i].equals(result_type)))
            {
                noresult = results[i];
            }
        }
        int count_consecutive=0;
        for(int i=0;i<result_of_team.length;i++) {
            if (result_of_team[i].equals(result_type)) {
                count_consecutive = count_consecutive + 1;
                if(count_consecutive==consecutive)
                {
                    break;
                }
            }
            else if(result_of_team[i].equals(noresult) && count_consecutive>0)
            {
                count_consecutive = count_consecutive - 1;
            }
        }
        if(count_consecutive==consecutive)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String []args) {
        String result_type;
        int consecutive;

	  
      	int[] Teams = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      
      	String[] Teamname = {"GT", "LSG", "RR", "DC", "RCB", "KKR", "PBKS", "SRH", "CSK", "MI"};
      
       	String[] NRR = {"0.391", "0.251", "0.304", "0.255", "0.323", "0.146", "0.43", "0.230", "0.206", "0.577"};
       
       	int[] Pts = {20, 18, 16, 14, 14, 12, 12, 12, 8, 6};
      
       	String[] Lastfive= {"W W L L W", "W L L W W", "W L W L L", "W W L W L", "L W W L L", "L W W L W", "L W L W L", "W L L L L", "L L W L W", "L W L W W"};
    
      	System.out.println("Teams   NRR   Pts   Last 5");
	System.out.println(Teams[0]+" "+Teamname[0]+"   "+NRR[0]+"  "+Pts[0]+"  "+Lastfive[0]);
	System.out.println(Teams[1]+" "+Teamname[1]+"  "+NRR[1]+"  "+Pts[1]+"  "+Lastfive[1]);
	System.out.println(Teams[2]+" "+Teamname[2]+"   "+NRR[2]+"  "+Pts[2]+"  "+Lastfive[2]);
      	System.out.println(Teams[3]+" "+Teamname[3]+"   "+NRR[3]+"  "+Pts[3]+"  "+Lastfive[3]);
	System.out.println(Teams[4]+" "+Teamname[4]+"  "+NRR[4]+"  "+Pts[4]+"  "+Lastfive[4]);
	System.out.println(Teams[5]+" "+Teamname[5]+"  "+NRR[5]+"  "+Pts[5]+"  "+Lastfive[5]);
	System.out.println(Teams[6]+" "+Teamname[6]+"  "+NRR[6]+"  "+Pts[6]+"  "+Lastfive[6]);
	System.out.println(Teams[7]+" "+Teamname[7]+"  "+NRR[7]+"  "+Pts[7]+"  "+Lastfive[7]);
      	System.out.println(Teams[8]+" "+Teamname[8]+"  "+NRR[8]+"  "+Pts[8]+"   "+Lastfive[8]);
	System.out.println(Teams[9]+" "+Teamname[9]+"  "+NRR[9]+"  "+Pts[9]+"   "+Lastfive[9]);
     

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type in which you want your teams to be filtered");
        System.out.print("So please enter either loss or win: ");
        result_type = sc.next();
        System.out.print("Now, please enter the number of consecutive losses/wins, means the value of n: ");
        consecutive = sc.nextInt();
        ArrayList<String> Filtered_Teams = new ArrayList<>();
        CricketIPLTeam[] teams;
        teams = new CricketIPLTeam[10];
        String[] results_of_team1 = {"win", "win", "loss", "loss", "win"};
        teams[0] = new CricketIPLTeam("GT", 20, results_of_team1, result_type, consecutive);
        int r = teams[0].display();
        if (r == 1) {
            Filtered_Teams.add(teams[0].name);
        }
        String[] results_of_team2= {"win", "loss", "loss", "win", "win"};
        teams[1] = new CricketIPLTeam("LSG", 18, results_of_team2, result_type, consecutive);
        r = teams[1].display();
        if (r == 1) {
            Filtered_Teams.add(teams[1].name);
        }
        String[] results_of_team3 = {"win", "loss", "win", "loss", "loss"};
        teams[2] = new CricketIPLTeam("RR", 16, results_of_team3, result_type, consecutive);
        r = teams[2].display();
        if (r == 1) {
            Filtered_Teams.add(teams[2].name);
        }
        String[] results_of_team4 = {"win", "win", "loss", "win", "loss"};
        teams[3] = new CricketIPLTeam("DC", 14, results_of_team4, result_type, consecutive);
        r = teams[3].display();
        if (r == 1) {
            Filtered_Teams.add(teams[3].name);
        }
        String[] results_of_team5 = {"loss", "win", "win", "loss", "loss"};
        teams[4] = new CricketIPLTeam("RCB", 14, results_of_team5, result_type, consecutive);
        r = teams[4].display();
        if (r == 1) {
            Filtered_Teams.add(teams[4].name);
        }
        String[] results_of_team6 = {"loss", "win", "win", "loss", "win"};
        teams[5] = new CricketIPLTeam("KKR", 12, results_of_team6, result_type, consecutive);
        r = teams[5].display();
        if (r == 1) {
            Filtered_Teams.add(teams[5].name);
        }
        String[] results_of_team7 = {"loss", "win", "loss", "win", "loss"};
        teams[6] = new CricketIPLTeam("PBKS", 12, results_of_team7, result_type, consecutive);
        r = teams[6].display();
        if (r == 1) {
            Filtered_Teams.add(teams[6].name);
        }
        String[] results_of_team8 = {"win", "loss", "loss", "loss", "loss"};
        teams[7] = new CricketIPLTeam("SRH", 12, results_of_team8, result_type, consecutive);
        r = teams[7].display();
        if (r == 1) {
            Filtered_Teams.add(teams[7].name);
        }
        String[] results_of_team9 = {"loss", "loss", "win", "loss", "win"};
        teams[8] = new CricketIPLTeam("CSK", 8, results_of_team9, result_type, consecutive);
        r = teams[8].display();
        if (r == 1) {
            Filtered_Teams.add(teams[8].name);
        }
        String[] results_of_team10 = {"loss", "win", "loss", "win", "win"};
        teams[9] = new CricketIPLTeam("MI", 6, results_of_team10, result_type, consecutive);
        r = teams[9].display();
        if (r == 1) {
            Filtered_Teams.add(teams[9].name);
        }
        if(Filtered_Teams.size()!=0)
        {
            System.out.print("Teams are: ");
            int j = 0;
            int total = 0;
            for (int i = 0; i < teams.length; i++) {
                if (Filtered_Teams.get(j).equals(teams[i].name)) {
                    if(j!=Filtered_Teams.size()-1)
                    {
                        System.out.print(teams[i].name+"," + " ");
                    }
                    else
                    {
                        System.out.println(teams[i].name);
                    }
                    total = total + teams[i].pts;
                    j++;
                }
                if (j == Filtered_Teams.size()) {
                    i = teams.length;
                }
            }
            float len = Filtered_Teams.size();
            float t = total;
            float avg = t / len;
            System.out.println("Average points of these filtered teams = "+avg);
        }
        else {
            System.out.println("No such teams found");
            System.out.println("Average = "+0);
        }
    }
}
