public class Education {
    private String university;//University Name
    private String gradYear;//Graduation Year
    private String degree;
    private String major;

    public Education() {
    }

    public Education(String university, String gradYear, String degree, String major) {
        this.university = university;
        this.gradYear = gradYear;
        this.degree = degree;
        this.major = major;
        }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void listEducation(){
        System.out.println("- " + getDegree()+ " in "+getMajor());
        System.out.println(getUniversity()+" , "+getGradYear());
    }
}
