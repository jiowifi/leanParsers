import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CreatorModel _creator;
	public String start_time;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String email;
	public String description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String location_name;
	public String schedule_published_on;
	public String timezone;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public VersionModel _version;
	public String logo;
	public String topic;
	public String organizer_name;
	public String name;
	public String background_image;

	public RootModel(String end_time, CreatorModel creator, String start_time, String code_of_conduct, CopyrightModel copyright, String organizer_description, String email, String description, String state, Call_for_papersModel call_for_papers, String privacy, String location_name, String schedule_published_on, String timezone, int id, ArrayList<Social_linksModel> social_links, String type, VersionModel version, String logo, String topic, String organizer_name, String name, String background_image) {

		this.end_time = end_time;
		this._creator = creator;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.name = name;
		this.background_image = background_image;

	}

}