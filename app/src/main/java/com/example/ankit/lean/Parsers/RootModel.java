import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String code_of_conduct;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public VersionModel _version;
	public String topic;
	public String organizer_description;
	public String email;
	public String type;
	public String location_name;
	public CopyrightModel _copyright;
	public String timezone;
	public String start_time;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String privacy;
	public CreatorModel _creator;
	public String end_time;
	public String logo;
	public String description;
	public String background_image;

	public RootModel(String schedule_published_on, String code_of_conduct, int id, ArrayList<Social_linksModel> social_links, String name, VersionModel version, String topic, String organizer_description, String email, String type, String location_name, CopyrightModel copyright, String timezone, String start_time, String organizer_name, Call_for_papersModel call_for_papers, String state, String privacy, CreatorModel creator, String end_time, String logo, String description, String background_image) {

		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.social_links = social_links;
		this.name = name;
		this._version = version;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.email = email;
		this.type = type;
		this.location_name = location_name;
		this._copyright = copyright;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.privacy = privacy;
		this._creator = creator;
		this.end_time = end_time;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;

	}

}