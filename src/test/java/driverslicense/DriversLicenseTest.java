package driverslicense;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class DriversLicenseTest {

    DriversLicense testLicense;

    String name = "Mike Jones";
    String address = "123 Atl drive";
    String eyeColor = "Brown";
    Date dateOfBirth = new Date(); // 3 times
    Date issueDate = dateOfBirth;
    Date expirationDate = dateOfBirth;
    String licenseNum = "007";
    String issuingState = "TX";
    String endorsements = "Trump";
  String sex = "M";
    int height = 72;
    double weight = 100;
    boolean organDonor = true;
    boolean federallyCompliant = true;
   String licenseClassification = "C";

    @Before
    public void setUp() throws Exception {
        testLicense = new DriversLicense();
        testLicense.setName(name);
        testLicense.setAddress(address);
        testLicense.setDateOfBirth(dateOfBirth);
        testLicense.setIssueDate(issueDate);
        testLicense.setExpirationDate(expirationDate);
        testLicense.setLicenseNumber(licenseNum);
        testLicense.setIssuingState(issuingState);
        testLicense.setEndorsements(endorsements);
        testLicense.setSex(sex);
        testLicense.setHeight(height);
        testLicense.setWeight(weight);
        testLicense.setOrganDonor(organDonor);
        testLicense.setFederallyCompliant(federallyCompliant);
        testLicense.setLicenseClassification(licenseClassification);
        testLicense.setEyeColor(eyeColor);

    }

    @Test
    public void testSerializeToCSV() throws Exception {

        String actualCSVResult = testLicense.serializeToCSV();
        String expectedCSVResult = String.format("%s,%s,%s,%s,%s,%s,%d,%.1f,%s,%s,%b,%b,%tc,%tc,%tc", name, address, licenseNum, endorsements, issuingState, eyeColor, height, weight, licenseClassification, sex, organDonor, federallyCompliant, dateOfBirth,
                issueDate, expirationDate);
        assertEquals("Actual CSV result did not match expectations.", expectedCSVResult, actualCSVResult);
    }

    @Test
    public void testGetCSVHeader() {
        /*
        order: name, address, eyeColor, expectedDOB,expectedIssueDate, expectedExpirationDate,
                licenseNum, issuingState, trump, male, federallyCompliantStatus, licenseClassification
         */
        String expectedHeader = "NAME,ADDRESS,LICENSE NUMBER,ENDORSEMENTS,ISSUING STATE, EYE COLOR,HEIGHT, WEIGHT, LICENSE CLASS, SEX, ORGAN DONOR, FEDERALLY COMPLIANT, DOB, ISSUE DATE,EXPIRATION DATE";

        String actualHeader = DriversLicense.getCSVHeader();

        assertEquals(expectedHeader, actualHeader);
    }

    @Test
    public void deserializedFromCSVTest() {

        String expectedValue = "DriversLicense{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", licenseNumber='" + licenseNum + '\'' +
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
        String actualValue = testLicense.deserializedFromCSV(testLicense.serializeToCSV()).get(0).toString();
        Assert.assertEquals(expectedValue,actualValue);
    }

    /*
    @Test
    public void converterTest(){

    }
    */

}