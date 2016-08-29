import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String location_name;
	public String logo;
	public String description;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String end_time;
	public String organizer_description;
	public String start_time;
	public String state;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public int id;
	public CopyrightModel _copyright;
	public String type;
	public CreatorModel _creator;
	public String name;
	public String background_image;

	public RootModel(String privacy, String location_name, String logo, String description, String organizer_name, String code_of_conduct, String schedule_published_on, String end_time, String organizer_description, String start_time, String state, VersionModel version, Call_for_papersModel call_for_papers, String timezone, String topic, ArrayList<Social_linksModel> social_links, String email, int id, CopyrightModel copyright, String type, CreatorModel creator, String name, String background_image) {

		this.privacy = privacy;
		this.location_name = location_name;
		this.logo = logo;
		this.description = description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.state = state;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.topic = topic;
		this.social_links = social_links;
		this.email = email;
		this.id = id;
		this._copyright = copyright;
		this.type = type;
		this._creator = creator;
		this.name = name;
		this.background_image = background_image;

	}

}