import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public VersionModel _version;
	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String location_name;
	public String timezone;
	public String privacy;
	public String logo;
	public String name;
	public String type;
	public String organizer_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String topic;
	public int id;
	public String end_time;
	public String background_image;

	public RootModel(String schedule_published_on, CopyrightModel copyright, String code_of_conduct, ArrayList<Social_linksModel> social_links, String organizer_description, VersionModel version, String email, String start_time, CreatorModel creator, String location_name, String timezone, String privacy, String logo, String name, String type, String organizer_name, String description, Call_for_papersModel call_for_papers, String state, String topic, int id, String end_time, String background_image) {

		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._version = version;
		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.location_name = location_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.logo = logo;
		this.name = name;
		this.type = type;
		this.organizer_name = organizer_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.topic = topic;
		this.id = id;
		this.end_time = end_time;
		this.background_image = background_image;

	}

}