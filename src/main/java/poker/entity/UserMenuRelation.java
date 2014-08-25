package poker.entity;

import javax.persistence.*;

/**
 * @author ZhangJingtao
 */
@Entity
@Table(name = "t_user_menu_relation", catalog = "poker")
public class UserMenuRelation implements java.io.Serializable {

    // Fields

    private UserMenuRelationId id;
    private Menu Menu;
    private User User;

    // Constructors

    /**
     * default constructor
     */
    public UserMenuRelation() {
    }

    /**
     * minimal constructor
     */
    public UserMenuRelation(UserMenuRelationId id) {
        this.id = id;
    }

    /**
     * full constructor
     */
    public UserMenuRelation(UserMenuRelationId id, Menu Menu, User User) {
        this.id = id;
        this.Menu = Menu;
        this.User = User;
    }

    // Property accessors
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "uid", column = @Column(name = "uid")),
            @AttributeOverride(name = "mid", column = @Column(name = "mid")),
            @AttributeOverride(name = "lastUpdate", column = @Column(name = "last_update", length = 19))})
    public UserMenuRelationId getId() {
        return this.id;
    }

    public void setId(UserMenuRelationId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mid", insertable = false, updatable = false)
    public Menu getMenu() {
        return this.Menu;
    }

    public void setMenu(Menu Menu) {
        this.Menu = Menu;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid", insertable = false, updatable = false)
    public User getUser() {
        return this.User;
    }

    public void setUser(User User) {
        this.User = User;
    }

}