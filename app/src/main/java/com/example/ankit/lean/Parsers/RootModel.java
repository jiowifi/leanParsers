import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String email;
	public String schedule_published_on;
	public String description;
	public String code_of_conduct;
	public String topic;
	public int id;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String state;
	public String privacy;
	public String location_name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String organizer_name;
	public String name;
	public String organizer_description;
	public String logo;
	public String type;
	public String background_image;

	public RootModel(String timezone, String email, String schedule_published_on, String description, String code_of_conduct, String topic, int id, VersionModel version, CopyrightModel copyright, String state, String privacy, String location_name, String start_time, ArrayList<Social_linksModel> social_links, String end_time, Call_for_papersModel call_for_papers, CreatorModel creator, String organizer_name, String name, String organizer_description, String logo, String type, String background_image) {

		this.timezone = timezone;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.id = id;
		this._version = version;
		this._copyright = copyright;
		this.state = state;
		this.privacy = privacy;
		this.location_name = location_name;
		this.start_time = start_time;
		this.social_links = social_links;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.name = name;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.type = type;
		this.background_image = background_image;

	}

}