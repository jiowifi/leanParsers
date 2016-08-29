import java.util.ArrayList;

class RootModel {

	public String description;
	public String privacy;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public VersionModel _version;
	public String location_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String end_time;
	public String logo;
	public String organizer_name;
	public String email;
	public String topic;
	public CopyrightModel _copyright;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String start_time;
	public String type;
	public String code_of_conduct;
	public int id;
	public String background_image;

	public RootModel(String description, String privacy, String state, ArrayList<Social_linksModel> social_links, String organizer_description, VersionModel version, String location_name, String schedule_published_on, CreatorModel creator, String end_time, String logo, String organizer_name, String email, String topic, CopyrightModel copyright, String timezone, Call_for_papersModel call_for_papers, String name, String start_time, String type, String code_of_conduct, int id, String background_image) {

		this.description = description;
		this.privacy = privacy;
		this.state = state;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._version = version;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.end_time = end_time;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.email = email;
		this.topic = topic;
		this._copyright = copyright;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.start_time = start_time;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.background_image = background_image;

	}

}