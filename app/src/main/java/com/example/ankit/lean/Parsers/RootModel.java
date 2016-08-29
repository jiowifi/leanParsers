import java.util.ArrayList;

class RootModel {

	public String topic;
	public String organizer_description;
	public String end_time;
	public String email;
	public String location_name;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String code_of_conduct;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String logo;
	public String state;
	public String description;
	public String timezone;
	public String start_time;
	public String organizer_name;
	public int id;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String background_image;

	public RootModel(String topic, String organizer_description, String end_time, String email, String location_name, VersionModel version, ArrayList<Social_linksModel> social_links, String privacy, String code_of_conduct, String type, Call_for_papersModel call_for_papers, String name, String logo, String state, String description, String timezone, String start_time, String organizer_name, int id, CopyrightModel copyright, CreatorModel creator, String schedule_published_on, String background_image) {

		this.topic = topic;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.email = email;
		this.location_name = location_name;
		this._version = version;
		this.social_links = social_links;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this._copyright = copyright;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;

	}

}