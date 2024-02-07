public class AppOPLabOne {

    public static void main(String[] args) {
        MSPerson msPerson = new MSPerson();

        MSBoy msBoy = new MSBoy();

        MSBoy.School msBoySchool = msBoy.new School("São João","Porto Alegre");

        msBoy.setSchool(msBoy.new School("Anchieta","Canoas"));

        msPerson.scream();
        msBoy.scream();

    }
}


class MSPerson {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void scream(){
        System.out.println("AAAAAAAAAAAAAAAAAAAAA");
    }
}

class MSMan extends MSPerson{
    private int dickSize;

    public int getDickSize() {
        return dickSize;
    }

    public void setDickSize(int dickSize) {
        this.dickSize = dickSize;
    }
}

class MSWoman extends MSPerson{
    private int titSize;

    public int getTitSize() {
        return titSize;
    }

    public void setTitSize(int titSize) {
        this.titSize = titSize;
    }
}

class MSBoy extends MSMan {
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public void scream() {
        System.out.println("I am a booooooyyyyyy");
    }

    class School {
        private String name;
        private String city;

        public School(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}



