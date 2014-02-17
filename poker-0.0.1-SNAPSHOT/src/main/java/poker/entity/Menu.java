package poker.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author ZhangJingtao
 * 
 */
@Entity
@Table(name = "t_menu", catalog = "poker")
public class Menu implements java.io.Serializable {

	// Fields

	private Long id;
	private Long name;
	private String model;
	private String url;
	private Boolean enabled;
	private Integer order;
	private Long PId;
	private Timestamp creatTime;
	private Long creatorId;
	private String icon;
	private String sign;
	private Set<UserMenuRelation> UserMenuRelation = new HashSet<UserMenuRelation>(
			0);

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** minimal constructor */
	public Menu(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Menu(Long id, Long name, String model, String url, Boolean enabled,
			Integer order, Long PId, Timestamp creatTime, Long creatorId,
			String icon, String sign, Set<UserMenuRelation> UserMenuRelation) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.url = url;
		this.enabled = enabled;
		this.order = order;
		this.PId = PId;
		this.creatTime = creatTime;
		this.creatorId = creatorId;
		this.icon = icon;
		this.sign = sign;
		this.UserMenuRelation = UserMenuRelation;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name")
	public Long getName() {
		return this.name;
	}

	public void setName(Long name) {
		this.name = name;
	}

	@Column(name = "model")
	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Column(name = "url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "enabled")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "order")
	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	@Column(name = "p_id")
	public Long getPId() {
		return this.PId;
	}

	public void setPId(Long PId) {
		this.PId = PId;
	}

	@Column(name = "creat_time", length = 19)
	public Timestamp getCreatTime() {
		return this.creatTime;
	}

	public void setCreatTime(Timestamp creatTime) {
		this.creatTime = creatTime;
	}

	@Column(name = "creator_id")
	public Long getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	@Column(name = "icon")
	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Column(name = "sign")
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "TMenu")
	public Set<UserMenuRelation> getUserMenuRelations() {
		return this.UserMenuRelation;
	}

	public void setTUserMenuRelations(Set<UserMenuRelation> UserMenuRelation) {
		this.UserMenuRelation = UserMenuRelation;
	}

}