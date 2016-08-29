import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String name;
	public String type;
	public String topic;
	public String schedule_published_on;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public VersionModel _version;
	public String description;
	public String email;
	public String organizer_name;
	public String logo;
	public String location_name;
	public String timezone;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String state;
	public String privacy;
	public String background_image;

	public RootModel(String organizer_description, String name, String type, String topic, String schedule_published_on, String end_time, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, int id, String code_of_conduct, String start_time, VersionModel version, String description, String email, String organizer_name, String logo, String location_name, String timezone, CopyrightModel copyright, CreatorModel creator, String state, String privacy, String background_image) {

		this.organizer_description = organizer_description;
		this.name = name;
		this.type = type;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._version = version;
		this.description = description;
		this.email = email;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.location_name = location_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this._creator = creator;
		this.state = state;
		this.privacy = privacy;
		this.background_image = background_image;

	}

}