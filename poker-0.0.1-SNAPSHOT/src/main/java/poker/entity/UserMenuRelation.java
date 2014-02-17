package poker.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author ZhangJingtao
 */
@Entity
@Table(name = "t_user_menu_relation", catalog = "poker")
public class UserMenuRelation implements java.io.Serializable {

	// Fields

	private UserMenuRelationId id;
	private Menu TMenu;
	private User TUser;

	// Constructors

	/** default constructor */
	public UserMenuRelation() {
	}

	/** minimal constructor */
	public UserMenuRelation(UserMenuRelationId id) {
		this.id = id;
	}

	/** full constructor */
	public UserMenuRelation(UserMenuRelationId id, Menu TMenu, User TUser) {
		this.id = id;
		this.TMenu = TMenu;
		this.TUser = TUser;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "uid", column = @Column(name = "uid")),
			@AttributeOverride(name = "mid", column = @Column(name = "mid")),
			@AttributeOverride(name = "lastUpdate", column = @Column(name = "last_update", length = 19)) })
	public UserMenuRelationId getId() {
		return this.id;
	}

	public void setId(UserMenuRelationId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mid", insertable = false, updatable = false)
	public Menu getMenu() {
		return this.TMenu;
	}

	public void setMenu(Menu TMenu) {
		this.TMenu = TMenu;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid", insertable = false, updatable = false)
	public User getUser() {
		return this.TUser;
	}

	public void setUser(User TUser) {
		this.TUser = TUser;
	}

}