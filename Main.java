//Shmuel Zev Padwa
//This algorithm is designed to answer a problem posed by Jacob Greenwald
//If a one seed gets one point per win, a two seed gets two, a three three, etc.
//Which team this year has the highest expected value?
//Using kenpom's predictions for which team makes which round
//as well as some type processing and formatting
//I put together this algorithm

class Main {
  public static void main(String[] args) {
   Team[] teams = new Team[68];
   teams[0] = new Team(16,"North Carolina Central",0.09,0.005,0,0,0,0);
   teams[1] = new Team(1,"Virginia",97.7,85.2,67.0,48.7,31.3,20.5);
teams[2] = new Team(1,"Gonzaga",99.1,84.5,67.1,44.3,25.3,15.4);
teams[3] = new Team(1,"Duke",98.9,85.0,63.0,39.8,26.1,13.9);
teams[4] = new Team(2,"Michigan St.",97.0,75.3,58.3,33.1,21.0,10.9);
teams[5] = new Team(1,"North Carolina",98.6,81.0,57.8,36.9,18.6,8.7);
teams[6] = new Team(2,"Michigan",93.6,68.6,43.2,22.3,11.1,5.8);
teams[7] = new Team(2,"Kentucky",93.3,65.6,42.6,23.1,10.8,4.6);
teams[8] = new Team(2,"Tennessee",91.6,67.5,40.2,17.2,7.9,3.6);
teams[9] = new Team(3,"Texas Tech",89.0,63.1,32.8,14.9,6.6,3.0);
teams[10] = new Team(3,"Purdue",88.0,59.0,33.0,13.6,5.9,2.6);
teams[11] = new Team(4,"Virginia Tech",85.0,54.3,20.3,9.2,4.3,1.6);
teams[12]= new Team(5,"Auburn",71.9,44.6,18.5,9.0,3.3,1.1);
teams[13] = new Team(5,"Wisconsin",68.2,43.3,14.1,6.8,2.6,1.1);
teams[14] = new Team(3,"Houston",85.2,48.4,21.9,9.1,3.2,1.0);
teams[15] = new Team(4,"Florida St.",79.7,51.6,16.7,7.2,2.5,0.9);
teams[16] = new Team(6,"Iowa St.",65.6,35.3,15.7,6.3,2.1,0.7);
teams[17] = new Team(3,"LSU",79.1,46.4,15.1,4.9,1.9,0.5);
teams[18] = new Team(4,"Kansas",77.0,38.7,13.4,5.8,1.7,0.5);
teams[19] = new Team(7,"Wofford",68.6,26.2,13.0,5.0,1.5,0.4);
teams[20] = new Team(4,"Kansas St.",72.7,35.1,9.5,4.1,1.3,0.4);
teams[21] = new Team(7,"Louisville",65.2,18.5,10.1,3.4,1.3,0.4);
teams[22] = new Team(5,"Mississippi St.",71.3,33.9,9.8,3.5,1.3,0.4);
teams[23] = new Team(6,"Maryland",69.6,37.2,11.7,3.6,1.3,0.3);
teams[24] = new Team(6,"Buffalo",75.7,29.3,10.9,3.4,1.0,0.3);
teams[25] = new Team(6,"Villanova",52.3,20.4,8.2,2.4,0.7,0.2);
teams[26] = new Team(5,"Marquette",62.6,28.8,6.9,2.3,0.7,0.2);
teams[27] = new Team(7,"Nevada",51.6,15.2,5.8,1.6,0.4,0.1);
teams[28] = new Team(11,"Saint Marys",47.7,17.7,6.6,1.8,0.5,0.1);
teams[29] = new Team(10,"Florida",48.4,14.9,5.8,1.6,0.5,0.1);
teams[30] = new Team(7,"Cincinnati",52.6,16.9,6.5,1.7,0.4,0.1);
teams[31]= new Team(8,"Utah St.",57.9,12.0,4.9,1.7,0.4,0.09);
teams[32] = new Team(11,"Ohio St.",34.4,13.4,4.0,1.1,0.2,0.07);
teams[33] = new Team(10,"Iowa",47.4,13.6,4.8,1.1,0.3,0.06);
teams[34] = new Team(8,"Syracuse",52.3,8.3,3.6,1.0,0.2,0.05);
teams[35] = new Team(12,"Oregon",31.8,14.4,2.8,0.9,0.2,0.04);
teams[36] = new Team(8,"VCU",52.4,7.9,2.9,0.8,0.2,0.04);
teams[37] = new Team(9,"Baylor",47.7,7.1,2.9,0.8,0.2,0.04);
teams[38] = new Team(8,"Mississippi",48.8,7.0,2.7,0.7,0.1,0.04);
teams[39] = new Team(9,"Oklahoma",51.2,7.4,2.9,0.9,0.2,0.03);
teams[40] = new Team(9,"UCF",47.6,7.0,2.4,0.6,0.2,0.03);
teams[41] = new Team(10,"Minnesota",34.8,5.9,2.3,0.5,0.1,0.02);
teams[42] = new Team(9,"Washington",42.1,6.8,2.3,0.6,0.10,0.02);
teams[43] = new Team(12,"New Mexico St.",28.1,11.1,2.3,0.6,0.1,0.02);
teams[44] = new Team(10,"Seton Hall",31.4,7.0,2.2,0.5,0.08,0.01);
teams[45] = new Team(12,"Murray St.",37.4,12.9,2.0,0.4,0.08,0.01);
teams[46] = new Team(12,"Liberty",28.7,8.1,1.2,0.2,0.05,0.009);
teams[47] = new Team(11,"Belmont",19.8,7.3,1.3,0.2,0.04,0.006);
teams[48] = new Team(13,"Northeastern",23.0,5.6,0.8,0.2,0.02,0.004);
teams[49] = new Team(14,"Yale",20.9,6.1,0.7,0.09,0.02,0.003);
teams[50] = new Team(13,"Vermont",20.3,6.6,0.7,0.1,0.02,0.002);
teams[51] = new Team(11,"Arizona St.",15.0,3.3,0.7,0.1,0.02,0.001);
teams[52] = new Team(13,"UC Irvine",27.3,7.2,0.9,0.2,0.02,0.001);
teams[53] = new Team(11,"Temple",10.5,3.1,0.4,0.05,0.01,0.001);
teams[54] = new Team(11,"St. Johns",9.3,1.6,0.2,0.04,0.004,0.001);
teams[55] = new Team(13,"Saint Louis",15.0,3.7,0.3,0.03,0.005,0);
teams[56] = new Team(15,"Colgate",8.4,2.0,0.3,0.04,0.003,0);
teams[57] = new Team(14,"Old Dominion",12.0,2.9,0.4,0.04,0.002,0);
teams[58] = new Team(14,"Georgia St.",14.8,2.9,0.4,0.03,0.002,0);
teams[59] = new Team(15,"Abilene Christian",6.7,1.2,0.2,0.02,0.002,0);
teams[60] = new Team(15,"Montana",6.4,1.2,0.1,0.01,0.002,0);
teams[61]= new Team(14,"Northern Kentucky",11.0,2.6,0.4,0.04,0.001,0);
teams[62] = new Team(16,"Gardner Webb",2.3,0.4,0.05,0.004,0,0);
teams[63] = new Team(15,"Bradley",3.0,0.4,0.06,0.003,0,0);
teams[64] = new Team(16,"North Dakota St.",1.0,0.1,0.01,0.002,0,0);
teams[65] = new Team(16,"Iona",1.4,0.2,0.01,0,0,0);
teams[66] = new Team(16,"Prairie View AM",0.4,0.04,0.005,0,0,0);
teams[67] = new Team(16,"Fairleigh Dickinson",0.5,0.06,0.003,0,0,0);

    for (int i = 0; i<68; i++){
      double winProb = teams[i].seed * (teams[i].r32 + teams[i].r16 + teams[i].r8 + teams[i].r4 + teams[i].r2 + teams[i].r1)/100;
      System.out.println("The expected value of " + teams[i].teamName + " is " + winProb);
    }
  }
}
