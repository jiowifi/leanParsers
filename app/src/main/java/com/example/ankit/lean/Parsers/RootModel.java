import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String organizer_name;
	public String description;
	public String state;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String privacy;
	public VersionModel _version;
	public String code_of_conduct;
	public String start_time;
	public String email;
	public CreatorModel _creator;
	public String type;
	public CopyrightModel _copyright;
	public String background_image;
	public String organizer_description;
	public String logo;
	public String timezone;
	public String topic;

	public RootModel(String end_time, String schedule_published_on, Call_for_papersModel call_for_papers, int id, String organizer_name, String description, String state, String name, ArrayList<Social_linksModel> social_links, String location_name, String privacy, VersionModel version, String code_of_conduct, String start_time, String email, CreatorModel creator, String type, CopyrightModel copyright, String background_image, String organizer_description, String logo, String timezone, String topic) {

		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.organizer_name = organizer_name;
		this.description = description;
		this.state = state;
		this.name = name;
		this.social_links = social_links;
		this.location_name = location_name;
		this.privacy = privacy;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.email = email;
		this._creator = creator;
		this.type = type;
		this._copyright = copyright;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.timezone = timezone;
		this.topic = topic;

	}

}