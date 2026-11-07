public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private String dogTag;
    private boolean stillInFacility;
    private static int dogsCreated = 0;

    public Dog() {
        name = "Unnamed";
        ownerName = "Unknown";
        age = 1;
        dogId = 100;
        dogTag = "100G";
        stillInFacility = true;
        dogsCreated++;
    }

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = PawesomeUtils.validateDogId(dogId);
        char dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, dogChar);

        this.stillInFacility = true;
        dogsCreated += 1;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAge() {
        return age;
    }

    public int getDogId() {
        return dogId;
    }

    public String getDogTag() {
        return dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public static int getDogsCreated() {
        return dogsCreated;
    }

    public void setDogId(int dogId) {
        this.dogId = PawesomeUtils.validateDogId(dogId);

        char dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, dogChar);

    }

    public String toString() {
        return ownerName + "'s dog is named" + name + " and it's "
                + age + " years old. It's facility status is "
                + stillInFacility + " and its dog tag is " + dogTag;
    }

    public boolean equals(Dog other) {
        if (other == null) {
            return false;
        }

        return name.equals(other.getName()) &&
                ownerName.equals(other.getOwnerName()) && age == other.getAge()
                && dogTag.equals(other.getDogTag()) && stillInFacility == other.isStillInFacility();
    }
}
