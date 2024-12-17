
public class Monkey extends RescueAnimal {
    // Instance variable
    private String species;
    private String height;
    private String tailLength;
    private String bodyLength;

    // Constructor
    public Monkey(String name, String species, String bodyLength, String tailLength, String height, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setGender(gender);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

        // species
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String mSpecies) {
        species = mSpecies;
    }
        
        //height
    public String getHeight() {
        return height;
    }
    public void setHeight(String mHeight) {
        height = mHeight;
    }
        
        // tail length
    public String gettailLength() {
        return tailLength;
    }
    public void setTailLength(String mTailLength) {
        tailLength = mTailLength;
    }
        
        // body length
    public String getBodyLength() {
        return bodyLength;
    }
    public void setBodyLength(String mBodyLength) {
        bodyLength = mBodyLength;
    }


}