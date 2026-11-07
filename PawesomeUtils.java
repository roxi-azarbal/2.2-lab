public class PawesomeUtils {
    public static char generateDogChar(int dogId) {
        int sum = 0;
        int length = dogId;
        for (int i = 0; i < length; i++) {
            sum += dogId % 10;
            dogId /= 10;
        }

        return (char) (70 + (sum % 10));

        // String str = "1234";
        // Character.isDigit(str.charAt(0));
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return "" + dogId + dogChar;
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        }
        return (int) (Math.random() * 999) + 100;
    }

    public static boolean hasValidTag(Dog dog) {
        if (dog == null) {
            return false;
        }

        int id = dog.getDogId();
        char letter = generateDogChar(id);

        String correctTag = generateDogTag(id, letter);
        return correctTag.equals(dog.getDogTag());
    }

    public static String pickup(Dog dog, String person) {
        if (dog == null) {
            return "there is no dog.";
        }

        if (person.equals(dog.getOwnerName())) {
            dog.setStillInFacility(false);
            return dog.getName() + " has left.";
        }

        return "the dog can't leave because " + person + " is not the owner of " + dog.getName() + ".";
    }

    public static int convertAgeToHumanAge(Dog dog) {
        int dogAge = dog.getAge();

        if (dogAge == 1) {
            return 15;
        }
        if (dogAge == 2) {
            return 24;
        }
        return 24 + 5 * (dogAge - 2);
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        }

        if (humanYears <= 24) {
            return 2;
        }

        return 2 + (humanYears - 24) / 5;
    }

    // stretch:

    public static boolean hasName(Dog dog) {
        return dog != null && dog.getName() != null && dog.getName().length() > 0;
    }

    public static boolean isValidDog(Dog dog) {
        return dog != null && hasName(dog) && dog.getAge() >= 0 && dog.getAge() <= 25 && dog.getDogId() >= 100
                && dog.getDogId() <= 999 && hasValidTag(dog);
    }
}
