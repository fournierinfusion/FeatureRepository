import java.util.ArrayList;

public class Main {
    public static void Main(String[] args){


        LeadScoring ls1 = new LeadScoring.LeadScoringBuilder("test@gmail.com").annualrevenue("15645764000").country("USA").email("test@gmail.com")
                .industry("Software").leadsourcename("John AppleSeed").numberofemployees("1030").yearsinbusiness("4").qualificationscore(1).isconverted(y);

        LeadScoring ls2 = new LeadScoring.LeadScoringBuilder("tes1t@gmail.com").annualrevenue("1045747400").country("USA").email("test1@gmail.com")
                .industry("Software").leadsourcename("Sarah AppleSeed").numberofemployees("1040").yearsinbusiness("4").qualificationscore(1).isconverted(y);

        LeadScoring ls3 = new LeadScoring.LeadScoringBuilder("test32424@gmail.com").annualrevenue("15474000").country("USA").email("tes2t@gmail.com")
                .industry("Software").leadsourcename("Adam AppleSeed").numberofemployees("1030").yearsinbusiness("4").qualificationscore(1).isconverted(y);

        LeadScoring ls4 = new LeadScoring.LeadScoringBuilder("test5353@gmail.com").annualrevenue("1036300").country("USA").email("test3@gmail.com")
                .industry("Software").leadsourcename("Clarke AppleSeed").numberofemployees("1003").yearsinbusiness("4").qualificationscore(1).isconverted(n);

        LeadScoring ls5 = new LeadScoring.LeadScoringBuilder("test5454@gmail.com").annualrevenue("10456400").country("USA").email("test4@gmail.com")
                .industry("Software").leadsourcename("Joe AppleSeed").numberofemployees("1400").yearsinbusiness("1").qualificationscore(3).isconverted(y);

        LeadScoring ls6 = new LeadScoring.LeadScoringBuilder("test5454@gmail.com").annualrevenue("1056400").country("USA").email("test5@gmail.com")
                .industry("Software").leadsourcename("Dick AppleSeed").numberofemployees("1300").yearsinbusiness("2").qualificationscore(2).isconverted(n);

        LeadScoring ls7 = new LeadScoring.LeadScoringBuilder("test343@gmail.com").annualrevenue("1043640").country("USA").email("test6@gmail.com")
                .industry("Software").leadsourcename("Shanna AppleSeed").numberofemployees("1003").yearsinbusiness("6").qualificationscore(1).isconverted(n);


        ArrayList<LeadScoring> newList = new ArrayList<LeadScoring>();

        newList.add(ls1);
        newList.add(ls2);
        newList.add(ls3);
        newList.add(ls4);
        newList.add(ls5);
        newList.add(ls6);
        newList.add(ls7);





    }
}
