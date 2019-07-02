public class Experience {
    private String company;
    private String jobTitle;
    private String startDate;//Work Starting date
    private String endDate;//Work Ending date
    private String jobDescriptions;

    public Experience() {
    }

    public Experience(String company, String jobTitle, String startDate, String endDate) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Experience(String company, String jobTitle, String startDate, String endDate, String jobDescriptions) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDescriptions = jobDescriptions;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDescriptions() {
        return jobDescriptions;
    }

    public void setJobDescriptions(String jobDescriptions) {
        this.jobDescriptions = jobDescriptions;
    }

    public void listExperience(){
        System.out.println("-"+getJobTitle());
        System.out.println(getCompany()+" , "+getStartDate()+" - "+getEndDate());
    }
}
