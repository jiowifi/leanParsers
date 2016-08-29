import java.util.ArrayList;

class RootModel {

	public String topic;
	public int id;
	public CreatorModel _creator;
	public String start_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public VersionModel _version;
	public String state;
	public String location_name;
	public String type;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String organizer_description;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String logo;
	public String end_time;
	public String code_of_conduct;
	public String privacy;
	public String name;
	public String background_image;

	public RootModel(String topic, int id, CreatorModel creator, String start_time, String schedule_published_on, Call_for_papersModel call_for_papers, String description, VersionModel version, String state, String location_name, String type, CopyrightModel copyright, String organizer_name, String organizer_description, String timezone, ArrayList<Social_linksModel> social_links, String email, String logo, String end_time, String code_of_conduct, String privacy, String name, String background_image) {

		this.topic = topic;
		this.id = id;
		this._creator = creator;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._version = version;
		this.state = state;
		this.location_name = location_name;
		this.type = type;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.social_links = social_links;
		this.email = email;
		this.logo = logo;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.name = name;
		this.background_image = background_image;

	}

}