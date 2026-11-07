/*
 * REQ 01: answer both questions after you finish the lab.
 *
 * 1. Work out the tag for dog ID 459 by hand. Show the digit sum,
 *    the character code, and the letter.
 *    Answer:
 *
 * 2. A program builds three dogs and no others, then calls
 *    Dog.getDogsCreated(). What does the call return? What would go
 *    wrong if dogsCreated were not static?
 *    Answer:
 */
public class DogTester {
    public static void main(String[] args) {
        Dog plain = new Dog();

        // getters
        System.out.println("new Dog() name (expect Unnamed): " + plain.getName());
        System.out.println("new Dog() ownerName (expect Unnamed): " + plain.getOwnerName());
        System.out.println("new Dog() age (expect 1): " + plain.getAge());
        System.out.println("new Dog() dogId (expect 100): " + plain.getDogId());
        System.out.println("new Dog() tag (expect 100G): " + plain.getDogTag());
        System.out.println("new Dog() stillInFacility (expect true): " + plain.isStillInFacility());
        // System.out.println("new Dog() dogCreated (expect 1): " +
        // plain.getDogsCreated());

        // setters
        plain.setName("Roxi");
        plain.setAge(5);
        plain.setDogTag("100X");
        plain.setStillInFacility(false);
        // dog.setDogId();

        System.out.println("New name: " + plain.getName());
        System.out.println("New age: " + plain.getAge());
        System.out.println("New tag: " + plain.getDogTag());
        System.out.println("New status: " + plain.isStillInFacility());

        // Tag letters and tags from generateDogChar and generateDogTag.
        System.out.println("Dog character: " + PawesomeUtils.generateDogChar(123));
        System.out.println("Dog tag: " + PawesomeUtils.generateDogTag(123, 'L'));

        // The method validateDogId, with a valid ID and with an invalid one.
        System.out.println("Valid ID: " + PawesomeUtils.validateDogId(123));
        System.out.println("Invalid ID: " + PawesomeUtils.validateDogId(10));

        // The four-parameter constructor, with a valid ID and with an invalid one.
        Dog milo = new Dog("Milo", "Roxana", 9, 123);
        Dog bridget = new Dog("Bridget", "Roxana", 14, 10);

        System.out.println("Milo ID: " + milo.getDogId());
        System.out.println("Milo Tag: " + milo.getDogTag());
        System.out.println("Bridget ID: " + bridget.getDogId());
        System.out.println("Bridget Tag: " + bridget.getDogTag());

        // The method Dog.getDogsCreated(), before and after you build one more dog.
        System.out.println("Dogs created before: " + plain.getDogsCreated());
        Dog newDog = new Dog();
        System.out.println("Dogs created after: " + plain.getDogsCreated());

        // The method setDogId, with a valid ID and with an invalid one.
        milo.setDogId(150);
        System.out.println("New valid ID: " + milo.getDogId());
        System.out.println("New tag: " + milo.getDogTag());

        milo.setDogId(15);
        System.out.println("New ID: " + milo.getDogId());
        System.out.println("New tag: " + milo.getDogTag());

        // The methods toString() and equals(Dog other), with null as one of the dogs
        // passed to equals.
        System.out.println("Description: " + milo.toString());

        Dog dog1 = new Dog("Austin", "Olivia", 5, 250);
        Dog dog2 = new Dog("Austin", "Olivia", 5, 250);
        System.out.println("Equal dogs: " + dog1.equals(dog2));
        System.out.println("Different dogs: " + dog1.equals(milo));
        System.out.println("Null dog: " + dog1.equals(null));

        // The method hasValidTag on a matching tag, a mismatched tag, and null.
        System.out.println("Valid tag: " + PawesomeUtils.hasValidTag(dog1));
        plain.setDogTag("150x");
        System.out.println("Invalid tag: " + PawesomeUtils.hasValidTag(plain));
        System.out.println("Null tag: " + PawesomeUtils.hasValidTag(null));

        // The method pickup with the owner, with someone else, and with null as the
        // dog.
        Dog pickup = new Dog("Bash", "Alex", 5, 345);
        System.out.println("Wrong owner: " + PawesomeUtils.pickup(pickup, "Sam"));
        System.out.println("Correct owner: " + PawesomeUtils.pickup(pickup, "Alex"));
        System.out.println("After pickup: " + pickup.isStillInFacility());
        System.out.println("Null pickup: " + PawesomeUtils.pickup(null, "Alex"));

        // Both age conversion methods.
        System.out.println("Human age: " + PawesomeUtils.convertAgeToHumanAge(new Dog("Goose", "Mila", 5, 456)));
        System.out.println("Dog years: " + PawesomeUtils.convertAgeToDogYears(49));

        // stretch
        System.out.println("Has name: " + PawesomeUtils.hasName(milo));
        System.out.println("Valid dog: " + PawesomeUtils.isValidDog(milo));
    }
}