import java.util.ArrayList;

class RootModel {

	public String type;
	public String email;
	public CopyrightModel _copyright;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String description;
	public String start_time;
	public String schedule_published_on;
	public String state;
	public String privacy;
	public VersionModel _version;
	public String organizer_description;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String code_of_conduct;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public String end_time;
	public String background_image;

	public RootModel(String type, String email, CopyrightModel copyright, int id, ArrayList<Social_linksModel> social_links, String logo, String description, String start_time, String schedule_published_on, String state, String privacy, VersionModel version, String organizer_description, String timezone, String name, Call_for_papersModel call_for_papers, String organizer_name, String code_of_conduct, String topic, String location_name, CreatorModel creator, String end_time, String background_image) {

		this.type = type;
		this.email = email;
		this._copyright = copyright;
		this.id = id;
		this.social_links = social_links;
		this.logo = logo;
		this.description = description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.privacy = privacy;
		this._version = version;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.end_time = end_time;
		this.background_image = background_image;

	}

}