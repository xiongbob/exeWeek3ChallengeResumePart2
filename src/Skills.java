public class Skills {
    private String skillName;
    private String skillProficiency;

    public Skills() {
    }
    public Skills(String skillName, String skillProficiency) {
        this.skillName = skillName;
        this.skillProficiency = skillProficiency;

    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillProficiency() {
        return skillProficiency;
    }

    public void setSkillProficiency(String skillProficiency) {
        this.skillProficiency = skillProficiency;
    }


    public void listSkills(){
        System.out.println("-" + getSkillName() + " , "+getSkillProficiency());
    }
}
