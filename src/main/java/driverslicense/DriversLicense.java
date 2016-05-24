package driverslicense;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DriversLicense {

    private String name,address,licenseNumber, endorsements, issuingState, eyeColor;
    private int height;
    private double weight;
    private String licenseClassification, sex;
    private boolean organDonor, federallyCompliant;
    private Date dateOfBirth, issueDate, expirationDate;

    //private Restriction[] restrictions;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLicenseClassification() {
        return licenseClassification;
    }

    public void setLicenseClassification(String licenseClassification) {
        this.licenseClassification = licenseClassification;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isOrganDonor() {
        return organDonor;
    }

    public void setOrganDonor(boolean organDonor) {
        this.organDonor = organDonor;
    }

    public boolean isFederallyCompliant() {
        return federallyCompliant;
    }

    public void setFederallyCompliant(boolean federallyCompliant) {
        this.federallyCompliant = federallyCompliant;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

//    public Restriction[] getRestrictions() {
//        return restrictions;
//    }
//
//    public void setRestrictions(Restriction[] restrictions) {
//        this.restrictions = restrictions;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getEndorsements() {
        return endorsements;
    }

    public void setEndorsements(String endorsements) {
        this.endorsements = endorsements;
    }

    public String getIssuingState() {
        return issuingState;
    }

    public void setIssuingState(String issuingState) {
        this.issuingState = issuingState;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    /**
     * (include description of field order here)
     *
     * @return
     */
    public String serializeToCSV() {

        StringBuilder csvBuilder = new StringBuilder();

        csvBuilder.append(name).append(',')
                .append(address).append(',')
                .append(licenseNumber).append(',')
                .append(endorsements).append(',')
                .append(issuingState).append(',')
                .append(eyeColor).append(',')
                .append(height).append(',')
                .append(weight).append(',')
                .append(licenseClassification).append(',')
                .append(sex).append(',')
                .append(organDonor).append(',')
                .append(federallyCompliant).append(',')
                .append(dateOfBirth).append(',')
                .append(issueDate).append(',')
                .append(expirationDate);//.append("\n");
        return csvBuilder.toString();
    }

    public static String getCSVHeader() {
        return "NAME,ADDRESS,LICENSE NUMBER,ENDORSEMENTS,ISSUING STATE, EYE COLOR,HEIGHT, WEIGHT, LICENSE CLASS, SEX, ORGAN DONOR, FEDERALLY COMPLIANT, DOB, ISSUE DATE,EXPIRATION DATE";
    }

//Strip out serialized file strip out the fields to make objects out of them

    public static ArrayList<DriversLicense> deserializedFromCSV(String csv) {

        DriversLicense driversLicense = new DriversLicense();
        ArrayList<DriversLicense>driversLicenses = new ArrayList<>();

        String[] splitData = csv.split("\\s*,\\s*");
        driversLicense.setName(splitData[0]);
        driversLicense.setAddress(splitData[1]);
        driversLicense.setLicenseNumber(splitData[2]);
        driversLicense.setEndorsements(splitData[3]);
        driversLicense.setIssuingState(splitData[4]);
        driversLicense.setEyeColor(splitData[5]);
        driversLicense.setHeight(Integer.parseInt(splitData[6]));
        driversLicense.setWeight(Double.parseDouble(splitData[7]));
        driversLicense.setLicenseClassification(splitData[8]);
        driversLicense.setSex(splitData[9]);
        driversLicense.setOrganDonor(Boolean.parseBoolean(splitData[10]));
        driversLicense.setFederallyCompliant(Boolean.parseBoolean(splitData[11]));
        driversLicense.setDateOfBirth(dateParser(splitData[12]));
        driversLicense.setIssueDate(dateParser(splitData[13]));
        driversLicense.setExpirationDate(dateParser(splitData[14]));
        driversLicenses.add(driversLicense);
        return driversLicenses;
    }


    @Override
    public String toString() {
        return "DriversLicense{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", endorsements='" + endorsements + '\'' +
                ", issuingState='" + issuingState + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", licenseClassification=" + licenseClassification +
                ", sex=" + sex +
                ", organDonor=" + organDonor +
                ", federallyCompliant=" + federallyCompliant +
                ", dateOfBirth=" + dateOfBirth +
                ", issueDate=" + issueDate +
                ", expirationDate=" + expirationDate +
                '}';

    }


    public static Date dateParser(String date){
        DateFormat dateFormat = new SimpleDateFormat("EE MMM dd kk:mm:ss zzz yyyy");
        Date cDate = null;
        try{
            cDate = dateFormat.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return cDate;

    }
}