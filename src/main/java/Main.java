import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void Main(String[] args) {

/**
 * Instantiate LeadScoring Class --> This is used to stub in what would have been a dataset object
 */
        LeadScoring ls1 = new LeadScoring.LeadScoringBuilder("test@gmail.com").annualrevenue("15645764000").country("USA").email("test@gmail.com")
                .industry("Software").leadsourcename("John AppleSeed").numberofemployees("1030").yearsinbusiness("4").qualificationscore(1).isconverted(true).createLeadScore();

        LeadScoring ls2 = new LeadScoring.LeadScoringBuilder("tes1t@gmail.com").annualrevenue("1045747400").country("USA").email("test1@gmail.com")
                .industry("Software").leadsourcename("Sarah AppleSeed").numberofemployees("1040").yearsinbusiness("4").qualificationscore(1).isconverted(true).createLeadScore();

        LeadScoring ls3 = new LeadScoring.LeadScoringBuilder("test32424@gmail.com").annualrevenue("15474000").country("USA").email("tes2t@gmail.com")
                .industry("Software").leadsourcename("Adam AppleSeed").numberofemployees("1030").yearsinbusiness("4").qualificationscore(1).isconverted(true).createLeadScore();

        LeadScoring ls4 = new LeadScoring.LeadScoringBuilder("test5353@gmail.com").annualrevenue("1036300").country("USA").email("test3@gmail.com")
                .industry("Software").leadsourcename("Clarke AppleSeed").numberofemployees("1003").yearsinbusiness("4").qualificationscore(1).isconverted(false).createLeadScore();

        LeadScoring ls5 = new LeadScoring.LeadScoringBuilder("test5454@gmail.com").annualrevenue("10456400").country("USA").email("test4@gmail.com")
                .industry("Software").leadsourcename("Joe AppleSeed").numberofemployees("1400").yearsinbusiness("1").qualificationscore(3).isconverted(false).createLeadScore();

        LeadScoring ls6 = new LeadScoring.LeadScoringBuilder("test5454@gmail.com").annualrevenue("1056400").country("USA").email("test5@gmail.com")
                .industry("Software").leadsourcename("Dick AppleSeed").numberofemployees("1300").yearsinbusiness("2").qualificationscore(2).isconverted(false).createLeadScore();

        LeadScoring ls7 = new LeadScoring.LeadScoringBuilder("test343@gmail.com").annualrevenue("1043640").country("USA").email("test6@gmail.com")
                .industry("Software").leadsourcename("Shanna AppleSeed").numberofemployees("1003").yearsinbusiness("6").qualificationscore(1).isconverted(false).createLeadScore();


        /**
         *
         *Create random array
         */
        List<LeadScoring> newArrayList = new ArrayList<LeadScoring>();




        /**
         *
         * Add too array
         */
        newArrayList.add(ls1);
        newArrayList.add(ls2);
        newArrayList.add(ls3);
        newArrayList.add(ls4);
        newArrayList.add(ls5);
        newArrayList.add(ls6);
        newArrayList.add(ls7);


    }

    /**
     * Lambda
     */
    List<LeadScoring> result = filter(newArrayList, (LeadScoring leadscoring) -> "dick".equals(leadscoring.get("email")));





    /**
     * Abstracting list method
     */

    public static <T> List<T> filter(List<T> list, TypePredicate<T> p){
        List<T> result = new ArrayList<>();
            for(T e: list){
                if(p.test(e)){
                    result.add(e);
                }
            }
            return result;


    }
}
