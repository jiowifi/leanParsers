import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_name;
	public String start_time;
	public String logo;
	public String code_of_conduct;
	public String type;
	public String privacy;
	public String state;
	public CopyrightModel _copyright;
	public String topic;
	public int id;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String description;
	public String location_name;
	public String organizer_description;
	public VersionModel _version;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;

	public RootModel(String schedule_published_on, String timezone, CreatorModel creator, String organizer_name, String start_time, String logo, String code_of_conduct, String type, String privacy, String state, CopyrightModel copyright, String topic, int id, String end_time, Call_for_papersModel call_for_papers, String email, String description, String location_name, String organizer_description, VersionModel version, String name, ArrayList<Social_linksModel> social_links, String background_image) {

		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.privacy = privacy;
		this.state = state;
		this._copyright = copyright;
		this.topic = topic;
		this.id = id;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this._version = version;
		this.name = name;
		this.social_links = social_links;
		this.background_image = background_image;

	}

}