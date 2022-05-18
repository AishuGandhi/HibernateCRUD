import java.sql.Date;

class Address
{

    String addressLine;

    String city;

    String zip;

}

class NaturalPerson

{

    Integer id;

    String name;

    Date dateOfBirth;

    Integer age;

    Address address;

}

class LegalPerson extends NaturalPerson

{
    Integer numberOfEmployees;
}