import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String type;
	public String logo;
	public VersionModel _version;
	public CreatorModel _creator;
	public String topic;
	public String state;
	public String description;
	public String location_name;
	public String start_time;
	public String code_of_conduct;
	public String organizer_description;
	public String name;
	public CopyrightModel _copyright;
	public String privacy;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String timezone;
	public String schedule_published_on;
	public String background_image;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, int id, String type, String logo, VersionModel version, CreatorModel creator, String topic, String state, String description, String location_name, String start_time, String code_of_conduct, String organizer_description, String name, CopyrightModel copyright, String privacy, String email, ArrayList<Social_linksModel> social_links, String organizer_name, String timezone, String schedule_published_on, String background_image) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.type = type;
		this.logo = logo;
		this._version = version;
		this._creator = creator;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this.location_name = location_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.name = name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.email = email;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;

	}

}