
public  class LeadScoring {

    private final String annualrevenue;
    private final String country;
    private final String email;
    private final String industry;
    private final String leadsourcename;
    private final String numberofemployees;
    private final String yearsinbusiness;
    private final float qualificationscore;
    private final boolean isconverted;

    public LeadScoring(
            final String newAnnualRevenue,
            final String newCountry,
            final String newEmail,
            final String newIndustry,
            final String newLeadSourceName,
            final String newNumberOfEmployees,
            final String newYearsInBusiness,
            final float newQualificationScore,
            final boolean newIsConverted) {

        this.annualrevenue = newAnnualRevenue;
        this.country = newCountry;
        this.email = newEmail;
        this.industry = newIndustry;
        this.leadsourcename = newLeadSourceName;
        this.numberofemployees = newNumberOfEmployees;
        this.yearsinbusiness = newYearsInBusiness;
        this.qualificationscore = newQualificationScore;
        this.isconverted = newIsConverted;
    }






    public static class LeadScoringBuilder{
        private String nestedAnnualRevenue;
        private String nestedCountry;
        private String nestedEmail;
        private String nestedIndustry;
        private String nestedLeadSourceName;
        private String nestedNumberOfEmployees;
        private String nestedYearsInBusiness;
        private float nestedQualificationScore;
        private boolean nestedIsConverted;

        public LeadScoringBuilder (

                 String newEmail

        ){


            this.nestedEmail = newEmail;

        }










        public LeadScoringBuilder annualrevenue(String newAnnualRevenue){
            this.nestedAnnualRevenue = newAnnualRevenue;
            return this;
        }
        public LeadScoringBuilder country(String newCountry){
            this.nestedCountry = newCountry;
            return this;
        }
        public LeadScoringBuilder email(String newEmail){
            this.nestedEmail = newEmail;
            return this;
        }
        public LeadScoringBuilder industry(String newIndustry){
            this.nestedIndustry = newIndustry;
            return this;
        }
        public LeadScoringBuilder leadsourcename(String newLeadSourceName){
            this.nestedLeadSourceName = newLeadSourceName;
            return this;
        }
        public LeadScoringBuilder numberofemployees(String newNumberOfEmployees){
            this.nestedNumberOfEmployees = newNumberOfEmployees;
            return this;
        }
        public LeadScoringBuilder yearsinbusiness(String newYearsInBusiness){
            this.nestedYearsInBusiness = newYearsInBusiness;
            return this;
        }
        public LeadScoringBuilder qualificationscore(float newQualificationScore){
            this.nestedQualificationScore = newQualificationScore;
            return this;

        }
        public LeadScoringBuilder isconverted(boolean newIsConverted){
            this.nestedIsConverted = newIsConverted;
            return this;

        }

        public LeadScoring createLeadScore() {
            return new LeadScoring(nestedAnnualRevenue, nestedCountry, nestedEmail, nestedIndustry,
                    nestedLeadSourceName, nestedNumberOfEmployees, nestedYearsInBusiness,nestedQualificationScore, nestedIsConverted);


        }

    }

}
