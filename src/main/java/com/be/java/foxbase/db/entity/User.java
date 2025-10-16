@Entity
@Table(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @Column(name = "username", nullable = false, unique = true, length = 255)
    String username;

    @Column(nullable = false)
    String password;

    String email;
    String fName;
    String lName;
    Long balance;
    String avatar;
}
