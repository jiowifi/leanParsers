import java.util.ArrayList;

class RootModel {

	public String topic;
	public String schedule_published_on;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String type;
	public CreatorModel _creator;
	public String organizer_description;
	public String timezone;
	public String start_time;
	public String name;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String logo;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String location_name;
	public String email;
	public String privacy;
	public int id;
	public String description;
	public String background_image;

	public RootModel(String topic, String schedule_published_on, VersionModel version, ArrayList<Social_linksModel> social_links, String state, String type, CreatorModel creator, String organizer_description, String timezone, String start_time, String name, String end_time, Call_for_papersModel call_for_papers, String code_of_conduct, String logo, String organizer_name, CopyrightModel copyright, String location_name, String email, String privacy, int id, String description, String background_image) {

		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.social_links = social_links;
		this.state = state;
		this.type = type;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.start_time = start_time;
		this.name = name;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.location_name = location_name;
		this.email = email;
		this.privacy = privacy;
		this.id = id;
		this.description = description;
		this.background_image = background_image;

	}

}