package Model;

public class Person {

    private Long id;
    private String name_person;
    private Integer age;

    public Person(Long id, String name, Integer age) {

        this.id = id;
        this.name_person = name_person;
        this.age = age;
    }

    public String getName() {
        return name_person;
    }

    public void setName(String name_person) {
        this.name_person = name_person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
