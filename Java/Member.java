package prog_objetos.library;

import java.util.Objects;

public class Member {
    private String nif;
    private String name;
    private String surname;
    private int membership;
    private int postalCode;


    public Member(String nif, String name, String surname, int membership, int postalCode) {
        this.nif = nif;
        this.name = name;
        this.surname = surname;
        this.membership = membership;
        this.postalCode = postalCode;
    }

    public boolean isFrom (int postalCode){
        return this.postalCode == postalCode;

    }




    public void info() {
        System.out.println("Member: " + name + " " + surname + ". NIF: " + nif + ". Membership: " + membership + ". Postal Code: " + postalCode);
    }

    //-------------------------------------------------------------//

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return membership == member.membership && postalCode == member.postalCode && Objects.equals(nif, member.nif) && Objects.equals(name, member.name) && Objects.equals(surname, member.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname, membership, postalCode);
    }

    @Override
    public String toString() {
        return "Member{" +
                "nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", membership=" + membership +
                ", postalCode=" + postalCode +
                '}';
    }


}
