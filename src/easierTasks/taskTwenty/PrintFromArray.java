package easierTasks.taskTwenty;

class PrintFromArray {
    boolean isFound = false;

    private String record(int i) {
        return Person.persons[i].name + " " + Person.persons[i].surname + " " + Person.persons[i].age;
    }

    public void all() {
        fileReadCheck();
        for (int i = 0; i < Person.persons.length; i++) {
            System.out.println(record(i));
        }
    }

    void byName(String name) {
        isFound = false;
        fileReadCheck();

        for (int i = 0; i < Person.persons.length; i++) {
            if (name.equals(Person.persons[i].name)) {
                System.out.println(record(i));
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Asmuo tokiu vardu nerastas.");
        }
    }

    void byNameFirstLetter(char letter) {
        isFound = false;
        fileReadCheck();

        for (int i = 0; i < Person.persons.length; i++) {
            if (letter == Person.persons[i].name.charAt(0)) {
                System.out.println(record(i));
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Asmuo, kurio vardas prasidetu tokia raide, nerastas.");
        }
    }

    void bySurnameFirstLetter(char letter) {
        isFound = false;
        fileReadCheck();

        for (int i = 0; i < Person.persons.length; i++) {
            if (letter == Person.persons[i].surname.charAt(0)) {
                System.out.println(record(i));
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Asmuo, kurio pavarde prasidetu tokia raide, nerastas.");
        }
    }

    void byAge(int age) {
        isFound = false;
        fileReadCheck();

        for (int i = 0; i < Person.persons.length; i++) {
            if (age < Integer.parseInt(Person.persons[i].age)) {
                System.out.println(record(i));
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Asmuo, kurio amzius butu didesnis nei nurodyta, nerastas.");
        }
    }
    void fileReadCheck(){
        if (Person.persons.length == 0) {
            ReadFile.readFile();
        }
    }
}
