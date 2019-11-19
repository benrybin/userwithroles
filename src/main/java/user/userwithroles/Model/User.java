package user.userwithroles.Model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String pw;
    @Size(min =6,message ="Minimum UserName length: 6 characters")
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String emailAddress;
    private String profilePic;
    private String intro;
    private String timeZone;
    private String language;
    private Boolean mic;
    private String discordName;
    private String steamName;


}
