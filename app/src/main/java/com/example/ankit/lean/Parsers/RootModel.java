import java.util.ArrayList;

class RootModel {

	public String topic;
	public String end_time;
	public String type;
	public String organizer_name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String state;
	public String name;
	public String privacy;
	public String timezone;
	public String location_name;
	public String description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String logo;
	public String schedule_published_on;
	public String email;
	public String background_image;

	public RootModel(String topic, String end_time, String type, String organizer_name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, int id, String organizer_description, CreatorModel creator, VersionModel version, String state, String name, String privacy, String timezone, String location_name, String description, String code_of_conduct, Call_for_papersModel call_for_papers, String start_time, String logo, String schedule_published_on, String email, String background_image) {

		this.topic = topic;
		this.end_time = end_time;
		this.type = type;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.id = id;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._version = version;
		this.state = state;
		this.name = name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.location_name = location_name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.background_image = background_image;

	}

}