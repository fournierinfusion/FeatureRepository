public class LeadScoring {

    private final String annualrevenue;
    private final String country;
    private final String email;
    private final String industry;
    private final String leadsourcename;
    private final String numberofemployees;
    private final String yearsinbusiness;
    private final float qualificationscore;
    private final boolean isconverted;

    private LeadScoring(
        final annualrevenue newAnnualRevenue;
        final country newCountry;
        final email newEmail;
        final industry newIndustry;
        final leadsourcename newLeadSourceName;
        final numberofemployees newNumberOfEmployees;
        final yearsinbusiness newYearsInBusiness;
        final qualificationscore newQualificationScore;
        final isconverted newIsConverted){

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



        public annualrevenue getAnnualrevenue() {
            return this.annualrevenue;
        }

        public country getCountry() {
            return this.country;
        }

        public email getEmail() {
            return this.email;
        }

        public industry getIndustry() {
            return this.industry;
        }

        public leadscoringname getLeadSourceName() {
            return this.leadsourcename;
        }

        public numbersofemployees getNumberofEmployees() {
            return this.numberofemployees;
        }

        public yearsinbusiness getYearsinBusiness() {
            return this.yearsinbusiness;
        }

        public qualificationscore getQualificationscore() {
            return this.qualificationscore;
        }

        public I getIsconverted() {
            return this.isconverted;
    }

    public static class LeadScoringBuilder{
        private annualrevenue nestedAnnualRevenue;
        private country nestedCountry;
        private email nestedEmail;
        private industry nestedIndustry;
        private leadsourcename nestedLeadSourceName;
        private numberofemployees nestedNumberOfEmployees;
        private yearsinbusiness nestedYearsInBusiness;
        private qualificationscore nestedQualificationScore;
        private isconverted nestedIsConverted;

        public LeadScoringBuilder (
                final annualrevenue newAnnualRevenue;
                final country newCountry;
                final email newEmail;
                final industry newIndustry;
                final leadsourcename newLeadSourceName;
                final numberofemployees newNumberOfEmployees;
                final yearsinbusiness newYearsinBusiness;
                final qualificationscore newQualificationScore
                final isconverted newIsConverted;

        ) {}

        public LeadScoringBuilder Annualrev(final annualrevenue newAnnualRevenue){
            this.nestedAnnualRevenue = newAnnualRevenue;
            return this;
        }
        public LeadScoringBuilder Country(final country newCountry){
            this.nestedCountry = newCountry;
            return this;
        }
        public LeadScoringBuilder Email(final email newEmail){
            this.nestedEmail = newEmail;
            return this;
        }
        public LeadScoringBuilder Industry(final industry newIndustry){
            this.industry = newIndustry;
            return this;
        }
        public LeadScoringBuilder Leadsourcename(final leadsourcename newLeadSourceName){
            this.leadsourcename = newLeadSourceName;
            return this;
        }
        public LeadScoringBuilder Numberofemployees(final numberofemployees newNumberOfEmployees){
            this.numberofemployees = newNumberOfEmployees;
            return this;
        }
        public LeadScoringBuilder Yearsinbusiness(final yearsinbusiness newYearsInBusiness){
            this.yearsinbusiness = newYearsInBusiness;
            return this;
        }
        public LeadScoringBuilder Qualificationscore(final qualificationscore newQualificationScore){
            this.qualificationscore = newQualificationScore;
            return this;

        }
        public LeadScoringBuilder Isconverted(final isconverted newIsConverted){
            this.isconverted = newIsConverted;
            return this;

        }

        Public LeadScoring createLeadScore(){
            return new LeadScoring(nestedAnnualRevenue,nestedCountry,nestedEmail,nestedIndustry,nestedIsConverted,
                    nestedLeadSourceName,nestedNumberOfEmployees,nestedQualificationScore,nestedYearsInBusiness);
        }



    }

}
