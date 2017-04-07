package shared.criteria;


public class MemberCriteria {
	
	private Integer id;

	private String name;

	private String forname;
	
	private String town;

	private String type;

	private String category;
	

	/* constructeurs */
	public MemberCriteria(){
		
	}

	public MemberCriteria(String name){
		this.name = name;
	}
	
	public MemberCriteria(String name,String forname){
		this.name = name;
		this.forname = forname;
	}
	
	/* utility method to check no attribute is null */
	public boolean isEmpty(){
		if(this.id == null && this.name == null && this.forname == null &&
		   this.town == null && this.type == null && this.category == null)
			return true;
		else
			return false;
	}
	
	/* getter and setter */

	
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

	public String getForname() {
		return forname;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}

	
	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	
	
}
