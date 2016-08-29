import java.util.ArrayList;

class RootModel {

	public String topic;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String code_of_conduct;
	public String organizer_description;
	public String privacy;
	public String location_name;
	public String end_time;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String organizer_name;
	public int id;
	public String timezone;
	public String schedule_published_on;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String state;
	public String background_image;

	public RootModel(String topic, String logo, ArrayList<Social_linksModel> social_links, String name, String code_of_conduct, String organizer_description, String privacy, String location_name, String end_time, CopyrightModel copyright, String type, String description, CreatorModel creator, VersionModel version, String organizer_name, int id, String timezone, String schedule_published_on, String email, Call_for_papersModel call_for_papers, String start_time, String state, String background_image) {

		this.topic = topic;
		this.logo = logo;
		this.social_links = social_links;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.location_name = location_name;
		this.end_time = end_time;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this._creator = creator;
		this._version = version;
		this.organizer_name = organizer_name;
		this.id = id;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.state = state;
		this.background_image = background_image;

	}

}