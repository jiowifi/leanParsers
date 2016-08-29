import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String organizer_description;
	public String email;
	public String privacy;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String location_name;
	public int id;
	public String type;
	public CreatorModel _creator;
	public String end_time;
	public String name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String timezone;
	public String topic;
	public String description;
	public String background_image;

	public RootModel(String organizer_name, String organizer_description, String email, String privacy, String schedule_published_on, Call_for_papersModel call_for_papers, String start_time, String location_name, int id, String type, CreatorModel creator, String end_time, String name, CopyrightModel copyright, String code_of_conduct, String state, VersionModel version, ArrayList<Social_linksModel> social_links, String logo, String timezone, String topic, String description, String background_image) {

		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.location_name = location_name;
		this.id = id;
		this.type = type;
		this._creator = creator;
		this.end_time = end_time;
		this.name = name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this.social_links = social_links;
		this.logo = logo;
		this.timezone = timezone;
		this.topic = topic;
		this.description = description;
		this.background_image = background_image;

	}

}