import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String timezone;
	public CopyrightModel _copyright;
	public String email;
	public String description;
	public String type;
	public String organizer_description;
	public String logo;
	public String state;
	public int id;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String organizer_name;
	public String privacy;
	public String schedule_published_on;
	public String end_time;
	public VersionModel _version;
	public String start_time;
	public String background_image;

	public RootModel(String code_of_conduct, String timezone, CopyrightModel copyright, String email, String description, String type, String organizer_description, String logo, String state, int id, String location_name, ArrayList<Social_linksModel> social_links, String topic, CreatorModel creator, Call_for_papersModel call_for_papers, String name, String organizer_name, String privacy, String schedule_published_on, String end_time, VersionModel version, String start_time, String background_image) {

		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._copyright = copyright;
		this.email = email;
		this.description = description;
		this.type = type;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.state = state;
		this.id = id;
		this.location_name = location_name;
		this.social_links = social_links;
		this.topic = topic;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._version = version;
		this.start_time = start_time;
		this.background_image = background_image;

	}

}