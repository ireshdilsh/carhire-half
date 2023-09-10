package entity;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "UserID",nullable = false)
    private Integer id;

    @Column(name = "Name",length = 20,nullable = false)
    private String name;

    @Column(name = "Address",nullable = false)
    private String address;

    @Column(name ="Email" ,nullable = false)
    private String email;

    @Column(name = "Username",length = 10,nullable = false)
    private String username;

    @Column(name = "Password",length = 8,nullable = false)
    private String password;

    public UserEntity() {
    }

    public UserEntity( String name, String address, String email, String username, String password) {

        this.name = name;
        this.address = address;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
