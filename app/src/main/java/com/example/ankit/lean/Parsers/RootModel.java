import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public int id;
	public String type;
	public String logo;
	public String location_name;
	public String description;
	public String schedule_published_on;
	public String name;
	public String start_time;
	public String code_of_conduct;
	public String organizer_name;
	public String topic;
	public VersionModel _version;
	public String end_time;
	public CreatorModel _creator;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String email;
	public String background_image;

	public RootModel(CopyrightModel copyright, int id, String type, String logo, String location_name, String description, String schedule_published_on, String name, String start_time, String code_of_conduct, String organizer_name, String topic, VersionModel version, String end_time, CreatorModel creator, String privacy, ArrayList<Social_linksModel> social_links, String state, String organizer_description, Call_for_papersModel call_for_papers, String timezone, String email, String background_image) {

		this._copyright = copyright;
		this.id = id;
		this.type = type;
		this.logo = logo;
		this.location_name = location_name;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._version = version;
		this.end_time = end_time;
		this._creator = creator;
		this.privacy = privacy;
		this.social_links = social_links;
		this.state = state;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.email = email;
		this.background_image = background_image;

	}

}